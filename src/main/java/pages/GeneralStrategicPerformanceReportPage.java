package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GeneralStrategicPerformanceReportPage extends PageBase
{

	public GeneralStrategicPerformanceReportPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(linkText = "تقرير الأداء الاستراتيجي الشامل")
	public WebElement generalStrategicPerformanceReportTitle;

}
