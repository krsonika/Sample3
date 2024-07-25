package TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import PageObjectModule.Login;

public class TestCase_001 extends BaseClass{
	
	
	@Test
	
 
	public void Logging() {
		 	
		driver.get(fromPropertyFile("baseURL"));
		
		Login lp=new Login(driver);
		lp.Login( fromPropertyFile("userName"),  fromPropertyFile("password"));
	}

}
