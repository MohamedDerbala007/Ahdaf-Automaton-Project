package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.OperationalActivitiesReportPage;
import pages.ReportsMenuPage;
import pages.SideMenuPage;

public class UserCanGenerateOperationalActivitiesPerformanceReportTest extends TestBase
{
	LoginPage loginObject ;
	HomePage homeObject;
	SideMenuPage sideMenuObject;
	ReportsMenuPage reportsMenuObject;
	OperationalActivitiesReportPage operationalActivitiesReportObject;
	String userName = "idsadmin";
	String password = "P@ssw0rd";
	
	@Test
	public void userCanGenerateOperationalActivitiesPerformanceReportSuccessfully() throws InterruptedException
	{
		loginObject = new LoginPage(driver);
		loginObject.userLogin(userName, password);
		homeObject = new HomePage(driver);
		Thread.sleep(20000);
		homeObject.openSideMenu();
		sideMenuObject = new SideMenuPage(driver);
		sideMenuObject.openReportsMenu();
		reportsMenuObject = new ReportsMenuPage(driver);
		reportsMenuObject.openOperationalActivitiesPerformanceReport();
		Thread.sleep(15000);
		operationalActivitiesReportObject = new OperationalActivitiesReportPage(driver);
		operationalActivitiesReportObject.generateOperationalActivitiesReport();
	}

}
