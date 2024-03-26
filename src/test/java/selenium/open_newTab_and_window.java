package selenium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class open_newTab_and_window {

	
	@Test
	public void newtab() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		//new tab
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.gmail.com");
		
		String s1=driver.getWindowHandle();
		System.out.println(s1);
		String c1="";
		Set<String> all= driver.getWindowHandles();
		Iterator<String> ii=all.iterator();
		
		List<String> al=new ArrayList<String>();
		while(ii.hasNext()) {
			//c1=ii.next();
			al.add(ii.next());
			
			
			//driver.switchTo().window(c1);
			//break;
		}
		System.out.println(al.size());
		System.out.println(driver.switchTo().window(al.get(0)));
		System.out.println(driver.getTitle());
		driver.close();
		
		System.out.println(driver.switchTo().window(al.get(1)));
		System.out.println(driver.getTitle());
		driver.quit();
		//driver.switchTo().window("9134468749B41A6B533A49BEB9CA8E2F");
		//driver.switchTo().defaultContent();
		
//		//new window
//		
//		driver.switchTo().newWindow(WindowType.WINDOW);
//		driver.get("https://www.facebook.com");
//		driver.manage().window().minimize();
		
	}
}
