package testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test0 {
	
	@Test
	public void demo()
	{
		Reporter.log("Hello java",true);
		Reporter.log("Hello java selenuim",false);
	}
	

}
