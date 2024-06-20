package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import tests.TestBases.TestBase;

public class UserLoginTest extends TestBase
{
	LoginPage loginObject ;
	HomePage homeObject;
	String userName = "idsadmin";
	String password = "P@ssw0rd";
	
	@Test
	public void userCanLoginSuccessfully() throws InterruptedException
	{
		loginObject = new LoginPage(driver);
		loginObject.userLogin(userName, password);
		homeObject = new HomePage(driver);
		Thread.sleep(5000);
		Assert.assertTrue(homeObject.homePageIcon.isDisplayed(), "Home page icon is not displayed"); 
	}
}
