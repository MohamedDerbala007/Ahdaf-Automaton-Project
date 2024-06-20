package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.IntermediateResultsMasterDashboardPage;
import pages.LoginPage;
import tests.TestBases.TestBase;

public class DataOfIntermediateResultsMasterDashboardDisplayedTest extends TestBase
{
	LoginPage loginObject ;
	HomePage homeObject;
	IntermediateResultsMasterDashboardPage intermediateResultsMasterDashboardObject;
	String userName = "idsadmin";
	String password = "P@ssw0rd";

	@Test
	public void userCanGenerateSummaryStrategicPerformanceReportSuccessfully() throws InterruptedException
	{
		loginObject = new LoginPage(driver);
		loginObject.userLogin(userName, password);
		homeObject = new HomePage(driver);
		Thread.sleep(25000);
		homeObject.openIntermediateResultsMasterDashboard();
		Thread.sleep(10000);
		intermediateResultsMasterDashboardObject = new IntermediateResultsMasterDashboardPage(driver);
		if (intermediateResultsMasterDashboardObject.dataOfIntermediateResultsMasterDashboard.isDisplayed())
		{
			System.out.println("The Data of Intermediate Results Master Dashboard Is Displayed Successfully.");
		}
		else 
		{
			System.out.println("The Data of Intermediate Results Master Dashboard Is Not Displayed.");
		}
	}

}
