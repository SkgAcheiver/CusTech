package Organisations;

import org.testng.annotations.Test;

import Genric_Utility.BaseClass;
import Genric_Utility.Excel_File;
import Genric_Utility.Java_File;
import Genric_Utility.Property_File;
import Genric_Utility.WebDriver_File;
import Object_Repo.Home_Page;                       //login and logout from extends base class
import Object_Repo.Login_Page;
import Object_Repo.OrganizationCreatePage;

	public class CreateOrganisation3 extends BaseClass {

		@Test
	          public void CreateOrganisation2() throws Throwable
	          {
			
//			String Key="webdriver.chrome.driver";
//			String Value="./src/main/resources/chromedriver.exe";
//			System.setProperty(Key, Value);
//			WebDriver driver=new ChromeDriver();
			
			
			
			
			
			//driver.manage().window().maximize();
		    //	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			WebDriver_File wlib= new WebDriver_File();
			wlib.waitForPageLoad(driver);
			
			
			
			
//	         driver.findElement(By.name("user_name")).sendKeys("admin");
//	         driver.findElement(By.name("user_password")).sendKeys("admin");		
//	         driver.findElement(By.id("submitButton")).click();
//	        
			 
			Home_Page home=new Home_Page(driver);
			 home.clickOrganizationLinkText();
			 
			 OrganizationCreatePage org=new OrganizationCreatePage(driver);
			 org.clickOrganizationCreatePage();
	         
	           //driver.findElement(By.linkText("Organizations")).click();
	        //driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
	 		
	         
	        
	         Java_File jlib=new Java_File();
	         
	         int RanNum=jlib.getRanDomNum();
	         
	         
	        // Random ran=new Random();
	         //int RanNum=ran.nextInt(1000);
	         
	    
	         Excel_File elib=new Excel_File();
	         
	        String Orgdata= elib.getExcelData("Organizations",0,0)+RanNum;
	         
	         
	         // FileInputStream fis1=new FileInputStream("./src/test/resources/ExcelBook1.xlsx");
	 		
	 		//Workbook book=WorkbookFactory.create(fis1);
	          //Sheet sh=book.getSheet("Organizations");
	 		 // Row row=sh.getRow(0);
	          //Cell cel=row.getCell(0);
	 		  //String data=cel.getStringCellValue()+RanNum;
	 		
	 		
	 		//  driver.findElement(By.name("accountname")).sendKeys(Orgdata);

		//driver.findElement(By.xpath("//input[@title='Save [Alt+S]'][1]")).click();
	        
	        org.organizationNameTextField(Orgdata);
	       org.saveButton();
	       
			
//			Thread.sleep(5000);
//			home.clickOnSignOutImg();

//			home.signOutLink(driver);	
//			
				//driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		       //driver.findElement(By.linkText("Sign Out")).click();
			
			//wlib.closeBrowser(driver);

		}

	}
