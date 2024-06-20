package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import tests.TestBases.TestBase;

public class AhdafBSCsStructureIsDisplayedInHomePageTest extends TestBase
{
	LoginPage loginObject ;
	HomePage homeObject;
	String userName = "idsadmin";
	String password = "P@ssw0rd";

	@Test
	public void userCanGenerateSummaryStrategicPerformanceReportSuccessfully() throws InterruptedException
	{
		loginObject = new LoginPage(driver);
		loginObject.userLogin(userName, password);
		homeObject = new HomePage(driver);
		Thread.sleep(25000);
		if (homeObject.ahdafBSCsStructure.isDisplayed()) 
		{
			System.out.println("Ahdaf BSCs Structure is displayed on the home page.");
		} else {
			System.out.println("Ahdaf BSCs Structure is not displayed on the home page.");
		}
	}

}
