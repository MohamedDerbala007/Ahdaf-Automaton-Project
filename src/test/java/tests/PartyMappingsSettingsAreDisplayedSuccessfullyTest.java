package tests;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdministrationMenuPage;
import pages.HomePage;
import pages.LoginPage;
import pages.PartyMappingsMenuPage;
import pages.SideMenuPage;
import pages.UsersAdministrationSettingsMenuPage;
import tests.TestBases.TestBase;

public class PartyMappingsSettingsAreDisplayedSuccessfullyTest extends TestBase {
    LoginPage loginObject;
    HomePage homeObject;
    SideMenuPage sideMenuObject;
    AdministrationMenuPage administrationMenuObject;
    UsersAdministrationSettingsMenuPage usersAdministrationSettingsMenuObject;
    PartyMappingsMenuPage partyMappingsMenuObject;
    String userName = "idsadmin";
    String password = "P@ssw0rd";

    @Test
    public void partyMappingsSettingsAreDisplayedSuccessfully() throws InterruptedException 
    {
        loginObject = new LoginPage(driver);
        loginObject.userLogin(userName, password);
        homeObject = new HomePage(driver);
        Thread.sleep(20000);
        homeObject.openSideMenu();
        sideMenuObject = new SideMenuPage(driver);
        sideMenuObject.openAdmininstrationMenu();
        administrationMenuObject = new AdministrationMenuPage(driver);
        administrationMenuObject.openUsersAdministrationMenu();
        Assert.assertTrue(administrationMenuObject.UsersAdministrationSettings.isDisplayed());
        System.out.println("Users Administration Settings Are Displayed Successfully");
        usersAdministrationSettingsMenuObject = new UsersAdministrationSettingsMenuPage(driver);
        usersAdministrationSettingsMenuObject.OpenAccountablePartyMappingSettings();;
        Assert.assertTrue(usersAdministrationSettingsMenuObject.AccountablePartyMapSettings.isDisplayed());
        System.out.println("Part Mappings Settings Are Displayed Successfully");
        Thread.sleep(5000);
        String mainWindowHandle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String handle : windowHandles) 
		{
			if (!handle.equals(mainWindowHandle)) 
			{
				driver.switchTo().window(handle);
				break;
			}
		}  
		partyMappingsMenuObject = new PartyMappingsMenuPage(driver);
		Assert.assertTrue(partyMappingsMenuObject.accountablePartyStructure.isDisplayed());
		System.out.println("Accountable Party Structure Is Displayed Successfully");
		partyMappingsMenuObject.clickOnAccountablePartyOfRootBSC();
		partyMappingsMenuObject.filterUsersByUserName();
		partyMappingsMenuObject.selectSystemAdminUser();
		partyMappingsMenuObject.addTheSelectedUser();
		partyMappingsMenuObject.clickOnApplyButton();
		Thread.sleep(5000);
		System.out.println("System Admin Has been Mapped On The Accountable Party Of Root Bsc");
    }
}
