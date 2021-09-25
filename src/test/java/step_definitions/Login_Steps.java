package step_definitions;

import Utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Login_Page;

public class Login_Steps {

      Login_Page loginPage = new Login_Page();

     //  Faker faker = new Faker();

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/index.php/pim/viewMyDetails");
    }

    @When("I enter username")
    public void i_enter_username() {
        loginPage.UserName.sendKeys("Admin");
    }

    @When("I enter password")
    public void i_enter_password() {
        loginPage.Password.sendKeys("admin123");
    }

    @When("click the Login button")
    public void click_the_login_button() {
         loginPage.Login.click();
    }


}
