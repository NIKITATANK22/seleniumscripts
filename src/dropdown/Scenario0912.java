package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Scenario0912 {


		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.facebook.com/?_rdr");
	        driver.manage().window().maximize();
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	        WebElement ele =driver.findElement(By.id("day"));
	        Select s = new Select(ele);
	        s.selectByIndex(1);
	        Thread.sleep(5000);
	        s.selectByValue("12");
	        Thread.sleep(5000);
	        s.selectByVisibleText("15");
	        Thread.sleep(5000);
	        driver.close();
		

	}

}
