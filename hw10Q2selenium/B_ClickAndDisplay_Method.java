package hw10Q2selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class B_ClickAndDisplay_Method {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "/Users/jannatulnayeem/eclipse-workspace2/SeleniumMethods/driver/chromedriver");
		driver= new ChromeDriver();
		driver.get("https://www.apple.com/");
		driver.manage().window().maximize();
	}
	
	@Test (enabled= true, priority=1)
	public void click() {
		driver.findElement(By.xpath("//nav[@id=\"ac-globalnav\"]/div/ul[2]/li[3]/a")).click(); // Click on Mac boolean 
		
	}
	
	@Test (enabled= true, priority=2)
	public void display() {
		driver.findElement(By.xpath("//a[@id=\"ac-gn-firstfocus\"]")).isDisplayed(); // apple logo is displayed or not- boolean
	}
	
	@AfterTest
	public void tearUp() {
		driver.quit();
		
	}
	
}
