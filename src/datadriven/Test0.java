package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test0 {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		Properties p=new Properties();
		p.load(new FileInputStream("./data.properties"));
		String url = p.getProperty("url");
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(p.getProperty("username"));
		driver.findElement(By.name("pwd")).sendKeys(p.getProperty("password"));
		driver.findElement(By.xpath("//div[text()='Login ']")).click(); 
        Thread.sleep(5000);
        driver.quit();
	}

}
