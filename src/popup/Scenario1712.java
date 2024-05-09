package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1712 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://online.actitime.com/tuzen/timetrack/enter.do");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.id("username")).sendKeys("nikita.tank22@gmail.com");        	
        Thread.sleep(5000);        
        driver.findElement(By.name("pwd")).sendKeys("manager");        	
        Thread.sleep(5000);        
        driver.findElement(By.xpath("//div[text()='Login ']")).click(); 
        Thread.sleep(5000);
        //not working
        driver.findElement(By.xpath("//span[@class='components-WeekPicker-weeks--H1IxRNVT']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[text()='15']")).click();
        Thread.sleep(5000);
        driver.quit();

}
}