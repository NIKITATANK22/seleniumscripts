package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment0712B {
	public static void main(String[] args) throws InterruptedException 
    {
        
        System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();
        driver.findElement(By.name("q")).sendKeys("cars",Keys.ENTER);
        Thread.sleep(5000);
        driver.close();
}

}


