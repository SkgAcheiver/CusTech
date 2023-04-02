package Campaigns;



import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import org.apache.poi.ss.usermodel.Sheet;

//import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Genric_Utility.Excel_File;
import Genric_Utility.Java_File;
import Genric_Utility.Property_File;
import Genric_Utility.WebDriver_File;
import Object_Repo.CreateCampaignPage;
import Object_Repo.Home_Page;
import Object_Repo.Login_Page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test0 {
	public static void main(String[] args) throws Throwable
	{
	
		
//		String Key="webdriver.chrome.driver";
//		String Value="./src/main/resources/chromedriver.exe";
//		System.setProperty(Key, Value);
		
		Property_File plib=new Property_File();
		String BROWSER = plib.getPropertyKeyValue("browser");
		
WebDriver driver;
		
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
		
		
		WebDriver_File wlib= new WebDriver_File();
		wlib.waitForPageLoad(driver);
        wlib.maximizeScreen(driver);		
		

		
	//WebDriver driver=new ChromeDriver();
	//	driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//Property_File plib=new Property_File();
		String URL=plib.getPropertyKeyValue("url");
        String USERNAME=plib.getPropertyKeyValue("username");
		String PASSWORD=plib.getPropertyKeyValue("password");
		
		 driver.get(URL);
		 Login_Page login=new Login_Page(driver);
		 login.loginToApp(USERNAME, PASSWORD);
		
//		 driver.get(URL);
//		 driver.findElement(By.name("user_name")).sendKeys("admin");
//         driver.findElement(By.name("user_password")).sendKeys("admin");		
//         driver.findElement(By.id("submitButton")).click();
        
		 
		 Home_Page home=new Home_Page(driver);
            home.moreLink(driver);         
            
      //   driver.findElement(By.xpath("//img[@src='themes/softed/images/menuDnArrow.gif']")).click();

         
		  home.campaignLinkText();
       //  driver.findElement(By.name("Campaigns")).click();
		  
		  CreateCampaignPage camp=new CreateCampaignPage(driver);
		  camp.clickCampaignCreatePage();
		  
		  
		  
		  
        // driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
         
         

	         Java_File jlib=new Java_File();
	         
	         int RanNum=jlib.getRanDomNum();
	         
	         
	        // Random ran=new Random();
	         //int RanNum=ran.nextInt(1000);
	         
	    
	         Excel_File elib=new Excel_File();
	         
	        String campaigndata= elib.getExcelData("Campaigns",0,0)+RanNum;
	         

         
       
         

      
// 		FileInputStream fis1=new FileInputStream("./src/test/resources/ExcelBook1.xlsx");
// 		
// 		Workbook book=WorkbookFactory.create(fis1);
//
//         Sheet sh=book.getSheet("Campaigns");
// 		  Row row=sh.getRow(0);
//          Cell cel=row.getCell(0);
// 		  String campaigndata=cel.getStringCellValue();
// 		  driver.findElement(By.name("campaignname")).sendKeys(campaigndata);

	        
	        camp.campaignNameTextField(campaigndata);
		
	        camp.saveButton();
	        
	        
	        
	       // driver.findElement(By.name("button")).click();	
		

		

		
		Thread.sleep(5000);
		
	//	home.clickOnSignOutImg();
		home.signOutLink(driver);
		//driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		//driver.findElement(By.linkText("Sign Out")).click();
		
		wlib.closeBrowser(driver);
	}

}




