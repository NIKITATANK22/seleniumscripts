package popup;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {
	
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);
        driver.get("http://javascriptkit.com/javatutors/alert2.shtml");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@value='Click here for output>>']")).click();
        Alert a =driver.switchTo().alert();
        System.out.println(a.getText());
        Thread.sleep(3000);
        a.accept();
        Thread.sleep(3000);
        driver.quit();
        
        
}
}