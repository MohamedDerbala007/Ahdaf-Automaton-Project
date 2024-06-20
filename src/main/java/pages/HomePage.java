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
	
	@FindBy(xpath = "//*[@id='contentHeader']/div/div/div[1]/div/div/i")
    public WebElement integrationIconsDDL;
	
	@FindBy(xpath = "//*[@id=\"contentHeader\"]/div/div/div[1]/div/div/div/div[2]")
	public WebElement BEClientIntegrationIcon;
	
	@FindBy(xpath = "//*[@id=\"contentHeader\"]/div/div/div[1]/div/div/div/div[1]")
	public WebElement EnjizIntegrationIcon;
	
	@FindBy(xpath = "//*[@id=\"contentHeader\"]/div/div/div[1]/div/div/div/div[3]")
	public WebElement WorkflowIntegrationIcon;
	

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
	
	public void openIntegrationIconsDDL()
	{
		clickButton(integrationIconsDDL);
	}
}
