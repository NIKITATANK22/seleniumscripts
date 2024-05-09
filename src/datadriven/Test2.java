package datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //create object for excel file
        FileInputStream f=new FileInputStream("./Excel/Exceldata.xlsx");
        //open the workbook in read only mode
        Workbook wb = WorkbookFactory.create(f);
        String url = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
        driver.get(url);
        String username = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();        
        driver.findElement(By.id("username")).sendKeys(username);
        String password= wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();        
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.xpath("//div[text()='Login ']")).click(); 
        driver.quit();        
        
        

	}

}
