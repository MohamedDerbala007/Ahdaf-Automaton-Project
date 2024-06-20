package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PortfoliosPerformanceReportPage extends PageBase 
{

    public PortfoliosPerformanceReportPage(WebDriver driver) 
    {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"ctl00_ContentPlaceHolder1_RV1_ctl00_collapsiblePanel_BSCsSelector1_SABSCsHierarchy\"]/ul/li/ul/li[2]/div/label/input")
    WebElement portfolioCheckbox;
    
    @FindBy(xpath = "//*[@id=\"ctl00_ContentPlaceHolder1_RV1_ctl00_collapsiblePanel_btnGenerateReport\"]")
    WebElement generateReportBtn;
    
    @FindBy(linkText = "تقرير أداء المحافظ")
	public WebElement portfoliosPerformanceReportTitle;

    public void generatePortfoliosPerformanceReport() 
    {
    	clickButton(portfolioCheckbox);
    	clickButton(generateReportBtn);
        
    }
}
