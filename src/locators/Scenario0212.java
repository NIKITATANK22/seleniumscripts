package locators;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario0212 {

	public static void main(String[] args) 
    {
        
        System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("Password123");
        driver.findElement(By.id("submit")).click(); 
        String actTitle =driver.getTitle();
        System.out.println(actTitle);
        String Url =driver.getCurrentUrl();
        System.out.println(Url);
        
        //Validation
        if(actTitle.equals("Logged In Successfully | Practice Test Automation"))
        		{
        	System.out.println("Pass - Home page is displayed");
        		}
        else
        {
        	System.out.println("Fail - Home page is not displayed");
        }
        driver.close();
        }
        
	}


