package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SummaryStrategicPerformanceReportPage extends PageBase
{

	public SummaryStrategicPerformanceReportPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(linkText = "تقرير الأداء الاستراتيجي الملخص")
	public WebElement summaryStrategicPerformanceReportTitle;

}
