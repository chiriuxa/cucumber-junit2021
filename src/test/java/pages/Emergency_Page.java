
package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Emergency_Page {


    public Emergency_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//a[text()='Emergency Contacts']")
    public WebElement EmergencyCont;

    @FindBy(id = "btnAddContact")
    public WebElement AddBtn;

    @FindBy(xpath = "//*[@id='emgcontacts_name']")
    public WebElement Name;

    @FindBy(id = "emgcontacts_relationship")
    public WebElement Relationship;

    @FindBy(xpath ="//input[contains(@id ='emgcontacts_homePhone')]")
    public WebElement HomeTelephone;

    @FindBy(id = "emgcontacts_mobilePhone")
    public WebElement MobileNumber;

    @FindBy(id = "emgcontacts_workPhone")
    public WebElement WorkTelephoneNum;

    @FindBy(id = "btnSaveEContact")
    public WebElement SaveButton;
}


