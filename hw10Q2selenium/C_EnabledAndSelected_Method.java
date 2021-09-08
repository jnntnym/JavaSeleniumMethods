package hw10Q2selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C_EnabledAndSelected_Method {
	
	
WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "/Users/jannatulnayeem/eclipse-workspace2/SeleniumMethods/driver/chromedriver");
		driver= new ChromeDriver();
		driver.get("https://www.apple.com/");
		driver.manage().window().maximize();
	}
	
	@Test (enabled= true, priority=1)
	public void enabled() {
		driver.findElement(By.xpath("//nav[@id=\"ac-globalnav\"]/div/ul[2]/li[2]/a[1]")).isEnabled(); // web element enabled or disabled
		
	}
	
	@Test (enabled= true, priority=2)
	public void selected() {
		driver.navigate().to("https://portaldev.cms.gov/portal/");
		driver.findElement(By.xpath("//label[@id='cms-label-tc']")).click();
		driver.findElement(By.xpath("//label[@id='cms-label-tc']")).isSelected();	// isSelected
	}
	
	@AfterTest
	public void tearUp() {
		driver.quit();
		
	}

}
