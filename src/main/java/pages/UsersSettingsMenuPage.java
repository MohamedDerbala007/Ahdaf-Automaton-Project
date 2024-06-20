package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UsersSettingsMenuPage extends PageBase
{

	public UsersSettingsMenuPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath = "//*[@id=\"page-container\"]/div/div[1]/div/ul/li[1]/a")
	WebElement allUsersSettings;
	
	@FindBy(xpath = "//*[@id=\"page-container\"]/div/div[1]/div/ul/li[2]/a")
	WebElement addNewUser;
	
	@FindBy(xpath = "//*[@id=\"kendoContainer\"]")
	public WebElement usersGrid;
	
	@FindBy(xpath = "//*[@id=\"page-container\"]/div/div[2]/div[2]/div")
	public WebElement detailsOfNewUser;

	public void openAllUsersSettings()
    {
        clickButton(allUsersSettings);
    }
	
	public void addNewUser()
	{
		clickButton(addNewUser);
	}
}
