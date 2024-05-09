package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	
	
	@FindBy(xpath="//span[text()='New Summer Maxi Farm Floral Print  Sleeveless Swing Dress Women Rio Anthro']")
	private WebElement dress;
	
	private WebDriver driver;
	private JavascriptExecutor js;

	
	homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
        this.js = (JavascriptExecutor) driver;
	}
	
	public void dress() {
		dress.click();
}
	// Scroll down by a specified amount (e.g., 500 pixels)
	public void scrollDownBy(int pixels) {
        js.executeScript("window.scrollBy(0, arguments[0])", pixels);
           }
	// Method to switch to a new tab
	public void switchToNewTab() {
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
}
	
	
}