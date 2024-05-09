package actionclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario1112A {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement ele =driver.findElement(By.linkText("Electronics"));
        Actions a = new Actions(driver);
        a.moveToElement(ele).perform();
        Thread.sleep(3000);
        WebElement ele1 =driver.findElement(By.linkText("Home & Garden"));
        Actions b = new Actions(driver);
        a.moveToElement(ele1).perform();
        Thread.sleep(3000);
        
        WebElement ele2 =driver.findElement(By.linkText("Fashion"));
        Actions c = new Actions(driver);
        a.moveToElement(ele2).perform();
        driver.findElement(By.partialLinkText("Women's clothing")).click();
        driver.findElement(By.partialLinkText("Dresses")).click();
        driver.quit();
	}

}
