package steps;

import core.BaseSettings;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;

public class LoginStep {

    AndroidDriver driver;

    @Before
    public void setUp() throws Throwable {
        driver = BaseSettings.getDriver();
    }

    @Given("^I am on \"([^\"]*)\" page$")
    public void i_am_on_page(String pageName) throws Throwable {

    }

    @When("^I fill in username with \"([^\"]*)\"$")
    public void i_fill_in_username_with(String username) throws Throwable {

    }

    @When("^I fill in password with \"([^\"]*)\"$")
    public void i_fill_in_password_with(String password) throws Throwable {

    }

    @When("^I press \"([^\"]*)\" button$")
    public void i_press_button(String button) throws Throwable {

    }

    @Then("^I should be on Member page$")
    public void i_should_be_on_Member_page() throws Throwable {

    }

    @After
    public void tearDown() throws Throwable {
        driver.quit();
    }
}
