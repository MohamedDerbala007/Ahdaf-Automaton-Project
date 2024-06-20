package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UsersAdministrationSettingsMenuPage extends PageBase
{

	public UsersAdministrationSettingsMenuPage(WebDriver driver) 
	{
		super(driver);
	}

	@FindBy(xpath = "//*[@id=\"sidebar-panel\"]/mat-nav-list/app-layout-sidenav/div/mat-list-item[25]/div/div[3]/div/adminstrationtree/sa-tree/p-tree/div/ul/p-treenode[3]/li/ul/p-treenode[1]/li/div/span[2]/span/span")
	public WebElement UsersSettings;
	
	@FindBy(xpath = "//*[@id=\"sidebar-panel\"]/mat-nav-list/app-layout-sidenav/div/mat-list-item[25]/div/div[3]/div/adminstrationtree/sa-tree/p-tree/div/ul/p-treenode[3]/li/ul/p-treenode[2]/li/div/span[2]/span/span")
	public WebElement PermissionsSettings;
	
	@FindBy(xpath = "//*[@id=\"sidebar-panel\"]/mat-nav-list/app-layout-sidenav/div/mat-list-item[25]/div/div[3]/div/adminstrationtree/sa-tree/p-tree/div/ul/p-treenode[3]/li/ul/p-treenode[3]/li/div/span[2]/span/span")
	public WebElement AccountablePartyMapSettings;
	
	public void OpenUsersSettings()
	{
		clickButton(UsersSettings);
	}
	
	public void OpenPermissionsSettings()
	{
		clickButton(PermissionsSettings);
	}
	
	public void OpenAccountablePartyMappingSettings()
	{
		clickButton(AccountablePartyMapSettings);
	}
}
