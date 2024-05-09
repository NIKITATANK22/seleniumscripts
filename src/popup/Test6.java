package popup;

import java.awt.AWTException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);
        driver.get("https://www.naukri.com/");
        driver.manage().window().maximize(); 
        String parent = driver.getWindowHandle();
        System.out.println(parent);
        Set<String> child = driver.getWindowHandles();
        System.out.println(child);
        System.out.println(child.size());
        
        String title ="HSBC";
        for(String popup:child)
        {
        	driver.switchTo().window(popup);
        	String actTitle=driver.getTitle();
        	System.out.println(actTitle);
        	if(actTitle.equals(title))
        	{
        		driver.close();
        	}
        }

	}
}