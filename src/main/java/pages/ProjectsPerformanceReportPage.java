package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectsPerformanceReportPage extends PageBase
{

	public ProjectsPerformanceReportPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(linkText = "تقرير أداء المشاريع")
	public WebElement projectsPerformanceReportTitle;

}
