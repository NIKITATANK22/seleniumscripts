package popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class scenario2212 {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);
        driver.get("https://www.selenium.dev/downloads/");
        driver.manage().window().maximize();        
        WebElement ele = driver.findElement(By.xpath("//a[text()='4.20.0 (April 24, 2024)']"));
        JavascriptExecutor j = (JavascriptExecutor)driver;
        j.executeScript("arguments[0].scrollIntoView()",ele);
        Thread.sleep(5000);
        driver.findElement(By.linkText("4.20.0")).click();
        Robot r=new Robot();
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(5000);
        driver.quit();

}

}
