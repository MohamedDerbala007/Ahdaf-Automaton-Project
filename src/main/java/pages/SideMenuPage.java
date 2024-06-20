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
	
	
	public void openReportsMenu()
	{
		clickButton(reportsMenu);
	}
	
	public void openRootBSC_CCIMain()
	{
		clickButton(rootBSC);
	}
<<<<<<< Updated upstream
=======
	
	public void openAdmininstrationMenu()
	{
		clickButton(administrationMenu);
	}
>>>>>>> Stashed changes
}
