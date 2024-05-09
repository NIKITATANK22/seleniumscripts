package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addtocart {
	
	@FindBy(xpath="//span[text()='Add to cart']")
	private WebElement cartbtn;
	private WebDriver driver;
	private JavascriptExecutor js;	
	
	addtocart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
		this.driver = driver;
        this.js = (JavascriptExecutor) driver;
	}
	
	public void addingtocart() {
			cartbtn.click();
	}
	// Scroll down by a specified amount (e.g., 500 pixels)
	public void scrollDownBy(int pixels) {
        js.executeScript("window.scrollBy(0, arguments[0])", pixels);
    }
	
	// Method to switch back to the parent tab
		public void switchToParentTab() {
	        String parentHandle = driver.getWindowHandles().iterator().next();
	        driver.switchTo().window(parentHandle);
	    }
		// Close the browser
		public void tearDown() {
                       if (driver != null) {
                driver.quit();
            }
        }
}