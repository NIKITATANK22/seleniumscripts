package scrollbar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	
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
        WebElement ele = driver.findElement(By.xpath("//a[text()='Careers']"));
        JavascriptExecutor j = (JavascriptExecutor)driver;
        j.executeScript("arguments[0].scrollIntoView()",ele);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[text()='Amazon Currency Converter']")).click();
        Thread.sleep(5000);
        driver.quit();

}
}