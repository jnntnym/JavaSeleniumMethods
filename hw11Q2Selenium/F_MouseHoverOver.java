package hw11Q2Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class F_MouseHoverOver {

WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "/Users/jannatulnayeem/eclipse-workspace2/SeleniumMethods/driver/chromedriver");
		driver= new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
	}
	
		@Test(enabled = true, priority = 1)
		public void mouseHoverActionOnElectronics() throws InterruptedException {
			Actions actions = new Actions(driver); 
			WebElement elecTronics = driver.findElement(By.xpath("//div[@id=\"mainContent\"]/div[1]/ul/li[5]/a"));
			Thread.sleep(2000);
			actions.moveToElement(elecTronics).build().perform();
			Thread.sleep(4000);	
			
			System.out.println("\nThe text of this web element is: "+elecTronics.getText());
		}
		
		@AfterTest
		public void tearUp() {
			driver.quit();
		}
	
}
