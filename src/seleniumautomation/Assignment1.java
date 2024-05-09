package seleniumautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment1 {

	
	//static 
    //{
	//System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	//WebDriver driver = new ChromeDriver();
	//System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	//WebDriver driver1 = new FirefoxDriver();
		//}
	
		public static void testBrowser(WebDriver driver) {
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
		
				}	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Assignment1.testBrowser(new ChromeDriver());
			Assignment1.testBrowser(new FirefoxDriver());
		}

	}


