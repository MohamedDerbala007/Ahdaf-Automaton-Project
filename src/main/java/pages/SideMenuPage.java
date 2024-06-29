package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SideMenuPage extends PageBase
{

	public SideMenuPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(linkText = "التقارير")
	WebElement reportsMenu;
	
	@FindBy(id = "BSCName")
	WebElement rootBSC;
	
	@FindBy(xpath = "//*[@id=\"sidebar-panel\"]/mat-nav-list/app-layout-sidenav/div/mat-list-item[25]/div/a/span[1]")
	WebElement administrationMenu;
	
	@FindBy(xpath = "//*[@id=\"sidebar-panel\"]/mat-nav-list/app-layout-sidenav/div/mat-list-item[1]/div/a/span")
	WebElement standaloneInitiatives;
	
	@FindBy(xpath = "//*[@id=\"sidebar-panel\"]/mat-nav-list/app-layout-sidenav/div/mat-list-item[2]/div/a/span")
	WebElement standaloneKPIs;
	
	public void openReportsMenu()
	{
		clickButton(reportsMenu);
	}
	
	public void openRootBSC_CCIMain()
	{
		clickButton(rootBSC);
	}
	
	public void openAdmininstrationMenu()
	{
		clickButton(administrationMenu);
	}
	
	public void openStandaloneInitiativesPage()
	{
		clickButton(standaloneInitiatives);
	}
	
	public void openStandaloneKPIsPage()
	{
		clickButton(standaloneKPIs);
	}
}
