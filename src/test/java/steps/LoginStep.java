package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {
    @Given("^I am on \"([^\"]*)\" page$")
    public void i_am_on_page(String arg1) throws Throwable {

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

}
