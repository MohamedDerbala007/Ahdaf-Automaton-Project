package tests;

import org.testng.annotations.Test;
import pages.KPIsViewInRootBSC;
import pages.LoginPage;
import tests.TestBases.TestBase3;

public class KPIsGridIsDisplayedInRootBSCTest extends TestBase3
{
	LoginPage loginObject ;
	KPIsViewInRootBSC KPIsViewInRootBSCObject;
	String userName = "idsadmin";
	String password = "P@ssw0rd";
	
	@Test
	public void userCanGenerateSummaryStrategicPerformanceReportSuccessfully() throws InterruptedException
	{
		loginObject = new LoginPage(driver);
		loginObject.userLogin(userName, password);
		Thread.sleep(10000);
		KPIsViewInRootBSCObject = new KPIsViewInRootBSC(driver);
		if (KPIsViewInRootBSCObject.KPIsGrid.isDisplayed()) {
			System.out.println("Indicators Grid of Root BSC is displayed");
		} else {
			System.out.println("Indicators Grid of Root BSC is not displayed");
		}
	}

}
