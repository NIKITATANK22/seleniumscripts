package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseclass {
	public WebDriver driver;
	@BeforeMethod
	public void openapp()
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
         driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
     // Set implicit wait
        driver.manage().timeouts().implicitlyWait(9000, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closeapp()
	{
		driver.quit();
	}

}
