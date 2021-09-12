package hw10Q2selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class E_ClearAndSendKeysReturn_Method {
	
WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "/Users/jannatulnayeem/eclipse-workspace2/SeleniumMethods/driver/chromedriver");
		driver= new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
	}
	
		// "Search" any item by sending value in search field and clicking the "Search"
		// button from webPage
		@Test(enabled = true, priority = 1)
		public void searchItemByclick() throws InterruptedException {
			driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("laptop");
			driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).clear();

		}

		// "Search" any item by sending value in search field and clicking "Enter"
		// button from keyboard
		@Test(enabled = true, priority = 2)
		public void searchItemByKeysEnter() {
			driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("watch", Keys.ENTER);

		}

		@AfterTest
		public void tearUp() {
			driver.quit(); // To close all the opened WebDriver instances
		}
}
