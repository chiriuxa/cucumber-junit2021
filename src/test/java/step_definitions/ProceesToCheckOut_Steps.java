package step_definitions;

import Utilities.Config;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AddToCart_Pages;
import pages.CreateAnAccount_Pages;
import pages.ProceedToCheckOut_Pages;


public class ProceesToCheckOut_Steps {

    AddToCart_Pages addToCart_pages = new AddToCart_Pages();
    ProceedToCheckOut_Pages proceedToCheckOut_pages = new ProceedToCheckOut_Pages();
    CreateAnAccount_Pages createAnAccount_pages = new CreateAnAccount_Pages();
    Faker faker = new Faker();

    @Given("Pressing on Proceed to Checkout Button")
    public void pressing_on_proceed_to_checkout_button() {
      addToCart_pages.proceedToCheckOutButton.click();
    }

    @When("Checking if create an account is displayed")
    public void checking_if_create_an_account_is_displayed() {
        Assert.assertEquals((Config.getProperty("expectedCreateAccountText"))
                , proceedToCheckOut_pages.createAccountText.getText());
    }

    @When("Entering an email address in the email address box")
    public void entering_an_email_address_in_the_email_address_box() {
        proceedToCheckOut_pages.emailEntryBox.click();
        proceedToCheckOut_pages.emailEntryBox.sendKeys(faker.internet().emailAddress());

    }

    @When("Press Create an account button")
    public void Press_create_an_account_button() {
        proceedToCheckOut_pages.createAccountBox.click();

    }

    @When("Checking if we are on right page")
    public void checking_if_we_are_on_right_page() {
       Assert.assertEquals(Config.getProperty("expectedPersonalInformationText")
               , createAnAccount_pages.personalInformationText.getText());
    }


    @When("Filling up personal information name")
    public void filling_up_personal_information_name() {

    }

    @When("Filling up personal information last name")
    public void filling_up_personal_information_last_name() {

    }
    @When("Filling up personal information password")
    public void filling_up_personal_information_password() {

    }

    @When("Entering date of birth")
    public void entering_date_of_birth() {

    }

    @When("Entering address")
    public void entering_address() {

    }

    @When("Entering City")
    public void entering_city() {

    }

    @When("Selecting State")
    public void selecting_state() {

    }

    @When("Entering zip code")
    public void entering_zip_code() {

    }

    @When("Entering Phone number")
    public void entering_phone_number() {

    }

    @When("Assigning alis address")
    public void assigning_alis_address() {

    }

    @When("Pressing register Button")
    public void pressing_register_button() {

    }



}
