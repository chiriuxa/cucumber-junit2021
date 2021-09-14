package step_definitions;

import Utilities.Config;
import Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AddToCartAndDeleteFromCartPages;

import java.util.concurrent.TimeUnit;

public class AddToCartAndDeleteFromCartSteps {

    AddToCartAndDeleteFromCartPages addToCartAndDeleteFromCartPages = new AddToCartAndDeleteFromCartPages();

    Actions actions = new Actions(Driver.getDriver());


    @Given("I am in the Your Logo web page")
    public void i_am_in_the_your_logo_web_page() {
       Driver.getDriver().get("http://automationpractice.com/index.php");
    }


    @Given("hover over element1")
    public void hover_over_element1() {
        actions.moveToElement(addToCartAndDeleteFromCartPages.Element1).perform();
    }

    @When("i click on Add to cart button item1")
    public void i_click_on_add_to_cart_button_item1() {
        addToCartAndDeleteFromCartPages.addToCartItem1.click();
    }

    @When("press continue shopping button")
    public void press_continue_shopping_button() {
      Driver.getDriver().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        addToCartAndDeleteFromCartPages.continueShoppingButton.click();
    }

    @Given("hover over element2")
    public void hover_over_element2() {
        actions.moveToElement(addToCartAndDeleteFromCartPages.Element2).perform();
    }

    @When("i click on Add to cart button item2")
    public void i_click_on_add_to_cart_button_item2() {
        addToCartAndDeleteFromCartPages.addToCartItem2.click();
    }

    @Given("hover over element3")
    public void hover_over_element3() {
        actions.moveToElement(addToCartAndDeleteFromCartPages.Element3).perform();
    }

    @When("i click on Add to cart button item3")
    public void i_click_on_add_to_cart_button_item3() {
        addToCartAndDeleteFromCartPages.addToCartItem3.click();
    }

    @Given("hover over element4")
    public void hover_over_element4() {
        actions.moveToElement(addToCartAndDeleteFromCartPages.Element4).perform();
    }

    @When("i click on Add to cart button item4")
    public void i_click_on_add_to_cart_button_item4() {
        addToCartAndDeleteFromCartPages.addToCartItem4.click();
    }

    @When("Pressing on Proceed to Checkout Button")
    public void pressing_on_proceed_to_checkout_button() {
        addToCartAndDeleteFromCartPages.proceedToCheckOutButton.click();
    }

    @When("I verify if user is on right page an SHOPPING-CART SUMMARY text is displayed")
    public void i_verify_if_user_is_on_right_page_an_shopping_cart_summary_text_is_displayed() {
       Assert.assertTrue(addToCartAndDeleteFromCartPages.ShoppingCartSummaryText.getText()
               .contains(Config.getProperty("expectedShoppingCartSummaryText")));
    }


    @When("I press delete from cart button for item1")
    public void i_press_delete_from_cart_button_for_item1() {

        addToCartAndDeleteFromCartPages.deleteFromShoppingCartButtonfForItem4.click();
    }

    @When("I press delete from cart button for item2")
    public void i_press_delete_from_cart_button_for_item2() {

        addToCartAndDeleteFromCartPages.deleteFromShoppingCartButtonfForItem3.click();
    }

    @When("I press delete from cart button for item3")
    public void i_press_delete_from_cart_button_for_item3() {
        addToCartAndDeleteFromCartPages.deleteFromShoppingCartButtonfForItem2.click();
    }

    @When("I press delete from cart button for item4")
    public void i_press_delete_from_cart_button_for_item4() {

        addToCartAndDeleteFromCartPages.deleteFromShoppingCartButtonfForItem1.click();
    }

    @When("I check if shopping cart empty text is displayed")
    public void i_check_if_shopping_cart_empty_text_is_displayed() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"center_column\"]/p")));

        Assert.assertEquals(Config.getProperty("expectedShoppingCartEmptyText")
                , addToCartAndDeleteFromCartPages.ShoppingCartEmptyText.getText());
    }


}
