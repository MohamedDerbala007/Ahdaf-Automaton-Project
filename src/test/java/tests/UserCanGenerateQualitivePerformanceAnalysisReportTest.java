package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.QualitativePerformanceAnalysisReportPage;
import pages.ReportsMenuPage;
import pages.SideMenuPage;

public class UserCanGenerateQualitivePerformanceAnalysisReportTest extends TestBase
{
	LoginPage loginObject ;
	HomePage homeObject;
	SideMenuPage sideMenuObject;
	ReportsMenuPage reportsMenuObject;
	QualitativePerformanceAnalysisReportPage qualitativePerformanceAnalysisReportObject;
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
		reportsMenuObject.openQualitativePerformanceAnalysisReport();
		Thread.sleep(15000);
		qualitativePerformanceAnalysisReportObject = new QualitativePerformanceAnalysisReportPage(driver);
		Assert.assertEquals(qualitativePerformanceAnalysisReportObject.qualitativePerformanceAnalysisReportTitle.getText(), "تقرير تحليل الأداء النوعي");
	}

}
