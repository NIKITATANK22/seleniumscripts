package testNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test5 {
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] a= new Object[3][2];
		a[0][0]="abcdefg";
		a[0][1]="abcdefgkk987";
		a[1][0]="77656";
		a[1][1]="j7m8b6c5";
		a[2][0]="ko854es4";
		a[2][1]="g656v5c4";
		return a;
	}
	@Test(dataProvider="getdata")
	public void demo(String us, String pwd) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       driver.get("https://online.actitime.com/tuzen/login.do");
       driver.manage().window().maximize();
    // Set implicit wait
       driver.manage().timeouts().implicitlyWait(9000, TimeUnit.SECONDS);
       driver.findElement(By.id("username")).sendKeys(us);
       driver.findElement(By.name("pwd")).sendKeys(pwd);
       Thread.sleep(5000);
       driver.quit();
	}

}
