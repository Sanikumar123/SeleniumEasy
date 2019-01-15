package driver;

import java.io.FileInputStream;
import java.util.Properties;

import execution.ActionKeywords;
import utility.Utility;

public class DriverScript {
	public static Properties prop;
	

	public static void main(String[] args) throws Exception {
        Utility.setExcel("E:\\KeywordExcel.xlsx", "Test Steps");
        
        FileInputStream  fin = new FileInputStream("F:\\KeywordDriven\\src\\config\\config.properties");
        prop = new Properties();
        prop.load(fin);
		
		for(int i=1;i<=Utility.excelsheet.getLastRowNum();i++)
		{
		String keyword = Utility.getCellData(i, 2);
		String object = Utility.getCellData(i, 3);
		String data = Utility.getCellData(i, 4);
		
		switch(keyword)
		{
		case "openBrowser":
			ActionKeywords.openBrowser();
			break;
			
		case "navigate":
			ActionKeywords.navigate();
			break;
			
		case "setText":
			ActionKeywords.setText(object, data);
			break;
			
		case "click_login":
			ActionKeywords.clickLogin(object);
			break;
			
		default:
			break;
		
		}
		
		}

	}


	
	

}
