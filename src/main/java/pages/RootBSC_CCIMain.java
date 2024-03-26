package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RootBSC_CCIMain extends PageBase 
{
	public RootBSC_CCIMain(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(linkText = "المبادرات")
	WebElement InitiativesViewTab;
	
	@FindBy(linkText = "الأهداف المحددة")
	WebElement KPIsViewTab;
	
	public void openInitiativesView() throws InterruptedException
	{
		Thread.sleep(10000);
		clickButton(InitiativesViewTab);
	}
	
	public void openKPIsView()
	{
		clickButton(KPIsViewTab);
	}
}
