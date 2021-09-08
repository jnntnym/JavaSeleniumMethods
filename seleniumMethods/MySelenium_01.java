package seleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MySelenium_01 {
	
WebDriver driver;
	
	@BeforeTest
	public void setup() throws InterruptedException {
	//	System.setProperty("webdriver.chrome.driver", "/Users/jannatulnayeem/Desktop/Setup/driver/chromedriver");
		System.setProperty("webdriver.chrome.driver", "/Users/jannatulnayeem/eclipse-workspace2/SeleniumMethods/driver/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://portaldev.cms.gov/portal/");
		Thread.sleep(3000);
	}
	
	@Test
	public void logIn() throws InterruptedException {
		driver.findElement(By.id("cms-login-submit")).click();
		Thread.sleep(3000);
	}
	
	@AfterTest
	public void tearUp() {
		driver.quit();
	}


}
