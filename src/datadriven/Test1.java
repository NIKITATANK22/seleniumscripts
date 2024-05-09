package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test1 {

	
	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException
	{
		
        FileInputStream f=new FileInputStream("./Excel/Exceldata.xlsx");
        Workbook wb = WorkbookFactory.create(f);
        String s = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
        System.out.println(s);
        String t = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
        System.out.println(t);
        String u = wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
        System.out.println(u);
        String v = wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
        System.out.println(v);
        
	}
	
}
