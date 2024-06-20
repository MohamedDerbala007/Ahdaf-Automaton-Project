package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PartyMappingsMenuPage extends PageBase {
	WebDriverWait wait;

	public PartyMappingsMenuPage(WebDriver driver) {
		super(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public WebElement systemAdminUser;

	@FindBy(xpath = "//*[@id=\"ctl00_ContentPlaceHolder1_accountablePartyControl_treeViewAccountablePartyt0\"]")
	WebElement accountablePartyOfRootBsc;

	@FindBy(name = "ctl00$ContentPlaceHolder1$UnmappingUsers$txtFiltrationUserControl")
	WebElement searchTextbox;

	@FindBy(xpath = "//*[@id=\"ctl00_ContentPlaceHolder1_accountablePartyControl_MaintainScrolledPanel1\"]")
	public WebElement accountablePartyStructure;

	@FindBy(xpath = "//*[@id=\"ctl00_ContentPlaceHolder1_UnmappingUsers_lbUsers\"]")
	WebElement userOptionsContainer;

	@FindBy(xpath = "//*[@id=\"ctl00_ContentPlaceHolder1_transferUSer_imgToLeft\"]")
	WebElement addTheSelectedUserBtn;

	@FindBy(xpath = "//*[@id=\"ctl00_ContentPlaceHolder1_UnmappingUsersimgSearchUserControl\"]")
	WebElement searchBtn;

	@FindBy(name = "ctl00$ContentPlaceHolder1$butMappingUsersApply")
	WebElement applyBtn;

	public void clickOnAccountablePartyOfRootBSC()
	{
		wait.until(ExpectedConditions.elementToBeClickable(accountablePartyOfRootBsc));
		clickButton(accountablePartyOfRootBsc);
	}

	public void addTheSelectedUser() {
		wait.until(ExpectedConditions.elementToBeClickable(addTheSelectedUserBtn));
		clickButton(addTheSelectedUserBtn);
	}

	public void clickOnApplyButton() 
	{
		wait.until(ExpectedConditions.elementToBeClickable(accountablePartyOfRootBsc));
		wait.until(ExpectedConditions.elementToBeClickable(applyBtn));
		clickButton(applyBtn);
	}

	public void filterUsersByUserName()
	{
		wait.until(ExpectedConditions.elementToBeClickable(searchTextbox));
		clickButton(searchTextbox);
		searchTextbox.sendKeys("System Admin");
		clickButton(searchBtn);
	}

	public void selectSystemAdminUser() 
	{
		wait.until(ExpectedConditions.visibilityOf(userOptionsContainer));
		List<WebElement> options = userOptionsContainer.findElements(By.tagName("option"));
		for (WebElement option : options) {
			if (option.getAttribute("value").equals("idsAdmin"))
			{
				systemAdminUser = option;
				wait.until(ExpectedConditions.elementToBeClickable(systemAdminUser));
				clickButton(systemAdminUser);
			}
			else 
			{
				System.out.println("System Admin Has been Already Mapped On The Accountable Party Of Root Bsc");
				break;
			}
		}
	}
}
