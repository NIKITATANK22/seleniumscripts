package screenshot;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1612 {
	
		public static void main(String[] args) throws InterruptedException, AWTException, IOException {
			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	        driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);
	        driver.get("https://www.ebay.com/");
	        driver.manage().window().maximize();
	        //Typecasting
	        TakesScreenshot t=(TakesScreenshot)driver;
	        File src=t.getScreenshotAs(OutputType.FILE);
	        File dest=new File("./photo/ebay.png");
	        FileUtils.copyFile(src,dest);
	        driver.quit();
	        
	        
		}     


}
