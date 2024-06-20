package tests;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdministrationMenuPage;
import pages.HomePage;
import pages.LoginPage;
import pages.PermissionsMenuPage;
import pages.SideMenuPage;
import pages.UsersAdministrationSettingsMenuPage;
import tests.TestBases.TestBase;

public class UsersPermissionSettingsAreDisplayedSuccessfullyTest extends TestBase {
    LoginPage loginObject;
    HomePage homeObject;
    SideMenuPage sideMenuObject;
    AdministrationMenuPage administrationMenuObject;
    UsersAdministrationSettingsMenuPage usersAdministrationSettingsMenuObject;
    PermissionsMenuPage permissionsMenuObject;
    String userName = "idsadmin";
    String password = "P@ssw0rd";

    @Test
    public void usersPermissionsSettingsAreDisplayedSuccessfully() throws InterruptedException 
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
        usersAdministrationSettingsMenuObject.OpenPermissionsSettings();
        Assert.assertTrue(usersAdministrationSettingsMenuObject.PermissionsSettings.isDisplayed());
        System.out.println("Permissions Settings Are Displayed Successfully");
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
		permissionsMenuObject = new PermissionsMenuPage(driver);
		permissionsMenuObject.openUsersPermissionsSettings();
		permissionsMenuObject.searchforSystemAdminInUsers();
		permissionsMenuObject.selectSystemAdminUser();
		Thread.sleep(5000);
		permissionsMenuObject.giveAllPermissionsOnAllSystem();
		System.out.println("System Admin Has Permission On All System");
    }
}
