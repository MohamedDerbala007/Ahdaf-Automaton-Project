package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectsPerformanceReportPage extends PageBase 
{

    public ProjectsPerformanceReportPage(WebDriver driver) 
    {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"ctl00_ContentPlaceHolder1_RV1_ctl00_collapsiblePanel_BSCsSelector1_SABSCsHierarchy\"]/ul/li/ul/li[1]/div/label/input")
    WebElement projectCheckbox;
    
    @FindBy(xpath = "//*[@id=\"ctl00_ContentPlaceHolder1_RV1_ctl00_collapsiblePanel_btnGenerateReport\"]")
    WebElement generateReportBtn;
    
    @FindBy(linkText = "تقرير أداء المشاريع")
	public WebElement projectsPerformanceReportTitle;

    public void generateProjectsPerformanceReport() 
    {
    	clickButton(projectCheckbox);
    	clickButton(generateReportBtn);
        
    }
}
