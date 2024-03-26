package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReportsMenuPage extends PageBase
{

	public ReportsMenuPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(linkText = "تقرير أداء الأنشطة التشغيلية")
	WebElement operationalActivitiesPerformanceReport;
	
	@FindBy(linkText = "تقرير الأداء الاستراتيجي الملخص")
	WebElement summaryStrategicPerformanceReport;
	
	@FindBy(linkText = "تقرير تحليل الأداء النوعي")
	WebElement qualitativePerformanceAnalysisReport;
	
	@FindBy(linkText = "تقرير الأداء الاستراتيجي الشامل")
	WebElement generalStrategicPerformanceReport;
	
	@FindBy(linkText = "تقرير أداء المشاريع")
	WebElement projectsPerformanceReport;
	
	public void openOperationalActivitiesPerformanceReport()
	{
		clickButton(operationalActivitiesPerformanceReport);
	}
	
	public void openSummaryStrategicPerformanceReport() 
	{
		clickButton(summaryStrategicPerformanceReport);
	}
	
	public void openQualitativePerformanceAnalysisReport()
	{
		clickButton(qualitativePerformanceAnalysisReport);
	}
	
	public void openGeneralStrategicPerformanceReport()
	{
		clickButton(generalStrategicPerformanceReport);
	}
	
	public void openProjectsPerformanceReport()
	{
		clickButton(projectsPerformanceReport);
	}

}
