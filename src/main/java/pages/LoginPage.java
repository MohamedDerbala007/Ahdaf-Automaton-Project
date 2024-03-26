package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase
{

	public LoginPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(id = "Username")
	WebElement userNameTxtBox;
	
	@FindBy(id = "Password")
	WebElement passwordTxtBox;
	
	@FindBy(id = "SubmitLoginForm")
	WebElement loginBtn;

	public void userLogin(String userName , String password)
	{
		setTextInElementTextBox(userNameTxtBox, userName);
		setTextInElementTextBox(passwordTxtBox, password);
		clickButton(loginBtn);
	}
}
