package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DepartmentsPerformanceReportPage extends PageBase 
{

    public DepartmentsPerformanceReportPage(WebDriver driver) 
    {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"ctl00_ContentPlaceHolder1_RV1_ctl00_collapsiblePanel_BSCsSelector1_SABSCsHierarchy\"]/ul/li[1]/div/label/input")
    WebElement departmentCheckbox;
    
    @FindBy(xpath = "//*[@id=\"ctl00_ContentPlaceHolder1_RV1_ctl00_collapsiblePanel_btnGenerateReport\"]")
    WebElement generateReportBtn;
    
    @FindBy(linkText = "تقرير أداء الوحدات الإدارية")
	public WebElement departmentsPerformanceReportTitle;

    public void generateDepartmentsPerformanceReport() 
    {
    	clickButton(departmentCheckbox);
    	clickButton(generateReportBtn);
        
    }
}
