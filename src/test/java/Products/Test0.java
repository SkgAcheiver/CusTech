package Products;



	import java.io.FileInputStream;
	import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Sheet;

	//import org.apache.poi.sl.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

import Genric_Utility.Property_File;

	public class Test0 {
		public static void main(String[] args) throws IOException, InterruptedException
		{
		
			
			String Key="webdriver.chrome.driver";
			String Value="./chromedriver.exe";
			System.setProperty(Key, Value);
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			
			Property_File plib=new Property_File();
			String URL=plib.getPropertyKeyValue("url");
	        String USERNAME=plib.getPropertyKeyValue("username");
			String PASSWORD=plib.getPropertyKeyValue("password");
			
			
			
			 driver.get(URL);
			
			
	         driver.findElement(By.name("user_name")).sendKeys("admin");
	         driver.findElement(By.name("user_password")).sendKeys("admin");		
	         driver.findElement(By.id("submitButton")).click();
	         driver.findElement(By.linkText("Products")).click();
	         
	         driver.findElement(By.xpath("//img[@alt='Create Product...']")).click();
//	         driver.findElement(By.name("productname")).click();
	         
	       
	         Random ran=new Random();
	         
	         int RanNum=ran.nextInt(1000);

	      
	 		FileInputStream fis1=new FileInputStream("./src/test/resources/ExcelBook1.xlsx");
	 		
	 		Workbook book=WorkbookFactory.create(fis1);

	         Sheet sh=book.getSheet("Products");
	 		  Row row=sh.getRow(0);
	          Cell cel=row.getCell(1);
	 		  String data=cel.getStringCellValue()+RanNum;
	 		  driver.findElement(By.name("productname")).sendKeys(data);

			driver.findElement(By.name("button")).click();	
			
			
			

			
			driver.findElement(By.name("Delete")).click();	
			Thread.sleep(5000);

			
			Alert alt=driver.switchTo().alert();
			alt.accept();

			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
			driver.findElement(By.linkText("Sign Out")).click();
			
			//driver.close();
		}

	}

	


