package step_definitions;

import Utilities.Config;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import pages.Qualifications_Page;

public class Qualifications_Step {


    Qualifications_Page quality = new Qualifications_Page();

    @Given("I am in the OrangeHRM Web page")
    public void i_am_in_the_orange_hrm_web_page() {
        Driver.getDriver().get(Config.getProperty("OrangehrmUrl"));
    }

    @Given("i navigate My Link and click")
    public void i_navigate_my_link_and_click() {
        quality.MyInfo.click();
    }

    @Given("i navigate Qualifications and click")
    public void i_navigate_qualifications_and_click() {
        quality.Qualifications.click();
    }

    @Given("I navigate Languages and click")
    public void i_navigate_languages_and_click() {
        quality.Languages.getText();
    }

    @Then("I navigate Add button and click")
    public void i_navigate_add_button_and_click() {
        quality.Add.click();

    }
    @Then("I navigate back and click Language then select English from drop down selection")
    public void i_navigate_back_and_click_language_then_select_english_from_drop_down_selection() {
      // quality.LanguageSelect.click();

       Select select = new Select(quality.LanguageSelect);
       select.selectByIndex(3);
       Select select1 = new Select(quality.selectFluency);
       select1.selectByVisibleText("Speaking");
       Select select2 = new Select(quality.selectCompetency);
       select2.selectByVisibleText("Good");
       quality.Comments.sendKeys(Config.getProperty("QualificationsLanguageCommentsBox"));



    }

    @Then("Click the Save button")
    public void click_the_save_button() {
       quality.SaveButton.click();
    }



}