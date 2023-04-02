package Genric_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Excel_File2

{

	public  String getExcelData2(String sheetName, int rowNum, int cellNum) throws Throwable
	{
		
		FileInputStream  fis=new FileInputStream("./src/test/resources/ExcelBook3.xlsx");
		Workbook book= WorkbookFactory.create(fis);
		
	    Sheet sh=book.getSheet(sheetName);
		Row row=sh.getRow(rowNum);
		Cell cell=row.getCell(cellNum);
		String data=cell.getStringCellValue();
		
		return data;
	
		
	}
	
	
}
