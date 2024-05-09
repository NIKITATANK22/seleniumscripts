package datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test6 {
	
public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
	    //create object for excel file
	    FileInputStream f=new FileInputStream("./Excel/Exceldata.xlsx");
	    
	    //open the workbook in read only mode
	    Workbook wb = WorkbookFactory.create(f);
	    Sheet sheet = wb.getSheet("Sheet1");
	    int lastrownum = sheet.getPhysicalNumberOfRows();
	    int lastcellnum = sheet.getRow(0).getPhysicalNumberOfCells();
	    for(int i=0;i<lastrownum;i++)
	    {
	    	for(int j=0;j<lastrownum;j++)
	    	{
	    		String v = sheet.getRow(i).getCell(j).getStringCellValue();
	    		System.out.println(v);
	    		
	    		
	    	}
	    }
}
}
