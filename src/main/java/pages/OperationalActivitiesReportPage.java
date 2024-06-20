package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OperationalActivitiesReportPage extends PageBase 
{

	public OperationalActivitiesReportPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"ctl00_ContentPlaceHolder1_RV1_ctl00_collapsiblePanel_BSCsSelector1_SABSCsHierarchy\"]/ul/li[3]/div/label/input")
	WebElement checkbox;

	@FindBy(xpath = "//*[@id=\"ctl00_ContentPlaceHolder1_RV1_ctl00_collapsiblePanel_btnGenerateReport\"]")
	WebElement generateReportBtn;
	
	@FindBy(xpath = "//*[@id=\"ctl00_ContentPlaceHolder1_RV1_ctl00_collapsiblePanel_valueORINdexRadioButtonList_1\"]")
	WebElement departmentPermissionsRadioBtn;
	
	@FindBy(linkText = "تقرير أداء الأنشطة التشغيلية")
	public WebElement operationalActivitiesPerformanceReportTitle;

	public void selectRadioBtnOfDepartmentsPermissions()
	{
		clickButton(departmentPermissionsRadioBtn);
	}
	
	public void selectCheckboxOfOperationalActivities() 
	{
		clickButton(checkbox);
	}
	
	public void clickOnGenerateBtn()
	{
		clickButton(generateReportBtn);
	}
}
