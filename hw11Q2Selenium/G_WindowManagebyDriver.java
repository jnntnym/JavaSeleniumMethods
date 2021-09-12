package hw11Q2Selenium;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class G_WindowManagebyDriver {

WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "/Users/jannatulnayeem/eclipse-workspace2/SeleniumMethods/driver/chromedriver");
		driver= new ChromeDriver();
		
	}
	
	@Test(enabled = true, priority = 1)
	public void maximizeWindow() throws InterruptedException {
		driver.get("https://www.ebay.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
	}
	
	@Test(enabled = true, priority = 2)
	public void fullScreenWindow() throws InterruptedException {
		driver.get("https://www.amazon.com/");		
		Thread.sleep(3000);
		driver.manage().window().fullscreen();
	}
	
	@Test(enabled = true, priority = 3)
	public void sizeOfWindow() throws InterruptedException {
		driver.get("https://www.bestbuy.com/");		
		Thread.sleep(3000);
		driver.manage().window().fullscreen();		
		System.out.println("The size of the screen (test-3) is: "+ driver.manage().window().getSize());
	}
	
	@Test(enabled = true, priority = 4)
	public void deleteCookies() throws InterruptedException {
		driver.get("https://www.ebay.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();		
		driver.manage().deleteAllCookies();
	}
	@Test(enabled = true, priority = 5)
	public void setASpecificSizeOfWindow() throws InterruptedException {
		driver.get("https://www.cvs.com");		
        Dimension dimension = new Dimension(350, 400); 
		driver.manage().window().setSize(dimension);
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}
	
}
