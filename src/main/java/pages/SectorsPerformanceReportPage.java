package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SectorsPerformanceReportPage extends PageBase 
{

    public SectorsPerformanceReportPage(WebDriver driver) 
    {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"ctl00_ContentPlaceHolder1_RV1_ctl00_collapsiblePanel_BSCsSelector1_SABSCsHierarchy\"]/ul/li/div/span[2]")
    WebElement expandBtn;
    
    @FindBy(xpath = "//*[@id=\"ctl00_ContentPlaceHolder1_RV1_ctl00_collapsiblePanel_BSCsSelector1_SABSCsHierarchy\"]/ul/li/ul/li[1]/div/label/input")
    WebElement sectorCheckbox;
    
    @FindBy(xpath = "//*[@id=\"ctl00_ContentPlaceHolder1_RV1_ctl00_collapsiblePanel_btnGenerateReport\"]")
    WebElement generateReportBtn;
    
    @FindBy(linkText = "تقرير أداء القطاعات")
	public WebElement sectorsPerformanceReportTitle;

    public void generateSectorsPerformanceReport() 
    {
    	clickButton(expandBtn);
    	clickButton(sectorCheckbox);
    	clickButton(generateReportBtn);
        
    }
}
