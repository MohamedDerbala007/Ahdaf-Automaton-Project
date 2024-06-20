package tests;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdministrationMenuPage;
import pages.HomePage;
import pages.LoginPage;
import pages.SideMenuPage;
import pages.UsersAdministrationSettingsMenuPage;
import pages.UsersSettingsMenuPage;
import tests.TestBases.TestBase;

public class UsersSettingsAreDisplayedSuccessfullyTest extends TestBase {
    LoginPage loginObject;
    HomePage homeObject;
    SideMenuPage sideMenuObject;
    AdministrationMenuPage administrationMenuObject;
    UsersAdministrationSettingsMenuPage usersAdministrationSettingsMenuObject;
    UsersSettingsMenuPage usersSettingsMenuObject;
    String userName = "idsadmin";
    String password = "P@ssw0rd";

    @Test
    public void usersSettingsAreDisplayedSuccessfully() throws InterruptedException 
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
        usersAdministrationSettingsMenuObject.OpenUsersSettings();
        Assert.assertTrue(usersAdministrationSettingsMenuObject.PermissionsSettings.isDisplayed());
        System.out.println("Users Settings Are Displayed Successfully");
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
		usersSettingsMenuObject = new UsersSettingsMenuPage(driver);
		usersSettingsMenuObject.openAllUsersSettings();
		Assert.assertTrue(usersSettingsMenuObject.usersGrid.isDisplayed());
		System.out.println("Users Grid Is Displayed Successfully");
		Thread.sleep(5000);
		usersSettingsMenuObject.addNewUser();
		Assert.assertTrue(usersSettingsMenuObject.detailsOfNewUser.isDisplayed());
		Thread.sleep(5000);
    }
}
