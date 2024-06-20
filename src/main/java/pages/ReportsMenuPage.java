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
	
	@FindBy(linkText = "تقرير أداء البرامج")
	WebElement programsPerformanceReport;
	
	@FindBy(linkText = "تقرير أداء الوحدات الإدارية")
	WebElement departmentsPerformanceReport;
	
	@FindBy(linkText = "تقرير أداء القطاعات")
	WebElement sectorsPerformanceReport;
	
	@FindBy(linkText = "تقرير أداء المحافظ")
	WebElement portfoliosPerformanceReport;
	
	@FindBy(linkText = "تقرير أداء مؤشرات الأداء")
	WebElement kpisPerformanceReport;
	
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
	
	public void openProgramsPerformanceReport()
	{
		clickButton(programsPerformanceReport);
	}
	
	public void openDepartmentsPerformanceReport()
	{
		clickButton(departmentsPerformanceReport);
	}
	
	public void openSectorsPerformanceReport()
	{
		clickButton(sectorsPerformanceReport);
	}
	
	public void openPortfoliosPerformanceReport()
	{
		clickButton(portfoliosPerformanceReport);
	}

	public void openKPIsPerformanceReport()
	{
		clickButton(kpisPerformanceReport);
	}
}
