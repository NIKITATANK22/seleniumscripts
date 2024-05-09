package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Test1 {
	@FindBy(id="username")
	private WebElement usernameTb;
	
	Test1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void demo(String us) {
		// TODO Auto-generated method stub
		usernameTb.sendKeys(us);
	}

	

}
