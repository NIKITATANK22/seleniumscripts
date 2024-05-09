package seleniumautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
	
	//static 
    //{
	//System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	//WebDriver driver = new ChromeDriver();
	//System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	//WebDriver driver1 = new FirefoxDriver();
		//}
	
	public static void testBrowser(WebDriver driver) {
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();
			}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test2.testBrowser(new ChromeDriver());
		Test2.testBrowser(new FirefoxDriver());
	}

}
