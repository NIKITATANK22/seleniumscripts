package actionclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment1112B {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);
        driver.get("https://www.amazon.com/ref=nav_logo");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(9000);
        driver.findElement(By.xpath("//button[@type='submit']")).submit();
        WebElement ele =driver.findElement(By.id("twotabsearchtextbox"));
        Actions a = new Actions(driver);
        a.contextClick(ele).perform();
        Thread.sleep(3000);
        driver.quit();
	}

}
