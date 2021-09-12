package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirm_Email_Pages {

    public Confirm_Email_Pages(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//li/a[@class=\"sf-with-ul\"])[1]")
    public WebElement womenBtn;

    @FindBy(xpath = "//select[@id=\"selectProductSort\"]")
    public WebElement dropdown;

    @FindBy(xpath = "//li/a/i[@class=\"icon-th-large\"]")
    public WebElement gridBtn;

    @FindBy(xpath = "(//div/a/img[@class=\"replace-2x img-responsive\"])[2]")
    public WebElement blouse;

    @FindBy(xpath = "//a/span/i[@class=\"icon-plus\"]")
    public WebElement increaseQuantity;

    @FindBy(xpath = "//select[@id=\"group_1\"]")
    public WebElement sizeDropDown;

    @FindBy(xpath = "(//ul[@id=\"color_to_pick_list\"]/li/a)[1]")
    public WebElement colorBox;

    @FindBy(xpath = "//button[@class=\"exclusive\"]/span")
    public WebElement addToCart;

    @FindBy(xpath = "//div[@class=\"button-container\"]/span/span")
    public WebElement continueShoppingBtn;

    @FindBy(xpath = "//li/a[@id=\"send_friend_button\"]")
    public WebElement sendToFriendBtn;

    @FindBy(xpath = "//input[@id=\"friend_name\"]")
    public WebElement frindName;

    @FindBy(xpath = "//input[@id=\"friend_email\"]")
    public WebElement emailFriend;

    @FindBy(xpath = "//button[@id=\"sendEmail\"]")
    public WebElement sendButton;

    @FindBy(xpath = "//div[@class=\"fancybox-inner\"]/p[1]")
    public WebElement confirmText;
}
