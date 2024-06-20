package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.ProgramsPerformanceReportPage;
import pages.ReportsMenuPage;
import pages.SideMenuPage;
import tests.TestBases.TestBase;

import java.util.Set;

public class UserCanGenerateProgramsPerformanceReportTest extends TestBase {
    LoginPage loginObject;
    HomePage homeObject;
    SideMenuPage sideMenuObject;
    ReportsMenuPage reportsMenuObject;
    ProgramsPerformanceReportPage programsPerformanceReportObject;
    String userName = "idsadmin";
    String password = "P@ssw0rd";

    @Test
    public void userCanGenerateProgramsPerformanceReportSuccessfully() throws InterruptedException {
        loginObject = new LoginPage(driver);
        loginObject.userLogin(userName, password);
        homeObject = new HomePage(driver);
        Thread.sleep(20000);
        homeObject.openSideMenu();
        sideMenuObject = new SideMenuPage(driver);
        sideMenuObject.openReportsMenu();
        reportsMenuObject = new ReportsMenuPage(driver);       
        reportsMenuObject.openProgramsPerformanceReport();
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
        programsPerformanceReportObject = new ProgramsPerformanceReportPage(driver);
        programsPerformanceReportObject.generateProgramsPerformanceReport();
        Thread.sleep(15000);
        Assert.assertEquals(programsPerformanceReportObject.programsPerformanceReportTitle.getText(), "تقرير أداء البرامج");
        System.out.println("Programs Performance Report was generated Successfully");
        driver.switchTo().window(mainWindowHandle);
    }
}
