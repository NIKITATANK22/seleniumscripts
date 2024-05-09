package popup;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1712A {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);
        driver.get("https://www.selenium.dev/downloads/");
        driver.manage().window().maximize();        
        WebElement ele = driver.findElement(By.xpath("//a[text()='4.19.0 (March 27, 2024)']"));
        JavascriptExecutor j = (JavascriptExecutor)driver;
        j.executeScript("arguments[0].scrollIntoView()",ele);
        Thread.sleep(5000);
        //not working
        driver.findElement(By.partialLinkText("4.19.1")).click();
        Thread.sleep(5000);
        driver.quit();

}
}