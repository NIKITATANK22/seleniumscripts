package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Test0 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        WebElement ele1 =driver.findElement(By.id("gh-cat"));
        Select s = new Select(ele1);
        Thread.sleep(5000);
        s.selectByIndex(4);
        Thread.sleep(5000);
        s.selectByValue("625");
        Thread.sleep(5000);
        s.selectByVisibleText("Music");
        Thread.sleep(5000);
        driver.close();

	}

}
