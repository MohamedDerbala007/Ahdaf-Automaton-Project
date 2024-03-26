package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MasterDashboardPage extends PageBase
{

	public MasterDashboardPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(css = "div.masterDashboard.container")
	public WebElement dataOfMasterDashboard;

}
