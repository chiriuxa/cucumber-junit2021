package step_definitions;

import Utilities.Config;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.Confirm_Email_Pages;

public class Confirm_Email_steps {

    Confirm_Email_Pages confirm_email_pages = new Confirm_Email_Pages();


    @Given("navigating to the Home page")
    public void navigating_to_the_home_page() {
        Driver.getDriver().get(Config.getProperty("url"));

    }

    @When("click the header WOMEN link")
    public void click_the_header_women_link() {
        confirm_email_pages.womenBtn.click();

    }

    @When("click on the dropdown and select index {int}")
    public void click_on_the_dropdown_and_select_index(Integer int1) {
        Select select = new Select(confirm_email_pages.dropdown);
        select.selectByIndex(2);

    }

    @When("Click on the Grid view")
    public void click_on_the_grid_view() {
        confirm_email_pages.gridBtn.click();

    }

    @When("Click on the object with the name Blouse")
    public void click_on_the_object_with_the_name_blouse() {
        confirm_email_pages.blouse.click();

    }

    @When("Click to quantity increase")
    public void click_to_quantity_increase() {
        confirm_email_pages.increaseQuantity.click();

    }

    @When("Select the medium size from drop down")
    public void select_the_medium_size_from_drop_down() {
        Select select = new Select(confirm_email_pages.sizeDropDown);
        select.selectByVisibleText("M");

    }

    @When("click on the color white box")
    public void click_on_the_color_white_box() {
        confirm_email_pages.colorBox.click();

    }

    @When("click on Add to cart button")
    public void click_on_add_to_cart_button() {
        confirm_email_pages.addToCart.click();

    }

    @When("click on the continue shopping button")
    public void click_on_the_continue_shopping_button() {
        confirm_email_pages.continueShoppingBtn.click();

    }

    @When("click to the send to friend link text")
    public void click_to_the_send_to_friend_link_text() {
        confirm_email_pages.sendToFriendBtn.click();

    }

    @When("write the name of a friend in the input")
    public void write_the_name_of_a_friend_in_the_input() {
        confirm_email_pages.frindName.sendKeys("Technova School");

    }

    @When("write the email of the friend")
    public void write_the_email_of_the_friend() {
        confirm_email_pages.emailFriend.sendKeys("this input button has bug, because it accepts everythig like this message");

    }

    @When("click on the send button")
    public void click_on_the_send_button() {
        confirm_email_pages.sendButton.click();

    }

    @Then("confirm the message appears on the screen")
    public void confirm_the_message_appears_on_the_screen() {
        String actual = confirm_email_pages.confirmText.getText();
        String expected = "Your e-mail has been sent successfully";
        Assert.assertTrue(actual.equals(expected));


    }

}
