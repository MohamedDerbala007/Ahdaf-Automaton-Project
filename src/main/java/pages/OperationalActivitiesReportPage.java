package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class OperationalActivitiesReportPage extends PageBase 
{

	public OperationalActivitiesReportPage(WebDriver driver) 
	{
		super(driver);
	}

	@FindBy(xpath = "//*[@id=\"ctl00_ContentPlaceHolder1_RV1_ctl00_collapsiblePanel_BSCsSelector1_SABSCsHierarchy\"]/ul/li[4]/div/label/input")
	WebElement checkbox;

	@FindBy(id = "ctl00_ContentPlaceHolder1_RV1_ctl00_collapsiblePanel_btnGenerateReport")
	WebElement generateReportBtn;

	public void generateOperationalActivitiesReport() 
	{
		clickButton(checkbox);
		clickButton(generateReportBtn);
	}
}
