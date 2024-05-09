package popup;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
	
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);
        driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");       
        driver.manage().window().maximize();
        Thread.sleep(9000);
        //not working
        driver.findElement(By.xpath("//button[@class='uploadResume resman-btn-primary resman-btn-small']")).sendKeys("C:\\Users\\nikit\\Documents\\2ocno2019 MT resume.doc");
        
	}
}
