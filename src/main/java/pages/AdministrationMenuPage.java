package pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdministrationMenuPage extends PageBase {

    public AdministrationMenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div.ui-treenode-content.ui-treenode-selectable")
    List<WebElement> allAdministrationSettings;

    public WebElement Settings;
    public WebElement UsersAdministrationSettings;
    public WebElement PartyMappingsSettings;

    public void openSettingsMenu() 
    {
        for (WebElement element1 : allAdministrationSettings) 
        {
            if (element1.getText().equals("الإعدادات")) 
            {
                Settings = element1;
                clickButton(Settings);
                break;
            }
        }
    }

    public void openUsersAdministrationMenu() 
    {
        for (WebElement element2 : allAdministrationSettings) 
        {
            if (element2.getText().equals("إدارة المستخدمين")) 
            {
                UsersAdministrationSettings = element2;
                clickButton(UsersAdministrationSettings);
                break;
            }
        }
    }
    
    public void openPartyMappingsMenu() 
    {
        for (WebElement element3 : allAdministrationSettings) 
        {
            if (element3.getText().equals("ربط الجهات")) 
            {
                PartyMappingsSettings = element3;
                clickButton(PartyMappingsSettings);
                break;
            }
        }
    }
}
