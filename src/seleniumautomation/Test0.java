package seleniumautomation;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test0 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.Chrome.driver","./software/Chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		FirefoxDriver driver1 = new FirefoxDriver();
		

	}

}
