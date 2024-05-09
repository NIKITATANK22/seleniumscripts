package popup;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1712 {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);
        driver.get("https://compiler.skillrary.com/");       
        driver.manage().window().maximize();
        Thread.sleep(9000);
        //not working
        driver.findElement(By.xpath("//button[text()='Upload Code ']")).sendKeys("C:\\Users\\nikit\\Desktop\\GivenRange.java");
        Thread.sleep(9000);
        driver.findElement(By.xpath("//button[text()='Run & Compile ']")).click();
        Thread.sleep(9000);
        driver.quit();
        
	}

}
