package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KPIsPerformanceReportPage extends PageBase 
{

    public KPIsPerformanceReportPage(WebDriver driver) 
    {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"ctl00_ContentPlaceHolder1_RV1_ctl00_collapsiblePanel_BSCsSelector1_SABSCsHierarchy\"]/ul/li/div/span[2]")
    WebElement expandBtn;
    
    @FindBy(xpath = "//*[@id=\"ctl00_ContentPlaceHolder1_RV1_ctl00_collapsiblePanel_BSCsSelector1_SABSCsHierarchy\"]/ul/li/ul/li[1]/div/label/input")
    WebElement kpiCheckbox;
    
    @FindBy(xpath = "//*[@id=\"ctl00_ContentPlaceHolder1_RV1_ctl00_collapsiblePanel_btnGenerateReport\"]")
    WebElement generateReportBtn;
    
    @FindBy(linkText = "تقرير أداء مؤشرات الأداء")
	public WebElement kpisPerformanceReportTitle;

    public void generateKPIsPerformanceReport() 
    {
    	clickButton(expandBtn);
    	clickButton(kpiCheckbox);
    	clickButton(generateReportBtn);
        
    }
}
