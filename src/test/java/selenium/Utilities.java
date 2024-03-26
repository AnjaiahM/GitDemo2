package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utilities {
	public   WebDriver driver;
	

	public  boolean isElementPresent(By by) {
		
		try {
			driver=new ChromeDriver();
		driver.findElement(by);
				return true;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
}
