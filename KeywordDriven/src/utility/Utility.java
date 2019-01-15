package utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Utility {
	
	public static XSSFWorkbook excelbook;
	public static XSSFSheet excelsheet;
	
	
	
	public static void setExcel(String path,String sheetname) throws Exception
	{
		File file = new File(path);
		FileInputStream fin = new FileInputStream(file);
		excelbook = new XSSFWorkbook(fin);
		excelsheet = excelbook.getSheet(sheetname);
	}
	
	public static String getCellData(int rownum, int colnum) 
	{
		String celldata = excelsheet.getRow(rownum).getCell(colnum).getStringCellValue();
		return celldata;
	}


}
