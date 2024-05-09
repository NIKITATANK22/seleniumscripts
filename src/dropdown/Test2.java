package dropdown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test2 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        WebElement ele =driver.findElement(By.id("gh-cat"));
        Select s = new Select(ele);
        
     // Get all options from the dropdown
        List<WebElement> options = s.getOptions();
        System.out.println(options.size());
        
     // Store option texts in a list
        List<String> optionTexts = new ArrayList<>();
        for (WebElement option : options)
        {
        	System.out.println(option.getText());
        	optionTexts.add(option.getText());
        }
        
     // Sort the list alphabetically
        Collections.sort(optionTexts);
        
        // Print the sorted option texts
        System.out.println("Number of options: " + optionTexts.size());
        System.out.println("Options in alphabetical order:");
        for (String optionText : optionTexts) {
            System.out.println(optionText);
        }
        driver.close();

}

	}
