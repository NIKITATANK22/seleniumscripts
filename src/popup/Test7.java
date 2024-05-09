package popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class Test7 {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/?_rdr");
        driver.manage().window().maximize();
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_T);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_T);
        
        String parent=driver.getWindowHandle();
        Set<String> child = driver.getWindowHandles();
        
        
        for(String b:child)
        {
        	driver.switchTo().window(b);
        }
        
        
        driver.get("https://www.amazon.com/ref=nav_logo");
        driver.manage().window().maximize();
        Thread.sleep(9000);
        driver.findElement(By.xpath("//button[@type='submit']")).submit();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone",Keys.ENTER);
        Thread.sleep(5000);
        driver.switchTo().window(parent);
        Thread.sleep(5000);
        driver.findElement(By.linkText("Forgotten password?")).click();
        Thread.sleep(5000);
        driver.quit();
        

}
}