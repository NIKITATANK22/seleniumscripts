package datadriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test5 {
	
      public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
	    //create object for excel file
	    FileInputStream f=new FileInputStream("./Excel/Exceldata.xlsx");
	    
	    //open the workbook in read only mode
	    Workbook wb = WorkbookFactory.create(f);
	    Sheet currentSheet = wb.getSheet("Sheet1");
	    Row newRow = currentSheet.createRow(2);
	    Cell newCell = newRow.createCell(2, CellType.STRING);
	    newCell.setCellValue("Automation");
	    
	    //Sheet sh = wb.getSheet("Sheet1");
	    //Row r = sh.getRow(4);
	    //Cell c = r. getCell(4);
	    //c.setCellValue("Automation");
	    //write to data in excel 
	    FileOutputStream fo = new FileOutputStream("./Excel/Exceldata.xlsx");
	    wb.write(fo);
	    wb.close();
	    
}
}
