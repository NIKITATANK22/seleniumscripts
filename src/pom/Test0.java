package pom;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://online.actitime.com/tuzen/login.do");
        //WebElement ele =driver.findElement(By.id("username"));
        Test1 t=new Test1(driver);        
        driver.navigate().refresh();
        t.demo("nikita.tank22@gmail.com");
        //ele.sendKeys("nikita.tank22@gmail.com");    
	}
	}
        
        // org.openqa.selenium.StaleElementReferenceException 
        //whenever the page will get refresh automatically, then you will get this error.
        //To overcome this error ,we go with POM design pattern.


