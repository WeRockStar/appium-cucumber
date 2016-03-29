package steps;

import core.BaseSettings;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static junit.framework.TestCase.assertEquals;

public class LoginStep {

    AndroidDriver driver;

    @Before
    public void setUp() throws Throwable {
        driver = BaseSettings.getDriver();
    }

    @Given("^I am on \"([^\"]*)\" page$")
    public void i_am_on_page(String pageName) throws Throwable {
        driver.startActivity("com.werockstar.cumcumber", "com.werockstar.cumcumber.LoginActivity");
    }

    @When("^I fill in username with \"([^\"]*)\"$")
    public void i_fill_in_username_with(String username) throws Throwable {
        WebElement editTextUsername = driver.findElement(By.id("com.werockstar.cumcumber:id/editTextUserName"));
        editTextUsername.sendKeys(username);
    }

    @When("^I fill in password with \"([^\"]*)\"$")
    public void i_fill_in_password_with(String password) throws Throwable {
        WebElement editTextPassword = driver.findElement(By.id("com.werockstar.cumcumber:id/editTextPassword"));
        editTextPassword.sendKeys(password);
    }

    @When("^I press \"([^\"]*)\" button$")
    public void i_press_button(String button) throws Throwable {
        WebElement btnLogin = driver.findElement(By.name(button));
        btnLogin.click();
    }

    @Then("^I should see message \"([^\"]*)\"$")
    public void i_should_see_message(String message) throws Throwable {
        WebElement dialogMessage = driver.findElement(By.id("android:id/message"));
        assertEquals(message, dialogMessage.getText());
    }

    @After
    public void tearDown() throws Throwable {
        driver.quit();
    }
}
