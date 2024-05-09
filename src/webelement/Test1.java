package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	
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
        
        WebElement ele=driver.findElement(By.id("username"));
        ele.clear();        
        Thread.sleep(5000);
        ele.sendKeys("admin123");
        Thread.sleep(5000);
        driver.close();
}

}
