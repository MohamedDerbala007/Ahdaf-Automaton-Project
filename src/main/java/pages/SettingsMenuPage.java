package pages;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SettingsMenuPage extends PageBase
{

	public SettingsMenuPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(css = "div.ui-treenode-content.ui-treenode-selectable")
	List<WebElement> allSettings;

	public void openIntegrationSettings()
    {
        for (WebElement link : allSettings) 
        {
            if (link.getText().equals("التكامل")) 
            {
                clickButton(link);
                break;
            }
        }
    }
}
