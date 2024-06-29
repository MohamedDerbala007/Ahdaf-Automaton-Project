package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.SideMenuPage;
import pages.StandaloneKPIsPage;
import tests.TestBases.TestBase;

public class StandaloneKPIsGridIsDisplayedTest extends TestBase
{
	LoginPage loginObject ;
	HomePage homeObject;
	SideMenuPage sideMenuObject;
	StandaloneKPIsPage standaloneKPIsObject;
	String userName = "idsadmin";
	String password = "P@ssw0rd";
	
	@Test
	public void StandaloneKPIsGridIsDisplayedTestSuccessfully() throws InterruptedException
	{
		loginObject = new LoginPage(driver);
		loginObject.userLogin(userName, password);
		Thread.sleep(25000);
		homeObject = new HomePage(driver);
		homeObject.openSideMenu();
		sideMenuObject = new SideMenuPage(driver);
		sideMenuObject.openStandaloneKPIsPage();
		Thread.sleep(15000);
		standaloneKPIsObject = new StandaloneKPIsPage(driver);
		if 
		(standaloneKPIsObject.standaloneKPIsGrid.isDisplayed()) 
		{
			System.out.println("Standalone KPIs Grid is displayed Successfully");
		}
		else 
		{
			System.out.println("Standalone KPIs Grid is not displayed");
		}
	}

}
