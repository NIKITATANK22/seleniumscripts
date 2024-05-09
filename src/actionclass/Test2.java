package actionclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test2 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);
        driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement src =driver.findElement(By.xpath("//h1[text()='Block 1']"));
        WebElement target = driver.findElement(By.xpath("//h1[text()='Block 4']"));       
        Actions a = new Actions(driver);
        a.dragAndDrop(src,target).perform();
        Thread.sleep(3000);
        driver.quit();
	}


}
