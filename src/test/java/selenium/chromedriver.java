package selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

public class chromedriver {

	public static void main(String[] args) throws InterruptedException {
		//chrome
		
//		ChromeOptions cop=new ChromeOptions();
//		cop.setBrowserVersion("121");
//		WebDriver driver=new ChromeDriver(cop);
		
		//firefox browser
		
//		FirefoxOptions cop=new FirefoxOptions();
//		cop.setBrowserVersion("125");
//		WebDriver driver=new  FirefoxDriver(cop);
		
//		EdgeOptions cop=new EdgeOptions();
//		cop.setBrowserVersion("116");
		
		WebDriver driver=  new  EdgeDriver();
		for(int i=0;i<=3;i++) {
			
			driver.get("https://www.google.com");
			driver.navigate().to("https://www.facebook.com");
			Thread.sleep(3000);
			driver.navigate().forward();
			Thread.sleep(2000);
			driver.navigate().back();
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		
		//safari
//		SafariOptions sa=new SafariOptions();
//		//sa.set
//		WebDriver driver1=  new  SafariDriver();
//		driver.get("https://www.google.com");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
//		
		
		
	}
}
