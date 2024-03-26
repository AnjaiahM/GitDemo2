package selenium;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class basic_Auth {
	@Test
public void basi_Auth() {
	WebDriver driver=new ChromeDriver();
	
	((HasAuthentication)driver).register(UsernameAndPassword.of("admin", "admin"));
	driver.get("https://the-internet.herokuapp.com/basic_auth");
	//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	driver.manage().window().maximize();
	
}
}
	