package tests;

import java.util.Set;
import org.testng.annotations.Test;
import pages.DepartmentsPerformanceReportPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ReportsMenuPage;
import pages.SideMenuPage;
import tests.TestBases.TestBase;

public class UserCanGenerateDepartmentsPerformanceReportTest extends TestBase
{
	LoginPage loginObject ;
	HomePage homeObject;
	SideMenuPage sideMenuObject;
	ReportsMenuPage reportsMenuObject;
	DepartmentsPerformanceReportPage departmentsPerformanceReportObject;
	String userName = "idsadmin";
	String password = "P@ssw0rd";

	@Test
	public void userCanGenerateDepartmentsPerformanceReportSuccessfully() throws InterruptedException
	{
		loginObject = new LoginPage(driver);
		loginObject.userLogin(userName, password);
		homeObject = new HomePage(driver);
		Thread.sleep(30000);
		homeObject.openSideMenu();
		sideMenuObject = new SideMenuPage(driver);
		sideMenuObject.openReportsMenu();
		reportsMenuObject = new ReportsMenuPage(driver);
		reportsMenuObject.openDepartmentsPerformanceReport();
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
		departmentsPerformanceReportObject = new DepartmentsPerformanceReportPage(driver);
		departmentsPerformanceReportObject.generateDepartmentsPerformanceReport();
		Thread.sleep(30000);
		System.out.println("Departments Performance Report was generated Successfully");
		driver.switchTo().window(mainWindowHandle);
	}

}
