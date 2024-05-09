package dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test5 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);
        driver.get("file:///C:/Users/nikit/Desktop/dd.html");
        WebElement ele =driver.findElement(By.id("Udupi"));
        Select s = new Select(ele);
        Thread.sleep(3000);
        s.selectByIndex(1);
        Thread.sleep(3000);
        s.selectByValue("n");
        Thread.sleep(3000);
        s.selectByVisibleText("Vada");
        System.out.println(s.isMultiple());
        Thread.sleep(3000);
        driver.quit();
	}


}
