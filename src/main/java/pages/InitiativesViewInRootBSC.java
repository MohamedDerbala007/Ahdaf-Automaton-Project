package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InitiativesViewInRootBSC extends PageBase
{

	public InitiativesViewInRootBSC(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "div.k-grid-content.k-virtual-content")
	public WebElement InitiativesGrid;
	
}
