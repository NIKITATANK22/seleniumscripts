package testNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parallelexecution {
	public WebDriver driver;
	@BeforeMethod
	public void openapp()
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	}
	@Parameters({"browsername"})
	@Test	
	public void test(String browser) {
	if (browser.equals("chrome"))
	{ 
		driver=new ChromeDriver();
	}
	else
	{
		driver=new FirefoxDriver();
	}
	driver.get("https://www.ebay.com/");
    driver.manage().window().maximize();
 // Set implicit wait
    driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
    
	}
	@AfterMethod
    public void closeapp() 
    {
    driver.quit();
    }
}

