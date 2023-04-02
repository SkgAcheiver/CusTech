package Organisations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateOrg2 {                //This program is for invoking chrome browser through setproperty
	                                      //if chrome driver is not availble inside the project folder
   
public static void main(String[] args) {
//		String key="webdriver.chrome.driver";  
//		String value="./src/main/resources/chromedriver.exe"; // location where chrome driver is present
//		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds( 10));

		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
	    driver.findElement(By.linkText("Organizations")).click();
	    
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		driver.findElement(By.name("accountname")).click();

		driver.findElement(By.name("accountname")).sendKeys("Hello385");

		driver.findElement(By.name("website")).click();
		driver.findElement(By.name("website")).sendKeys("www.sumeeth123.com");
		
		 
		WebElement dropdown=driver.findElement(By.name("industry"));
		 dropdown.click();
		 
		 Select s=new Select(dropdown);
		
		 s.selectByVisibleText("Engineering");

		 WebElement dropdown1=driver.findElement(By.name("accounttype"));
		 Select s1=new Select(dropdown1);
		 s1.selectByVisibleText("Customer");
	
			driver.findElement(By.name("bill_street")).click();

			driver.findElement(By.name("bill_street")).sendKeys("Qno-2033,Sec-12/c");
			
			
			
			driver.findElement(By.name("ship_street")).click();
			driver.findElement(By.name("ship_street")).sendKeys("Qno-2033,Sec-12/c");

			driver.findElement(By.id("bill_city")).sendKeys("BOKARO STEEL CITY");
			driver.findElement(By.id("ship_city")).sendKeys("BOKARO STEEL CITY");

			driver.findElement(By.id("bill_state")).sendKeys("Jharkhand");
			driver.findElement(By.id("ship_city")).sendKeys("Jharkhand");

			driver.findElement(By.id("bill_code")).sendKeys("827012");
			driver.findElement(By.id("ship_code")).sendKeys("827012");

			driver.findElement(By.id("bill_country")).sendKeys("8796683625");
			driver.findElement(By.id("ship_country")).sendKeys("India");
			
			driver.findElement(By.id("phone")).sendKeys("827012");
			driver.findElement(By.name("description")).sendKeys("Hello this is first selenium automation script");


		
			driver.findElement(By.id("bill_code")).sendKeys("827012");
			driver.findElement(By.id("ship_code")).sendKeys("827012");
			
			driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();

			driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();

			
			driver.findElement(By.linkText("Sign Out")).click();
		    driver.close();


	}
	
	

	

}
