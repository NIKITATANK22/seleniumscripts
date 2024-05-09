package locators;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;

	public class Chat {
		
	    public static void main(String[] args) {
	       
	    	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.amazon.com/");
	        driver.manage().window().maximize();
	        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");
	        driver.findElement(By.id("nav-search-submit-button")).click();
	        driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();   
	        
	        driver.findElement(By.id("add-to-cart-button")).click();
	        //driver.findElement(By.xpath("//a[contains(text(),'Go to Cart')]")).click(); 
	        
	     // Validate item in the cart
	        
	        WebElement cartIcon = driver.findElement(By.id("nav-cart-text-container"));
	        cartIcon.click();

	        WebElement cartItem = driver.findElement(By.xpath("//span[@class='a-truncate-cut']"));
	        String itemText = cartItem.getText();	        
	        
	       

	        if (itemText.contains("Phone")) {
	            System.out.println("Phone added to cart successfully.");
	        }
	        else 
	        {
	            System.out.println("Phone not added to cart.");
	        }
	        
		    driver.close();
	    }
	}


