package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment0812 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://online.actitime.com/student54/login.do");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        
        WebElement ele1 =driver.findElement(By.id("username"));
        if(ele1.isDisplayed())
        {
        	ele1.sendKeys("trainee");
        	System.out.println("pass:element is displayed");
        }
        else
        {
        	System.out.println("fail:element is not displayed");
        }
        Thread.sleep(5000);
        
        WebElement ele2 = driver.findElement(By.name("pwd"));
        if(ele2.isDisplayed())
        {
        	ele2.sendKeys("trainee");
        	System.out.println("pass:element is displayed");
        }
        else
        {
        	System.out.println("fail:element is not displayed");
        }
        Thread.sleep(5000);
        
        WebElement ele3 =driver.findElement(By.xpath("//div[text()='Login ']"));
        if(ele3.isEnabled())
        {
        	ele3.click();
        	System.out.println("pass:element is clicked");
        }
        else
        {
        	System.out.println("fail:element is not clicked");
        }
        Thread.sleep(5000);
        
        driver.navigate().to("https://online.actitime.com/student54/tasks/tasklist.do");
       
        WebElement ele4 = driver.findElement(By.xpath("//input[@class='components-SearchInput-searchInput--dlqxQrkh components-SearchInput-empty--TyuRV3fG']"));
       if(ele4.isDisplayed())
       {
       	ele4.sendKeys("tasks");
       	System.out.println("pass:element is displayed");
       }
       else
       {
       	System.out.println("fail:element is not displayed");
       }
       Thread.sleep(5000);
       
       System.out.println(ele4.getSize().getHeight());
       System.out.println(ele4.getSize().getWidth());
       System.out.println(ele4.getLocation().getX());
       System.out.println(ele4.getLocation().getY());
       
       WebElement ele5=driver.findElement(By.xpath("//a[text()='Logout']"));       
       if(ele5.isEnabled())
       {
       	ele5.click();
       	System.out.println("pass:element is clicked");
       }
       else
       {
       	System.out.println("fail:element is not clicked");
        }
       
       Thread.sleep(5000);
       driver.close();
	}

}
