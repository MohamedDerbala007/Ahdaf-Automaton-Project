package tests;

import org.testng.annotations.Test;
import pages.InitiativesViewInRootBSC;
import pages.LoginPage;
import tests.TestBases.TestBase2;

public class InitiativesGridIsDisplayedInRootBSCTest extends TestBase2
{
	LoginPage loginObject ;
	InitiativesViewInRootBSC initiativesViewInRootBSCObject;
	String userName = "idsadmin";
	String password = "P@ssw0rd";
	
	@Test
	public void userCanGenerateSummaryStrategicPerformanceReportSuccessfully() throws InterruptedException
	{
		loginObject = new LoginPage(driver);
		loginObject.userLogin(userName, password);
		Thread.sleep(10000);
		initiativesViewInRootBSCObject = new InitiativesViewInRootBSC(driver);
		if (initiativesViewInRootBSCObject.InitiativesGrid.isDisplayed()) {
			System.out.println("Initiatives Grid of Root BSC is displayed");
		} else {
			System.out.println("Initiatives Grid of Root BSC is not displayed");
		}
	}

}
