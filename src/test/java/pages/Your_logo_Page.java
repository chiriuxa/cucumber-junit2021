package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Your_logo_Page {

    public  Your_logo_Page(){

        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//a[@class=\"login\"]")
    public WebElement SignBtn;

    @FindBy(xpath = "//*[@id = \"create-account_form\"]/h3")
    public WebElement createAccountText;

    @FindBy(xpath = "//*[@id=\"email_create\"]")
    public WebElement emailEntryBox;

    @FindBy (css = "#SubmitCreate")
    public WebElement createAccountBox;

    @FindBy(xpath = "//*[@class= \"account_creation\"]/h3")
    public WebElement personalInformationText;


    @FindBy(css ="#customer_firstname")
    public WebElement firstName;

    @FindBy(id = "customer_lastname")
    public WebElement lastName;

    @FindBy(id = "passwd")
    public WebElement password;

    @FindBy(xpath= "(//select[@class=\"form-control\"])[1]")
    public WebElement dateOfBirthDay;

    @FindBy (xpath = "//*[@id = \"months\"]")
    public WebElement dateOfBirthMonth;

    @FindBy (xpath = "//*[@id = \"years\"]")
    public WebElement dateOfBirthYear;

    @FindBy(xpath = "(//*[@class=\"form-control\"])[1]")
    public WebElement Address;

    @FindBy(xpath ="//*[@id=\"city\"]")
    public WebElement City;

    @FindBy(xpath = "//select[@name=\"id_country\"]")
    public WebElement StateSelected;

    @FindBy(xpath = "//*[@id=\"postcode\"]")
    public WebElement ZipCode;

    @FindBy(xpath = "//*[@id=\"phone_mobile\"]")
    public WebElement MobilePhone;

    @FindBy(xpath = "//*[@name=\"alias\"]")
    public WebElement AssignAliasAddress;

    @FindBy(xpath="(//*[@id=\"submitAccount\"])")
    public WebElement RegisterBtn;
}
