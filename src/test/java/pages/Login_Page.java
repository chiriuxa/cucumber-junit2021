package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

    public Login_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "txtUsername")
         public WebElement UserName;

    @FindBy(id = "txtPassword")
    public WebElement Password;

    @FindBy(id = "btnLogin")
    public WebElement Login;
}
