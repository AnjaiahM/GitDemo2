package selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class selenium_string {
	public WebDriver driver=null;
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
	driver.manage().window().maximize();
	WebElement uname=driver.findElement(By.xpath("//input[@type='text' and @placeholder='Username']"));
	uname.sendKeys("AA");
	
	Thread.sleep(300);
	WebElement paswrd=driver.findElement(By.xpath("//input[@name='inputPassword']"));
	paswrd.sendKeys("lklkl");
	
	List<WebElement> che= driver.findElements(By.xpath("//input[@type='checkbox']"));
	Iterator<WebElement> it=che.iterator();
	while(it.hasNext()) {
		it.next().click();
	}
	Thread.sleep(200);
	driver.findElement(By.className("submit")).click();
	Thread.sleep(3000);
	String err="";
	WebElement er=driver.findElement(By.xpath("//p[contains(text(),'* Incorrect ')]"));
	if(er.isDisplayed()) {
	 err=er.getText();
	 
	System.out.println(err);
	}
	
	Assert.assertEquals(err, "* Incorrect username or password");
	
	
	driver.findElement(By.xpath("// a[text()='Forgot your password?']")).click();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3000));
	Thread.sleep(3000);
	driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	
	String dynamipass="";
	WebElement dynamipassword=driver.findElement(By.cssSelector("p.infoMsg"));
	if(!dynamipassword.isDisplayed()) {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3000));
	}
	if(dynamipassword.isDisplayed()) {
		dynamipass=dynamipassword.getText();
		
	}
	System.out.println(dynamipass);
	
	Assert.assertEquals(dynamipass, "Please use temporary password 'rahulshettyacademy' to Login.");
	
	String[] temppassword=dynamipass.split("'");
	
	for(int i=0;i<temppassword.length;i++) {
		System.out.println(temppassword[i]);
	}
	
	//System.out.println(temppassword);
	System.out.println(temppassword[1]);
	
	
	WebElement loginagain=driver.findElement(By.xpath("//button[starts-with(@class,'go-to-l')]"));
	loginagain.click();
	
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3000));
	
	uname.sendKeys("aaa9@gmail.com");
	paswrd.sendKeys(temppassword[1]);
	Thread.sleep(300);
	driver.findElement(By.className("submit")).click();
	Thread.sleep(3000);
	String successmsg=driver.findElement(By.xpath("//button[starts-with(@class,'logout-btn')]/preceding-sibling::p")).getText();
	System.out.println(successmsg);
	
}
public void sendData(WebElement ele,String str) {
	driver.findElement(By.xpath(str)).sendKeys(str);
}
}
