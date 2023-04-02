package Genric_Utility;

import java.time.Duration;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

public class WebDriver_File 
{
//To maximize the screen
	
	public void maximizeScreen(WebDriver driver)
	{
		
		driver.manage().window().maximize();
	}
	
	
	/**
	 *  Wait for page to load before identifying any synchronised element in DOM
	 */

	public void waitForPageLoad(WebDriver driver)
	{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);  Not support in selenium 4.4.0

		
		
		
    }

		
	//To close the browser
	
	public void closeBrowser(WebDriver driver)
	{
		driver.close();
	}
		
	
	
	
	/**
	 * After every action it will for next action to perform
	 */

public void scriptTimeOut(WebDriver driver)
{

driver.manage().timeouts().setScriptTimeout(20,TimeUnit.SECONDS);
}

//Used to wait for element to be clickable in GUI and check foe specific 
//elements for every 5000 milliseconds

public void waitForElementCustomTimeout(WebDriver driver, WebElement Element, int pollingTime)
{
	FluentWait wait=new FluentWait(driver);
	
	wait.pollingEvery(Duration.ofSeconds(20));
	wait.until(ExpectedConditions.elementToBeClickable(Element));
	
	
}

/**
 * used to switch to any window based on window title
 *  
 *  PartialWindow Title
 */


public void switchToWindow(WebDriver driver, String PartialWindowTitle)
{
	  Set<String> allId=driver.getWindowHandles();
      Iterator<String> it=allId.iterator();
      while(it.hasNext())
      {
   	   String wid=it.next();
   	   driver.switchTo().window(wid);
   	   String title=driver.getTitle();
   	   
   	   if(driver.getTitle().contains(PartialWindowTitle))
   	   {
   		   break;
   	   }
   	   
   	  
      }
}
     //used to switch to AlertWindow and accept(click on OK button)
      
      public void switchToAlertAndAccept(WebDriver driver)
      {
    	  driver.switchTo().alert().accept();
    	 
      }
      
   //used to switch to AlertWindow And Dismiss(click and cancel button)
      
      public void switchToAlertAndDismiss(WebDriver driver)
      {
    	  driver.switchTo().alert().dismiss();
    	  
      }
      
      
      //Use to switch to Frame window based on index
      //@param driver
      //@param index
      
      
      public void switchToFrame(WebDriver driver,int index)
      {
    	  driver.switchTo().frame(index);
    	  
      }
      
      /**
       * used to switch to Frame window based on id or name attributes
      @param driver
      @param index
      @param id_name_attributes
      
 */

      public void switchToFrame(WebDriver driver,String id_name_Attributes)
      {
    	  driver.switchTo().frame(id_name_Attributes);
      }
      
      /**
       * used to select the value from the dropdown based on index
       * @param element
       * @param index
       */
      
      public void select(WebElement element,int index)
      {
    	  Select sel=new Select(element);
    	  sel.selectByIndex(index);
      }
/*
 * used to select the value from dropdown based on text
 * @param element
 * @param text
 */

      public void select(WebElement element,String text)
      {
    	  Select sel=new Select(element);
    	  sel.selectByVisibleText(text);
      }

/*used to place mouse cursor on specified element
 * param driver
 * param element
 */
      
      public void mouseOverOnElement(WebDriver driver, WebElement element)
      {
    	  Actions act=new Actions(driver);
    	  act.moveToElement(element).perform();
    	  
      }
      
      
/*Used to right click on specific element
 *param driver
 * param element
 */
      
      public void rightClickOnElement(WebDriver driver, WebElement element)
      {
    	  Actions act=new Actions(driver);
    	  act.contextClick(element).perform();
    	  
      }
      
      public void moveByOffset(WebDriver driver,int x, int y)
      {
    	  Actions act=new Actions(driver);
    	  act.moveByOffset(x,y).click().perform();
    	  
      }
      
      public String takeScreenShot(WebDriver driver,String methodName)
      
     
      {
    	  Date date=new Date();
    	   date.toString().replace(" ", " ").replace(":",".");
    	   //TakeScreeShot ts= new (TakeScreenShot)Driver;
    	   return null;
      }
}
      
      

