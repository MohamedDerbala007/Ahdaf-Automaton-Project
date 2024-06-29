package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.SideMenuPage;
import pages.StandaloneInitiativesPage;
import tests.TestBases.TestBase;

public class StandaloneInitiativesGridIsDisplayedTest extends TestBase
{
	LoginPage loginObject ;
	HomePage homeObject;
	SideMenuPage sideMenuObject;
	StandaloneInitiativesPage standaloneInitiativesObject;
	String userName = "idsadmin";
	String password = "P@ssw0rd";
	
	@Test
	public void StandaloneInitiativesGridIsDisplayedTestSuccessfully() throws InterruptedException
	{
		loginObject = new LoginPage(driver);
		loginObject.userLogin(userName, password);
		Thread.sleep(25000);
		homeObject = new HomePage(driver);
		homeObject.openSideMenu();
		sideMenuObject = new SideMenuPage(driver);
		sideMenuObject.openStandaloneInitiativesPage();
		Thread.sleep(15000);
		standaloneInitiativesObject = new StandaloneInitiativesPage(driver);
		if (standaloneInitiativesObject.standaloneInitiativesGrid.isDisplayed()) {
			System.out.println("Standalone Initiatives Grid is displayed Successfully");
		} else {
			System.out.println("Standalone Initiatives Grid is not displayed");
		}
	}

}
