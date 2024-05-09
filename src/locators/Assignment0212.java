package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment0212 
{
    public static void main(String[] args) throws InterruptedException 
    {
        
        System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");
        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.findElement(By.xpath("//span[contains(text(),'SAMSUNG Galaxy A15 5G A Series Cell Phone')]")).click();        
        driver.findElement(By.id("add-to-cart-button")).click();
        //driver.findElement(By.xpath("//a[contains(text(),'Go to Cart')]")).click();  
        WebElement cartItem = driver.findElement(By.xpath("//h1[contains(text(),'Added to Cart')]"));
        String itemText = cartItem.getText();
        System.out.println(itemText);
        
       
        if (itemText.equals("Added to Cart")) {
            System.out.println("Phone added to cart successfully.");
        }
        else 
        {
            System.out.println("Phone not added to cart.");
        }        
	    driver.close();
	}

}
