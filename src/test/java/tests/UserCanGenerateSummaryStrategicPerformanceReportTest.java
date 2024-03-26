package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ReportsMenuPage;
import pages.SideMenuPage;
import pages.SummaryStrategicPerformanceReportPage;

public class UserCanGenerateSummaryStrategicPerformanceReportTest extends TestBase
{
	LoginPage loginObject ;
	HomePage homeObject;
	SideMenuPage sideMenuObject;
	ReportsMenuPage reportsMenuObject;
	SummaryStrategicPerformanceReportPage SummaryStrategicPerformanceReporObject;
	String userName = "idsadmin";
	String password = "P@ssw0rd";
	
	@Test
	public void userCanGenerateSummaryStrategicPerformanceReportSuccessfully() throws InterruptedException
	{
		loginObject = new LoginPage(driver);
		loginObject.userLogin(userName, password);
		homeObject = new HomePage(driver);
		Thread.sleep(10000);
		homeObject.openSideMenu();
		sideMenuObject = new SideMenuPage(driver);
		sideMenuObject.openReportsMenu();
		reportsMenuObject = new ReportsMenuPage(driver);
		reportsMenuObject.openSummaryStrategicPerformanceReport();
		Thread.sleep(15000);
		SummaryStrategicPerformanceReporObject = new SummaryStrategicPerformanceReportPage(driver);
		Assert.assertEquals(SummaryStrategicPerformanceReporObject.summaryStrategicPerformanceReportTitle.getText(), "تقرير الأداء الاستراتيجي الملخص");
	}

}
