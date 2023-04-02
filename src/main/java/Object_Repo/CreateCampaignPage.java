package Object_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampaignPage {

	public CreateCampaignPage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	
	//Declaration
	
	  @FindBy(xpath="//img[@alt='Create Campaign...']")
	    private WebElement CreateCampaignPage;
	
		@FindBy(name="campaignname")
		private WebElement campaignNameTextField;
		
		
		@FindBy(xpath="//input[@title='Save [Alt+S]']")
		private WebElement saveButton;


		//Getters method
		
		
		public WebElement getCreateCampaignPage() {
			return CreateCampaignPage;
		}


		public WebElement getCampaignNameTextField() {
			return campaignNameTextField;
		}


		public WebElement getSaveButton() {
			return saveButton;
		}
		
		
	    //BuisinessLogic
		//click Organization
		public void clickCampaignCreatePage()
		{
			CreateCampaignPage.click();
		}
		
		
		


				//Organization Name
				public void campaignNameTextField(String campaigndata)
				{
					campaignNameTextField.sendKeys(campaigndata);
				}
				
	//SaveButton
				public void saveButton()
				{
					saveButton.click();
				}
				
		
		
	
	
}