package Object_Repo;

import java.awt.event.ActionEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Genric_Utility.WebDriver_File;

public class Home_Page {

	public Home_Page(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}
		
	//Declaration
	
	
	    @FindBy(name="Products")
	    private WebElement productLinkText;
	
		@FindBy(linkText="More")
		private WebElement moreLink;
		
		
		@FindBy(name="Campaigns")
		private WebElement campaignLinkText;
		
		@FindBy(linkText="Organizations")
		private WebElement organizationLinkText;
		
		@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
		private WebElement signoutImg;


		@FindBy(linkText="Sign Out")
		private WebElement signoutLinkText;
		
		
		
		

				
				//Getters Method

				public WebElement getProductLinkText() {
					return productLinkText;
				}

				public WebElement getMoreLink() {
					return moreLink;
				}

				public WebElement getCampaignLinkText() {
					return campaignLinkText;
				}

				public WebElement getOrganizationLinkText() {
					return organizationLinkText;
				}

//				public WebElement getSignoutImg() {
//					return signoutImg;
//				}

				public WebElement getSignoutLinkText() {
					return signoutLinkText;
				}
				
				
				//Business Logic For More
				
				public void moreLink(WebDriver driver)
				{
					WebDriver_File wlib=new WebDriver_File();
					wlib.mouseOverOnElement(driver, moreLink);
				}
				
				//Products
				public void clickProductLink()
				{
					productLinkText.click();
				}
				
				
				//Campaigns
						public void campaignLinkText()
						{
							campaignLinkText.click();
						}
						
			//Organizations
						public void clickOrganizationLinkText()
						{
							organizationLinkText.click();
						}
						
						
						//signOut
						
//
//						public void clickOnSignOutImg(WebDriver driver)
//						{
//							
//			                Actions act=new Actions( driver);
//			                   act.moveToElement(signoutImg).perform();
//
//							signoutImg.click();
//						}

		
						
						
						
						public void signOutLink(WebDriver driver)
						{
		                   Actions act=new Actions(driver);	
		                   act.moveToElement(signoutLinkText).perform();
							signoutLinkText.click();

						}
						
						
				
				
				
		
		
}

