package step_definitions;

import Utilities.Config;
import Utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pages.Your_logo_Page;

public class yourLogo_Steps {

    Your_logo_Page your_logo_page = new Your_logo_Page();

    Faker faker = new Faker();



    @Given("your Logo home page")
    public void your_logo_home_page() {
        Driver.getDriver().get(Config.getProperty("url"));
    }

    @When("click on Sign in button")
    public void click_on_sign_in_button() {
        your_logo_page.SignBtn.click();
    }

    @When("Entering an email address in the email address box")
    public void entering_an_email_address_in_the_email_address_box() {
        your_logo_page.emailEntryBox.click();
        your_logo_page.emailEntryBox.sendKeys(faker.internet().emailAddress());

    }

    @When("Press Create an account button")
    public void Press_create_an_account_button() {
         your_logo_page.createAccountBox.click();

    }

    @When("Checking if we are on right page")
    public void checking_if_we_are_on_right_page() {
        Assert.assertEquals(Config.getProperty("expectedPersonalInformationText")
                , your_logo_page.personalInformationText.getText());
    }



    @When("write the first name in the input button")
    public void write_the_first_name_in_the_input_button() {
       your_logo_page.firstName.sendKeys(faker.name().firstName());
    }

    @When("write the last name in the input button")
    public void write_the_last_name_in_the_input_button() {
       your_logo_page.lastName.sendKeys(faker.name().lastName());
    }



    @When("create and verify the password in the input button")
    public void create_and_verify_the_password_in_the_input_button() {
        String passWord = faker.internet().password()+"Admin123";
        your_logo_page.password.sendKeys(passWord);
    }

    @When("select a Date of Birth from dropdown")
    public void select_a_date_of_birth_from_dropdown() {
        Select select = new Select(your_logo_page.dateOfBirthDay);
        Select months = new Select(your_logo_page.dateOfBirthMonth);
        Select year = new Select(your_logo_page.dateOfBirthYear);
        select.selectByIndex(faker.number().randomDigit());


    }

    @When("filling up your living address")
    public void filling_up_your_living_address() {

        your_logo_page.Address.click();
    }

    @When("enter city name")
    public void enter_city_name() {
        your_logo_page.City.click();
    }

    @When("Selecting state")
    public void selecting_state() {
        your_logo_page.StateSelected.click();
    }

    @When("Enter the zip code")
    public void enter_the_zip_code() {
        your_logo_page.ZipCode.click();
    }

    @When("Enter Mobile phone")
    public void enter_mobile_phone() {

        your_logo_page.MobilePhone.click();
    }

    @When("assigning alias your address")
    public void assigning_alias_your_address() {
        your_logo_page.AssignAliasAddress.click();
    }

    @When("Pressing register button")
    public void pressing_register_button() {
        your_logo_page.RegisterBtn.click();
    }

}
