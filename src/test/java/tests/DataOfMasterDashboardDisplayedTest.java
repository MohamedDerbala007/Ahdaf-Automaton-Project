package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.MasterDashboardPage;
import tests.TestBases.TestBase;

public class DataOfMasterDashboardDisplayedTest extends TestBase
{
	LoginPage loginObject ;
	HomePage homeObject;
	MasterDashboardPage masterDashboardObject;
	String userName = "idsadmin";
	String password = "P@ssw0rd";

	@Test
	public void userCanGenerateSummaryStrategicPerformanceReportSuccessfully() throws InterruptedException
	{
		loginObject = new LoginPage(driver);
		loginObject.userLogin(userName, password);
		homeObject = new HomePage(driver);
		Thread.sleep(25000);
		homeObject.openMasterDashboard();
		Thread.sleep(10000);
		masterDashboardObject = new MasterDashboardPage(driver);
		if (masterDashboardObject.dataOfMasterDashboard.isDisplayed())
		{
			System.out.println("The Data of Master Dashboard Is Displayed Successfully.");
		}
		else 
		{
			System.out.println("The Data of Master Dashboard Is Not Displayed.");
		}
	}

}
