package tests;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdministrationMenuPage;
import pages.HomePage;
import pages.IntegrationSettingsMenuPage;
import pages.LoginPage;
import pages.SettingsMenuPage;
import pages.SideMenuPage;
import tests.TestBases.TestBase;

public class EnjizIntegrationSettingsAreDisplayedTest extends TestBase {
    LoginPage loginObject;
    HomePage homeObject;
    SideMenuPage sideMenuObject;
    AdministrationMenuPage administrationMenuObject;
    IntegrationSettingsMenuPage integrationSettingsMenuObject;
    SettingsMenuPage settingsMenuObject;
    String userName = "idsadmin";
    String password = "P@ssw0rd";

    @Test
    public void enjizIntegrationSettingsAreDisplayedSuccessfully() throws InterruptedException {
        loginObject = new LoginPage(driver);
        loginObject.userLogin(userName, password);
        homeObject = new HomePage(driver);
        Thread.sleep(20000);
        homeObject.openSideMenu();
        sideMenuObject = new SideMenuPage(driver);
        sideMenuObject.openAdmininstrationMenu();
        administrationMenuObject = new AdministrationMenuPage(driver);
        administrationMenuObject.openSettingsMenu();
        settingsMenuObject = new SettingsMenuPage(driver);
        settingsMenuObject.openIntegrationSettings();
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
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.tagName("iframe")));
		Thread.sleep(5000);
        integrationSettingsMenuObject = new IntegrationSettingsMenuPage(driver);
        integrationSettingsMenuObject.ClearAndAddEnjizURL();
        integrationSettingsMenuObject.ClearAndAddEnjizServiceURL();
        integrationSettingsMenuObject.SelectNetworkFromNetworksDDL();
        Thread.sleep(5000);
        integrationSettingsMenuObject.SaveEnjizIntegrationSettings();
        Thread.sleep(5000);
        Assert.assertEquals(integrationSettingsMenuObject.EnjizURLTextBox.getAttribute("value"), "https://pshwork.com/Enjiz");
        Assert.assertEquals(integrationSettingsMenuObject.EnjizServiceURLTextbox.getAttribute("value"), "https://pshwork.com/EnjizServices");
        System.out.println("URLs Of Enjiz Integrations Are Set Successfully");
        driver.switchTo().window(mainWindowHandle);
        homeObject = new HomePage(driver);
        wait.until(ExpectedConditions.elementToBeClickable(homeObject.integrationIconsDDL));
        homeObject.openIntegrationIconsDDL();
        Thread.sleep(5000);
        Assert.assertTrue(homeObject.EnjizIntegrationIcon.isDisplayed());
        System.out.println("Enjiz Integrarion Icon Is Displayed Successfully");
    }
}
