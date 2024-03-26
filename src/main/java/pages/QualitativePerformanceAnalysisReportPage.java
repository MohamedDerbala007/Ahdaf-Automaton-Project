package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QualitativePerformanceAnalysisReportPage extends PageBase
{

	public QualitativePerformanceAnalysisReportPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(linkText = "تقرير تحليل الأداء النوعي")
	public WebElement qualitativePerformanceAnalysisReportTitle;

}
