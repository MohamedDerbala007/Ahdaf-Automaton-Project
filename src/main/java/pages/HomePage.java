package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase
{

	public HomePage(WebDriver driver) 
	{
		super(driver);
	}

	@FindBy(css = "i.fa.fa-home")
	public WebElement homePageIcon;

	@FindBy(id = "closebtn")
	WebElement sideMenuBtn;

	@FindBy(className = "smartMenuLink")
	public WebElement ahdafBSCsStructure;
	
	@FindBy(css = "i.fa.fa-pie-chart")
	WebElement masterDashboardIcon;
	
	@FindBy(css = "i.fa.fa-area-chart")
	WebElement intermediateResultsMasterDashboard;
	

	public void openSideMenu()
	{
		clickButton(sideMenuBtn);
	}
	
	public void openMasterDashboard()
	{
		clickButton(masterDashboardIcon);
	}
	
	public void openIntermediateResultsMasterDashboard()
	{
		clickButton(intermediateResultsMasterDashboard);
	}
}
