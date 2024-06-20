package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.KPIsPerformanceReportPage;
import pages.LoginPage;
import pages.ReportsMenuPage;
import pages.SideMenuPage;
import tests.TestBases.TestBase;

import java.util.Set;

public class UserCanGenerateKPIsPerformanceReportTest extends TestBase {
    LoginPage loginObject;
    HomePage homeObject;
    SideMenuPage sideMenuObject;
    ReportsMenuPage reportsMenuObject;
    KPIsPerformanceReportPage kpisPerformanceReportObject;
    String userName = "idsadmin";
    String password = "P@ssw0rd";

    @Test
    public void userCanGenerateKPIsPerformanceReportSuccessfully() throws InterruptedException {
        loginObject = new LoginPage(driver);
        loginObject.userLogin(userName, password);
        homeObject = new HomePage(driver);
        Thread.sleep(20000);
        homeObject.openSideMenu();
        sideMenuObject = new SideMenuPage(driver);
        sideMenuObject.openReportsMenu();
        reportsMenuObject = new ReportsMenuPage(driver);       
        reportsMenuObject.openKPIsPerformanceReport();;
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
        kpisPerformanceReportObject = new KPIsPerformanceReportPage(driver);
        kpisPerformanceReportObject.generateKPIsPerformanceReport();
        Thread.sleep(15000);
        Assert.assertEquals(kpisPerformanceReportObject.kpisPerformanceReportTitle.getText(), "تقرير أداء مؤشرات الأداء");
        System.out.println("KPIs Performance Report was generated Successfully");
        driver.switchTo().window(mainWindowHandle);
    }
}
