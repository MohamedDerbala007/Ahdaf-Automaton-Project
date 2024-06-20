package pages;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PermissionsMenuPage extends PageBase
{

	WebDriverWait wait;
	
	public PermissionsMenuPage(WebDriver driver) 
	{
		super(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	@FindBy(xpath = "//*[@id=\"ctl00_ContentPlaceHolder1_UsersAndGroups1_UsersAndGroupsTabs\"]/div/ul/li[1]/a/span/span/span")
	WebElement GroupPermissionsSettings;
	
	@FindBy(xpath = "//*[@id=\"ctl00_ContentPlaceHolder1_UsersAndGroups1_UsersAndGroupsTabs\"]/div/ul/li[2]/a/span/span/span")
	WebElement UsersPermissionsSettings;
	
	@FindBy(name = "ctl00$ContentPlaceHolder1$UsersAndGroups1$Users1$txtFiltrationUserControl")
	WebElement usersSearchTextbox;
	
	@FindBy(xpath = "//*[@id=\"ctl00_ContentPlaceHolder1_UsersAndGroups1_Groups1_rlbGroups_i0_lbGroupName\"]")
	WebElement AdministratorsGroup;
	
	@FindBy(xpath = "//*[@id=\"ctl00_ContentPlaceHolder1_RadPermissionsEditor1_RadGrid1_ctl00_ctl04_CheckAll\"]")
	WebElement checkboxOfAllPermissions;
	
	@FindBy(xpath = "//*[@id=\"ctl00_ContentPlaceHolder1_UsersAndGroups1_Users1imgSearchUserControl\"]")
	WebElement searchBtn;
	
	@FindBy(xpath = "//*[@id=\"ctl00_ContentPlaceHolder1_UsersAndGroups1_Users1_lbUsers\"]/option")
	WebElement SystemAdminUser;

	public void openGroupPermissionsSettings()
	{
		clickButton(GroupPermissionsSettings);
	}
	
	public void openUsersPermissionsSettings()
	{
		clickButton(UsersPermissionsSettings);
	}
	
	public void openAdministratorsGroupPermissions()
	{
		clickButton(AdministratorsGroup);
	}
	
	public void giveAllPermissionsOnAllSystem()
	{
		clickButton(checkboxOfAllPermissions);
	}
	
	public void selectSystemAdminUser()
	{
		clickButton(SystemAdminUser);
	}
	
	public void searchforSystemAdminInUsers()
	{
		wait.until(ExpectedConditions.elementToBeClickable(usersSearchTextbox));
		clickButton(usersSearchTextbox);
		usersSearchTextbox.sendKeys("System Admin");
		clickButton(searchBtn);
	}
}
