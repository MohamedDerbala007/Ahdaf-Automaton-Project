package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.GeneralStrategicPerformanceReportPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ReportsMenuPage;
import pages.SideMenuPage;

public class UserCanGenerateGeneralStrategicPerformanceReportTest extends TestBase
{
	LoginPage loginObject ;
	HomePage homeObject;
	SideMenuPage sideMenuObject;
	ReportsMenuPage reportsMenuObject;
	GeneralStrategicPerformanceReportPage generalStrategicPerformanceReportObject;
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
		reportsMenuObject.openGeneralStrategicPerformanceReport();
		Thread.sleep(15000);
		generalStrategicPerformanceReportObject = new GeneralStrategicPerformanceReportPage(driver);
		Assert.assertEquals(generalStrategicPerformanceReportObject.generalStrategicPerformanceReportTitle.getText(), "تقرير الأداء الاستراتيجي الشامل");
	}

}
