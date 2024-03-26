package rahularora;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

public class relativeloc {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.way2automation.com/way2auto_jquery/index.php");
	int a=650,b=650;
	Dimension dim=new Dimension(a, b);
	//driver.manage().window().setSize(dim);
	driver.manage().window().fullscreen();
	//driver.manage().window().maximize();
	
	//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3000));
	
	Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
			.withTimeout(Duration.ofSeconds(3000))
			.pollingEvery(Duration.ofSeconds(3))
			.withMessage("user defined time out after 30 seconds")
			.ignoring(NoSuchElementException.class);
	WebElement name=driver.findElement(with(By.tagName("input")).above(By.xpath("//label[text()='Phone:']/following-sibling::input")));
	
	name.sendKeys("anjnajna");
	
	Thread.sleep(300);
	WebElement pho=driver.findElement(with(By.xpath("//label[text()='Phone:']/following-sibling::input")).toRightOf(By.tagName("label")));
	pho.sendKeys("9999");
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[text()='Email:']")));
	WebElement email=driver.findElement(with(By.xpath("//label[text()='Email:']/following-sibling::input")).below(By.tagName("label")));
	email.sendKeys("a@gmail.com");
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='Country:']/following-sibling::select")));
	
	WebElement sel=driver.findElement(By.cssSelector("[name=country]"));
	Select se=new Select(sel);
	//se.selectByVisibleText("Japan");
	
	 WebElement gwe= se.getWrappedElement();
	 
	 System.out.println(gwe);
	 List<WebElement> ss= se.getOptions();
	 System.out.println(ss.size());
//	for(WebElement e:ss) {
//		System.out.println(e.getText());
//	}
     
	 ss.stream().forEach(p->System.out.println(p.getText()));
		for(WebElement e:ss) {
		if(e.getText()   .equals("Japan")) {
			e.click();
		}
	}
  
	 
	 
	 List<WebElement>  labels= driver.findElements(with(By.xpath("//fieldset/label")).below(By.xpath("(//h3)[3]")));
	 labels.stream().forEach(p->System.out.println(p.getText()));
	
	
	
	driver.quit();
	
	
	
	
	
	//driver.close();
	//driver.quit();
	
}
}
