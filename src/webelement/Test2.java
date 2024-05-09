package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
	
	public static void main(String[] args) throws InterruptedException 
    {
        
        System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.vtiger.com/vtigercrm/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@type='submit']")).submit();
        Thread.sleep(5000);
        driver.close();
}



}
