package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProceedToCheckOut_Pages {

    public ProceedToCheckOut_Pages(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id = \"create-account_form\"]/h3")
    public WebElement createAccountText;

    @FindBy(xpath = "//*[@id=\"email_create\"]")
    public WebElement emailEntryBox;

    @FindBy (css = "#SubmitCreate")
    public WebElement createAccountBox;




}
