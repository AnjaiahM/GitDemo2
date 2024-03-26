package rahularora;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class linkscount  {
public   static WebDriver driver;
	

	public static  boolean isElementPresent(By by) {
//		
//+		try {
			
//		driver.findElement(by);
//				return true;
//			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			return false;
//		}
		
		
		int size=driver.findElements(by).size();
	     if(size==0) {
	    	 return false;
	     }	else
	    	 return true;
//		
	}
	

	@Test
	public  static void cout_Link() {
		 driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org");
		driver.manage().window().maximize();
		 System.out.println( isElementPresent(By.cssSelector("div.other-projects")));
		 WebElement linkblock=driver.findElement(By.cssSelector("div.other-projects"));
		
	List<WebElement> lin=	linkblock.findElements(By.tagName("a"));
	
	System.out.println(lin.stream().count());
	//lin.stream().forEach(p->System.out.println(p.getText()));
	
	lin.stream().forEach(p->System.out.println(p.getText()+" link is "+p.getAttribute("href")));
	
	
		}
}
