package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IntermediateResultsMasterDashboardPage extends PageBase
{

	public IntermediateResultsMasterDashboardPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(css = "mat-sidenav-container.app-inner.container-fluid.col-container.mat-drawer-container.mat-sidenav-container.ng-animate-disabled")
	public WebElement dataOfIntermediateResultsMasterDashboard;

}
