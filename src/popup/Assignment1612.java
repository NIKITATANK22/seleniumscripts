package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1612 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://online.actitime.com/tuzen/timetrack/enter.do");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.id("username")).sendKeys("nikita.tank22@gmail.com");        	
        Thread.sleep(5000);        
        driver.findElement(By.name("pwd")).sendKeys("manager");        	
        Thread.sleep(5000);        
        driver.findElement(By.xpath("//div[text()='Login ']")).click(); 
        Thread.sleep(5000);
        driver.navigate().to("https://online.actitime.com/tuzen/administration/userlist.do");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='components_button withPlusIcon']")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("createUserPanel_firstNameField")).sendKeys("Nikita");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='components_button cancelBtn']")).click();
        Alert a =driver.switchTo().alert();
        System.out.println(a.getText());
        Thread.sleep(3000);
        a.accept();
        Thread.sleep(5000);
        driver.quit();
       	

}
}
