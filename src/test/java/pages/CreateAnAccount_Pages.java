package pages;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAnAccount_Pages {

    public CreateAnAccount_Pages(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class= \"account_creation\"]/h3")
    public WebElement personalInformationText;

    @FindBy (xpath = "//*[@id= \"id_gender2\"]")
    public WebElement mrsRadioButton;

    @FindBy (xpath = "//*[@id= \"customer_firstname\"]")
    public WebElement firstNamePersonalInfoBox;

    @FindBy (xpath = "//*[@id = \"customer_lastname\"]")
    public WebElement lastNamePersonalInfoBox;

    @FindBy (xpath = "//*[@id = \"passwd\"]")
    public WebElement passwordBox;

//    @FindBy (xpath = "//*[@id = \"firstname\"]")
//    public WebElement firstNameAddressBox;

//    @FindBy (xpath = "//*[@id = \"lastname\"]")
//    public WebElement lastNameAddressBox;

    @FindBy (xpath = "//*[@id = \"days\"]")
    public WebElement dateOfBirthDay;

    @FindBy (xpath = "//*[@id = \"months\"]")
    public WebElement dateOfBirthMonth;

    @FindBy (xpath = "//*[@id = \"years\"]")
    public WebElement dateOfBirthYear;

    @FindBy (xpath = "//*[@id = \"address1\"]")
    public WebElement addressLine1Box;

    @FindBy (xpath = "//*[@id = \"address2\"]")
    public WebElement addressLine2Box;

    @FindBy (xpath = "//*[@id = \"city\"]")
    public WebElement cityBox;

    @FindBy (xpath = "//*[@id = \"id_state\"]")
    public WebElement stateDropDown;

    @FindBy (xpath = "//*[@id = \"postcode\"]")
    public WebElement zipCodeBox;

    @FindBy (xpath = "//*[@id = \"phone_mobile\"]")
    public WebElement phoneNumberBox;

    @FindBy (xpath = "//*[@id = \"alias\"]")
    public WebElement aliasAddress;

    @FindBy(xpath = "//*[@id = \"submitAccount\"]")
    public WebElement registerButton;




}
