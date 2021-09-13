package step_definitions;

import Utilities.Config;
import Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.AddToCart_Pages;

import java.util.concurrent.TimeUnit;

public class AddToCart_steps {

    AddToCart_Pages addToCart_pages = new AddToCart_Pages();

    Actions actions = new Actions(Driver.getDriver());


    @Given("I am in the Your Logo web page")
    public void i_am_in_the_your_logo_web_page() {
       Driver.getDriver().get(Config.getProperty("url"));
    }


    @And("Faded Short Sleeve T-shirts to hover over it")
    public void faded_short_sleeve_t_shirts_to_hover_over_it() {

        actions.moveToElement(addToCart_pages.hoverElement).perform();
    }

    @When("i click on Add to cart button")
    public void i_click_on_add_to_cart_button() {
        addToCart_pages.addToCart.click();

    }

    @When("i click on proceed to checkout  button")
    public void i_click_on_proceed_to_checkout_button() {

        addToCart_pages.proceedToCheckOut.click();
    }

    @Then("i should see the total price is correct")
    public void i_should_see_the_total_price_is_correct() {

        String totalPrice = addToCart_pages.totalPrice.getText();
       String quantityPrice =  addToCart_pages.quantityPrice.getText();
       double shippingPrice = 2.0;

       double totPrice = Double.parseDouble(totalPrice.replace("$",""));
       double quantPrice = Double.parseDouble(quantityPrice.replace("$",""));

        Assert.assertTrue((quantPrice+shippingPrice)==totPrice);


    }

}
