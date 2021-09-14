package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartAndDeleteFromCartPages {
    public AddToCartAndDeleteFromCartPages(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "(//*[@class=\"product-container\"])[1]")
    public WebElement Element1;

    @FindBy (xpath = "(//span[.='Add to cart'])[1]")
    public WebElement addToCartItem1;

    @FindBy (xpath = "(//*[@class=\"product-container\"])[2]")
    public WebElement Element2;

    @FindBy (xpath = "(//span[.='Add to cart'])[2]")
    public WebElement addToCartItem2
            ;
    @FindBy (xpath = "(//*[@class=\"product-container\"])[3]")
    public WebElement Element3;

    @FindBy (xpath = "(//span[.='Add to cart'])[3]")
    public WebElement addToCartItem3;

    @FindBy (xpath = "(//*[@class=\"product-container\"])[4]")
    public WebElement Element4;

    @FindBy (xpath = "(//span[.='Add to cart'])[4]")
    public WebElement addToCartItem4;

    @FindBy (xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span")
    public WebElement continueShoppingButton;

    @FindBy (xpath = "//a[@title=\"Proceed to checkout\"]")
    public WebElement proceedToCheckOut;

    @FindBy (xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
    public WebElement proceedToCheckOutButton;

    @FindBy (xpath = "//*[@id=\"cart_title\"]")
    public WebElement ShoppingCartSummaryText;

    @FindBy (xpath = "(//*[@id=\"cart_summary\"]/tbody/tr/td[7])[1]")
    public WebElement deleteFromShoppingCartButtonfForItem1;

    @FindBy (xpath = "(//*[@id=\"cart_summary\"]/tbody/tr/td[7])[2]")
    public WebElement deleteFromShoppingCartButtonfForItem2;

    @FindBy (xpath = "(//*[@id=\"cart_summary\"]/tbody/tr/td[7])[3]")
    public WebElement deleteFromShoppingCartButtonfForItem3;

    @FindBy (xpath = "(//*[@id=\"cart_summary\"]/tbody/tr/td[7])[4]")
    public WebElement deleteFromShoppingCartButtonfForItem4;


    @FindBy (xpath = "//*[@id=\"center_column\"]/p")
    public WebElement ShoppingCartEmptyText;


}
