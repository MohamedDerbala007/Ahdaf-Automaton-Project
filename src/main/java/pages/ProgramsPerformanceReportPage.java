package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProgramsPerformanceReportPage extends PageBase 
{

    public ProgramsPerformanceReportPage(WebDriver driver) 
    {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"ctl00_ContentPlaceHolder1_RV1_ctl00_collapsiblePanel_BSCsSelector1_SABSCsHierarchy\"]/ul/li/ul/li[2]/div/label/input")
    WebElement programCheckbox;
    
    @FindBy(xpath = "//*[@id=\"ctl00_ContentPlaceHolder1_RV1_ctl00_collapsiblePanel_btnGenerateReport\"]")
    WebElement generateReportBtn;
    
    @FindBy(linkText = "تقرير أداء البرامج")
	public WebElement programsPerformanceReportTitle;

    public void generateProgramsPerformanceReport() 
    {
    	clickButton(programCheckbox);
    	clickButton(generateReportBtn);
        
    }
}
