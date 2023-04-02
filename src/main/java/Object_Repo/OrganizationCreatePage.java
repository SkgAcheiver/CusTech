package Object_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationCreatePage {

	
	public OrganizationCreatePage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	
	//Declaration
	
	  @FindBy(xpath="//img[@alt='Create Organization...']")
	    private WebElement organizationCreatePage;
	
		@FindBy(name="accountname")
		private WebElement organizationNameTextField;
		
		
		@FindBy(xpath="//input[@title='Save [Alt+S]']")
		private WebElement saveButton;


		//Getters method
		public WebElement getOrganizationCreatePage() {
			return organizationCreatePage;
		}


		public WebElement getOrganizationNameTextField() {
			return organizationNameTextField;
		}


		public WebElement getSaveButton() {
			return saveButton;
		}
		
	    //BuisinessLogic
		//click Organization
		public void clickOrganizationCreatePage()
		{
			organizationCreatePage.click();
		}
		
		
		//Organization Name
				public void organizationNameTextField(String Orgdata)
				{
					organizationNameTextField.sendKeys(Orgdata);
				}
				
	//SaveButton
				public void saveButton()
				{
					saveButton.click();
				}
				
		
		
	
	
}
