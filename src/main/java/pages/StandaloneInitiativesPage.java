package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StandaloneInitiativesPage extends PageBase 
{

    public StandaloneInitiativesPage(WebDriver driver) 
    {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"mainContainer\"]/div/div/mat-sidenav-container/mat-sidenav-content/ng-component/initiatives-grid/div/kendo-grid/div/kendo-grid-list/div")
    public WebElement standaloneInitiativesGrid;
    
   
}
