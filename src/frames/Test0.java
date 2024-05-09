package frames;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);
        driver.get("https://paytm.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[text()='Sign In']")).click();
        driver.switchTo().frame(0);
        Thread.sleep(3000);
        //not working
        driver.findElement(By.xpath("//a[contains(text(),'privacy policy']")).click();
        driver.switchTo().defaultContent();
        Thread.sleep(5000);
        driver.quit();
}
}