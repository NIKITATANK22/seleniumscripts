package pom;

import org.testng.annotations.Test;

public class Testcase2 extends Baseclass
{	
	@Test
	public void testcase2()	
	{    
        loginpage l=new loginpage(driver);
        l.searchtxtbox("dress");
        l.searchbutton();
        
        homepage h=new homepage(driver);
     // Scroll down by 500 pixels        
        h.scrollDownBy(500);
        h.dress();
        
        // Switch to a new tab
        h.switchToNewTab();        
        
        addtocart a=new addtocart(driver);
        
     // Scroll down by 500 pixels
        a.scrollDownBy(500);
        a.addingtocart();
        
     // Perform actions in the new tab
        // Switch back to the parent tab
        a.switchToParentTab();  
        }
}
