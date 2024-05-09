package actionclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);
        driver.get("https://demoapp.skillrary.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement ele =driver.findElement(By.id("course"));
        Actions a = new Actions(driver);
        a.moveToElement(ele).perform();
        Thread.sleep(3000);
        driver.findElement(By.partialLinkText("SQL")).click();
        Thread.sleep(3000);
       WebElement ele1 = driver.findElement(By.id("add"));
       a.doubleClick(ele1).perform();
       Thread.sleep(3000);
       driver.quit();
	}
}
