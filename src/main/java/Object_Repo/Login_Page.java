package Object_Repo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	
	
	public Login_Page(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}
		
	    @FindBy(name="user_name")
	    private WebElement UserTextField;
	
		@FindBy(name="user_password")
		private WebElement PasswordTextField;
		
		
		@FindBy(id="submitButton")
		private WebElement LoginButton;
		
		//Getters Method
		
		public WebElement getUserTextField() {
			return UserTextField;
		}

		

		public WebElement getUserPassword() {
			return PasswordTextField;
		}

		
		

		public WebElement getLoginButton() {
			return LoginButton;
		}

		
		/**
		 * 
		 */
		
		public void loginToApp(String UserName,String Password)
		{
			
			UserTextField.sendKeys(UserName);
			PasswordTextField.sendKeys(Password);
			LoginButton.click();
		}
 
}
