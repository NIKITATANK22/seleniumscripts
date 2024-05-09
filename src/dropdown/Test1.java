package dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        WebElement ele1 =driver.findElement(By.id("gh-cat"));
        Select s = new Select(ele1);       
        s.selectByIndex(4);
        s.deselectByIndex(4);
        driver.quit();
        
        // Note:- UnsupportedOperationException(JavaException)
        //when you try to perform deselect operation on single select drop down we get this error.
        //should use on multi select dropdown list.
        

	}


}
