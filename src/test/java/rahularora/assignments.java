package rahularora;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import selenium.chromedriver;

public class assignments {
public static  WebDriver driver;

public static String a1="https://www.google.com";

public static boolean isElementpresent(By by) {
	int size=driver.findElements(by).size();
	if(size>0) {
		return true;
	}else
		return false;
	
}

public static void clickele(By by) {
	isElementpresent(by);
	driver.findElement(by).click();
}
public static void sendKeys(By by,String str) {
	isElementpresent(by);
	driver.findElement(by).sendKeys(str);;
}



public static void openBrowser(String as) {
	driver=new ChromeDriver();
	driver.get(as);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
}
	//@Test

public static void main(String[] args) {
	openBrowser(a1);
	sendKeys(By.xpath("(//textarea)[1]"),"way2automation");
	
	clickele(By.xpath("(//input[@value='Google Search'])[2]"));clickele(By.xpath("(//h3)[1]"));
	List<WebElement> links= driver.findElements(By.tagName("a"));
	System.out.println(links.stream().count());
	for(WebElement l:links) {
		
			System.out.println(l.getText()+"link is "+l.getAttribute("href"));
			
			
			
		
	}
	
	
}
	public void assignmnt1_wa2automationsearch(String a1) {
		//openBrowser(a1);
	//	isElementpresent(By.xpath(""));
	}
	
	@Test
	public void ass2() {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.way2automation.com/way2auto_jquery/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(RelativeLocator.with(By.cssSelector("[name=name]")).toRightOf(By.tagName("label"))).sendKeys("anjaiahmarha");
		driver.findElement(RelativeLocator.with(By.xpath("(//input[@class='button'])[2]")).toRightOf(By.xpath("//a[text()='Signin']"))).click();
	}
	
	@Test
	public void ass3() {
		Random r=new Random();
		int ii=r.nextInt()*100;
		
		
	System.out.println(	ZonedDateTime.now());
	
	ZonedDateTime zonetime=ZonedDateTime.now();
	
	
	WebDriver driver=new FirefoxDriver();
		driver.get("https://timesofindia.indiatimes.com/poll.cms");
		driver.manage().window().maximize();
		
		String data= driver.findElement(By.xpath("//span[@id='mathq2']")).getText();
		System.out.println(data);
		String[] dataarr= data.split("=");
		System.out.println(dataarr[0]);
		
		
		char c1,c2;
		int i=0;
		String b= dataarr[0];
		
		String[] kk=b.split(" ");
		
		System.out.println(kk[0]);
		System.out.println(kk[2]);
	int e1=Integer.parseInt( kk[0].toString());
	int e2=Integer.parseInt( kk[2].toString());
	
		
	         
	
		driver.findElement(By.xpath("//input[@id='mathuserans2']")).sendKeys(Integer.toString(e1+e2));     //String.valueOf(e1+e2)
		if(driver instanceof chromedriver || driver instanceof FirefoxDriver) {
		//element screenshot
		File src= driver.findElement(By.xpath("//input[@id='mathuserans2']")).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File(".//ScreenShot//Auto_adding_ele"+ii+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		//driver screenshot entirepage
		if( driver instanceof chromedriver || driver instanceof FirefoxDriver) {
	File pagescree=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(pagescree, new File(".//ScreenShot//pagescreenshot"+ii+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		//full page screenshot
		if(driver instanceof FirefoxDriver) {
		File fypage= ((FirefoxDriver) driver).getFullPageScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(fypage, new File(".//ScreenShot//fullpage"+ii+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
//		for( i=0;i<b.length();i++) {
////			System.out.println(b.charAt(0));
////			System.out.println(b.charAt(2));
//		}		
//		
//		 c1=b.charAt(0);
//		String p1= Integer.toString(c1);
//		c2=b.charAt(4);
//		String p2= Integer.toString(c1);
//		
//		System.out.println(p1+p2);
//		
//		System.out.println(c1);
//		System.out.println(c2);
//		
//		System.out.println(c1+c2);
//		
//		int cc=c1+c2;
//		
//	String total=	Integer.toString(cc);
		
		
		
		
		
		//System.out.println(" int "+i1);
		
	}

}
