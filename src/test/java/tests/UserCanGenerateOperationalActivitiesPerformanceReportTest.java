package tests;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.OperationalActivitiesReportPage;
import pages.ReportsMenuPage;
import pages.SideMenuPage;
import tests.TestBases.TestBase;

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

		String mainWindowHandle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String handle : windowHandles) 
		{
			if (!handle.equals(mainWindowHandle)) 
			{
				driver.switchTo().window(handle);
				break;
			}
		}  
		operationalActivitiesReportObject = new OperationalActivitiesReportPage(driver);
		operationalActivitiesReportObject.selectRadioBtnOfDepartmentsPermissions();
		Thread.sleep(10000);
		operationalActivitiesReportObject.selectCheckboxOfOperationalActivities();
		Thread.sleep(10000);
		operationalActivitiesReportObject.clickOnGenerateBtn();
		Assert.assertEquals(operationalActivitiesReportObject.operationalActivitiesPerformanceReportTitle.getText(), "تقرير أداء الأنشطة التشغيلية");
		System.out.println("Operational Activities Report was generated Successfully");
		driver.switchTo().window(mainWindowHandle);
	}

}
