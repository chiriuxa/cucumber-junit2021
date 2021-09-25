package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Qualifications_Page {


    public Qualifications_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "menu_pim_viewMyDetails")
    public WebElement MyInfo;

    @FindBy(xpath = "//li[.='Qualifications']")  //li[.='Qualifications']   "//li[@class='selected']/a"
    public WebElement Qualifications;

    @FindBy(xpath = "//li[.='Languages']")
    public WebElement Languages;

    @FindBy (xpath = "//input[@id=\"addLanguage\"]")
    public WebElement Add;

    @FindBy(xpath = "//*[@name='language[code]']")
    public WebElement LanguageSelect;

    @FindBy(xpath = "//*[@id = 'language_lang_type']")
    public WebElement selectFluency;

    @FindBy(xpath = "//*[@id='language_competency']")
    public WebElement selectCompetency;

    @FindBy(xpath = "//*[@id='language_comments']")
    public WebElement Comments;

    @FindBy(xpath = "//*[@id='btnLanguageSave']")
    public WebElement SaveButton;
}
