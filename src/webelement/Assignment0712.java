package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment0712 {

	
		public static void main(String[] args) throws InterruptedException 
	    {
	        
	        System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://demo.vtiger.com/vtigercrm/");
	        driver.manage().window().maximize();
	        //Thread.sleep(5000);
	        //driver.findElement(By.id("username")).clear();
	        //Thread.sleep(5000);
	        //driver.findElement(By.id("username")).sendKeys("admin");
	        
	      //Thread.sleep(5000);
	        //driver.findElement(By.id("password")).clear();
	        //Thread.sleep(5000);
	        //driver.findElement(By.id("password")).sendKeys("admin");
	        
	        WebElement ele=driver.findElement(By.id("username"));
	        ele.clear();        
	        Thread.sleep(5000);
	        ele.sendKeys("admin");
	        Thread.sleep(5000);
	        
	        WebElement ele1=driver.findElement(By.id("password"));
	        ele1.clear();        
	        Thread.sleep(5000);
	        ele1.sendKeys("admin");
	        Thread.sleep(5000);
	        
	        driver.findElement(By.xpath("//button[@type='submit']")).submit();
	        Thread.sleep(5000);
	        driver.close();
	}


	}


