package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IntegrationSettingsMenuPage extends PageBase
{

	public IntegrationSettingsMenuPage(WebDriver driver) 
	{
		super(driver);
	}

	@FindBy(xpath = "//*[@id=\"ui-fieldset-3-content\"]/div/div[1]/div[2]/input")
	public WebElement BEClientURLTextbox;
	
	@FindBy(xpath = "//*[@id=\"ui-fieldset-3-content\"]/div/div[2]/div[2]/input")
	public WebElement BEClientServiceUrlTextbox;
	
	@FindBy(xpath = "//*[@id=\"ui-fieldset-2-content\"]/div/div[1]/div[2]/input")
	public WebElement WorkflowURLTextbox;
	
	@FindBy(xpath = "//*[@id=\"ui-fieldset-2-content\"]/div/div[2]/div[2]/input")
	public WebElement WorkflowServiceURLTextbox;
	
	@FindBy(xpath = "//*[@id=\"ui-fieldset-0-content\"]/div/div[1]/div[2]/input")
	public WebElement EnjizURLTextBox;
	
	@FindBy(xpath = "//*[@id=\"ui-fieldset-0-content\"]/div/div[2]/div[2]/input")
	public WebElement EnjizServiceURLTextbox;
	
	@FindBy(xpath = "//*[@id=\"ui-fieldset-0-content\"]/div/div[3]/div[2]/kendo-dropdownlist")
	public WebElement NetworksDDL;
	
	@FindBy(xpath = "//*[@id=\"ui-fieldset-0-content\"]/div/div[4]/div/button[1]")
	WebElement EnjizIntegrationSettingsSaveBtn;
	
	@FindBy(xpath = "//*[@id=\"ui-fieldset-3-content\"]/div/div[2]/div[3]/div/button[1]")
	public WebElement BEClientIntegrationSettingsSaveBtn;

	@FindBy(xpath = "//*[@id=\"ui-fieldset-2-content\"]/div/div[2]/div[3]/div/button[1]")
	public WebElement WorkflowIntegrationSettingsSaveBtn;
	
	public void ClearAndAddBEClientURL() 
	{
		clearText(BEClientURLTextbox);
		BEClientURLTextbox.sendKeys("https://pshwork.com/BEClient");
	}
	
	public void ClearAndAddBEClientServiceURL()
	{
		clearText(BEClientServiceUrlTextbox);
		BEClientServiceUrlTextbox.sendKeys("https://pshwork.com/BEWebApis");
	}
	
	public void ClearAndAddWorkflowURL()
	{
		clearText(WorkflowURLTextbox);
		WorkflowURLTextbox.sendKeys("https://pshwork.com/Workflow");
	}
	
	public void ClearAndAddWorkflowServiceURL()
	{
		clearText(WorkflowServiceURLTextbox);
		WorkflowServiceURLTextbox.sendKeys("https://pshwork.com/WorkflowWebApi");
	}
	
	public void ClearAndAddEnjizURL()
	{
		clearText(EnjizURLTextBox);
		EnjizURLTextBox.sendKeys("https://pshwork.com/Enjiz");
	}
	
	public void ClearAndAddEnjizServiceURL()
	{
		clearText(EnjizServiceURLTextbox);
		EnjizServiceURLTextbox.sendKeys("https://pshwork.com/EnjizServices");
	}
	
	public void SelectNetworkFromNetworksDDL()
	{
		clickButton(NetworksDDL);
	}
	
	public void SaveBEClientIntegrationSettings()
	{
		clickButton(BEClientIntegrationSettingsSaveBtn);
	}
	
	public void SaveEnjizIntegrationSettings()
	{
		clickButton(EnjizIntegrationSettingsSaveBtn);
	}
	
	public void SaveWorkflowIntegrationSettings()
	{
		clickButton(WorkflowIntegrationSettingsSaveBtn);
	}
}
