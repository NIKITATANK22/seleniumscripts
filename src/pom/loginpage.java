package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	
	@FindBy(id="gh-ac")
	private WebElement searchTb;
	
	@FindBy(id="gh-btn")
	private WebElement searchbutton;
	
	
	
	loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void searchtxtbox(String productname) {
			searchTb.sendKeys(productname);
	}
	
	public void searchbutton() {
		searchbutton.click();
}

}
