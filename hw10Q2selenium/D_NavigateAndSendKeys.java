package hw10Q2selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D_NavigateAndSendKeys {
	
WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "/Users/jannatulnayeem/eclipse-workspace2/SeleniumMethods/driver/chromedriver");
		driver= new ChromeDriver();
		driver.get("https://www.apple.com/");
		driver.manage().window().maximize();
	}
	
	@Test (enabled= true, priority=1)
	public void navigate() {
		driver.navigate().to("https://www.facebook.com/");
		
	}
	
	@Test (enabled= true, priority=2)
	public void sendkeys() {
		driver.findElement(By.xpath("//input[@placeholder='Email or Phone Number']")).sendKeys("abc123@gmail.com"); 
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Nayeem123#"); 
		driver.findElement(By.xpath("//button[@name='login']")).click(); 
		
	}
	
	@AfterTest
	public void tearUp() {
		driver.quit();
		
	}
	
}
