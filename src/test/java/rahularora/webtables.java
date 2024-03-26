package rahularora;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtables {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://money.rediff.com/gainers/bsc/daily/groupa");
//	driver.get(driver.navigate().to("https://money.rediff.com/gainers/bsc/daily/groupa"));
	driver.get(driver.getCurrentUrl());
	driver.manage().window().maximize();
	
	List<WebElement> rows=driver.findElements(By.xpath("(//tbody)[1]/tr"));
	List<WebElement> col=driver.findElements(By.xpath("(//tbody)[1]/tr[1]/td"));
	int count=0;
	for(int i=1;i<rows.size();i++) {
		//System.out.println("(//tbody)[1]/tr"+"["+i+"]");
		//System.out.println( rows.get(i).getText());
		if(i==5) {
			break;
		}
		for(int j=1;j<col.size();j++) {
			System.out.print(driver.findElement(By.xpath("(//tbody)[1]/tr["+i+"]/td["+j+"]")).getText()+" ");   
			
		}
		System.out.println();
	}
}
}
