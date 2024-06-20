package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.PortfoliosPerformanceReportPage;
import pages.ReportsMenuPage;
import pages.SideMenuPage;
import tests.TestBases.TestBase;

import java.util.Set;

public class UserCanGeneratePortfoliosPerformanceReportTest extends TestBase {
    LoginPage loginObject;
    HomePage homeObject;
    SideMenuPage sideMenuObject;
    ReportsMenuPage reportsMenuObject;
    PortfoliosPerformanceReportPage portfoliosPerformanceReportObject;
    String userName = "idsadmin";
    String password = "P@ssw0rd";

    @Test
    public void userCanGeneratePortfoliosPerformanceReportSuccessfully() throws InterruptedException {
        loginObject = new LoginPage(driver);
        loginObject.userLogin(userName, password);
        homeObject = new HomePage(driver);
        Thread.sleep(20000);
        homeObject.openSideMenu();
        sideMenuObject = new SideMenuPage(driver);
        sideMenuObject.openReportsMenu();
        reportsMenuObject = new ReportsMenuPage(driver);       
        reportsMenuObject.openPortfoliosPerformanceReport();
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
        portfoliosPerformanceReportObject = new PortfoliosPerformanceReportPage(driver);
        portfoliosPerformanceReportObject.generatePortfoliosPerformanceReport();
        Thread.sleep(15000);
        Assert.assertEquals(portfoliosPerformanceReportObject.portfoliosPerformanceReportTitle.getText(), "تقرير أداء المحافظ");
        System.out.println("Portfolios Performance Report was generated Successfully");
        driver.switchTo().window(mainWindowHandle);
    }
}
