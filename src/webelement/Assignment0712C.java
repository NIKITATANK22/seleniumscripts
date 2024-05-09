package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment0712C {
	
	public static void main(String[] args) throws InterruptedException 
    {
        
        System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/v3/signin/identifier?ifkv=ARZ0qKLurfVlOazuDNuUdpy-TBGksCb-CSzQLXTphuYiR9Q5iGm66SfvI2lK-sOk91wCH2vK-7Ky&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S352609186%3A1713260867074970&theme=mn&ddm=0");
        driver.manage().window().maximize();
        
        Thread.sleep(5000);
        driver.findElement(By.id("identifierId")).sendKeys("nikita.tank280@gmail.com");
        driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
        
        
        Thread.sleep(5000);
        driver.close();
}

}
