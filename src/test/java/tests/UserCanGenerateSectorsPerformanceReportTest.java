package tests;

import java.util.Set;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.ReportsMenuPage;
import pages.SectorsPerformanceReportPage;
import pages.SideMenuPage;
import tests.TestBases.TestBase;

public class UserCanGenerateSectorsPerformanceReportTest extends TestBase
{
	LoginPage loginObject ;
	HomePage homeObject;
	SideMenuPage sideMenuObject;
	ReportsMenuPage reportsMenuObject;
	SectorsPerformanceReportPage sectorsPerformanceReportObject;
	String userName = "idsadmin";
	String password = "P@ssw0rd";

	@Test
	public void userCanGenerateDepartmentsPerformanceReportSuccessfully() throws InterruptedException
	{
		loginObject = new LoginPage(driver);
		loginObject.userLogin(userName, password);
		homeObject = new HomePage(driver);
		Thread.sleep(10000);
		homeObject.openSideMenu();
		sideMenuObject = new SideMenuPage(driver);
		sideMenuObject.openReportsMenu();
		reportsMenuObject = new ReportsMenuPage(driver);
		reportsMenuObject.openSectorsPerformanceReport();
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
		
		Thread.sleep(10000);
		sectorsPerformanceReportObject = new SectorsPerformanceReportPage(driver);
		sectorsPerformanceReportObject.generateSectorsPerformanceReport();
		Thread.sleep(10000);
		Assert.assertEquals(sectorsPerformanceReportObject.sectorsPerformanceReportTitle.getText(), "تقرير أداء القطاعات");
		System.out.println("Sectors Performance Report was generated Successfully");
		driver.switchTo().window(mainWindowHandle);
	}

}
