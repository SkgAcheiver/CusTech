package Genric_Utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Object_Repo.Home_Page;
import Object_Repo.Login_Page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;
	@BeforeSuite
	public void BS()
	{
		
		System.out.println("Database connection");
	}
	
	@BeforeTest
	public void BT()
	{
		
		System.out.println("Parrallel execution");
	}
	@BeforeClass
	public void BC() throws IOException
	
	{
		
		Property_File plib=new Property_File();
		String BROWSER = plib.getPropertyKeyValue("browser");

		
		
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();			
			
			driver=new ChromeDriver();
		}
		
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
		else if(BROWSER.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		
		else
		{
			driver=new ChromeDriver();
		}
		
		
		System.out.println("LAUNCHING BROWSER");
	}
	@BeforeMethod
	public void BM() throws IOException
	{
		
		Property_File plib=new Property_File();
        String URL=plib.getPropertyKeyValue("url");
        String USERNAME=plib.getPropertyKeyValue("username");
		String PASSWORD=plib.getPropertyKeyValue("password");
		 driver.get(URL);
		 Login_Page login=new Login_Page(driver);
		 login.loginToApp(USERNAME, PASSWORD);
		 
		
		System.out.println("login to application");
	}
	
	@AfterMethod
	public void AM()
	{
		Home_Page home=new Home_Page(driver);
		home.signOutLink(driver);	
		
		System.out.println("lOGOUT FROM THE APPLN");
	}
	@AfterTest
	public void AT()
	{
		
		System.out.println("Close the browser");
	}
	
	@AfterClass
	public void AC()
	{
		
		System.out.println("Parallel execution ");
	}
		
		@AfterSuite
		public void AS()
		{
			
			System.out.println("Database connection closed");
		}
	
}
