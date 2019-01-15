package execution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import driver.DriverScript;

public class ActionKeywords {
	
public static WebDriver driver;
	
	public static void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\software\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public static void navigate()
	{
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}
	
	public static void setText(String object,String data)
	{
		driver.findElement(By.xpath(DriverScript.prop.getProperty(object))).sendKeys(data);
	}
	
	public static void clickLogin(String object)
	{
		driver.findElement(By.xpath(DriverScript.prop.getProperty(object))).click();
	}



}
