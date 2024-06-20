package tests.TestBases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase 
{
	public static WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@BeforeClass
	public void startDriver()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.navigate().to("https://pshwork.com/AhdafWeb/#/topview");
	}

	@AfterClass
	public void stopDriver()
	{
		driver.quit();
	}
}
