package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cleartrip.com/");
        driver.manage().window().maximize();
        Thread.sleep(9000);
        driver.findElement(By.xpath("//div[text()='Return']")).click();
        //not working
        driver.findElement(By.xpath("//div[text()='30']")).click();
        Thread.sleep(5000);
        driver.quit();

}
}
