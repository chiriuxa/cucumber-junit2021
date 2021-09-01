package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart_Pages {
    public AddToCart_Pages(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "(//img[@class=\"replace-2x img-responsive\"])[1]")
    public WebElement hoverElement;

    @FindBy (xpath = "(//span[.='Add to cart'])[1]")
    public WebElement addToCart;

    @FindBy (xpath = "//a[@title=\"Proceed to checkout\"]")
    public WebElement proceedToCheckOut;

    @FindBy (id = "total_price")
    public WebElement totalPrice;

    @FindBy (id = "total_product_price_1_1_0")
    public WebElement quantityPrice;
}
