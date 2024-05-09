package datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test4 {
	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
	    //create object for excel file
	    FileInputStream f=new FileInputStream("./Excel/Exceldata.xlsx");
	    
	    //open the workbook in read only mode
	    Workbook wb = WorkbookFactory.create(f);
	    Sheet sh = wb.getSheet("Sheet1");
	    
	    //get last row index from the sheet
	    int rowIndex = sh.getLastRowNum();
	    System.out.println(rowIndex);
	    
	    //get row
	    Row r=sh.getRow(1);
	    
	    //get last cell number
	     short cell=r.getLastCellNum();
	     
	      //go to every column and get the 1st and 2nd row data
	     	    for (int i=0;i<cell;i++)
	    {
	    	Cell colum = r.getCell(i);
	    	System.out.println(colum);
	    }
	}

}
