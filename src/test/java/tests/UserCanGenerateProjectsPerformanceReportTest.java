package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.ProjectsPerformanceReportPage;
import pages.ReportsMenuPage;
import pages.SideMenuPage;
import tests.TestBases.TestBase;

import java.util.Set;

public class UserCanGenerateProjectsPerformanceReportTest extends TestBase {
    LoginPage loginObject;
    HomePage homeObject;
    SideMenuPage sideMenuObject;
    ReportsMenuPage reportsMenuObject;
    ProjectsPerformanceReportPage projectsPerformanceReportObject;
    String userName = "idsadmin";
    String password = "P@ssw0rd";

    @Test
    public void userCanGenerateProjectsPerformanceReportSuccessfully() throws InterruptedException {
        loginObject = new LoginPage(driver);
        loginObject.userLogin(userName, password);
        homeObject = new HomePage(driver);
        Thread.sleep(20000);
        homeObject.openSideMenu();
        sideMenuObject = new SideMenuPage(driver);
        sideMenuObject.openReportsMenu();
        reportsMenuObject = new ReportsMenuPage(driver);       
        reportsMenuObject.openProjectsPerformanceReport();
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
        projectsPerformanceReportObject = new ProjectsPerformanceReportPage(driver);
        projectsPerformanceReportObject.generateProjectsPerformanceReport();
        Thread.sleep(15000);
        Assert.assertEquals(projectsPerformanceReportObject.projectsPerformanceReportTitle.getText(), "تقرير أداء المشاريع");
        System.out.println("Projects Performance Report was generated Successfully");
        driver.switchTo().window(mainWindowHandle);
    }
}
