package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utility.Hooks;

public class LoginPageSteps {
  private final LoginPage loginPage;

  public LoginPageSteps() {
    loginPage = new LoginPage(Hooks.getDriver());
  }

  @Given("User navigates to the login page")
  public void user_navigates_to_the_login_page(){
    Hooks.getDriver().get("https://www.saucedemo.com/");
  }

  @When("User enter the username and password")
  public void user_enter_username_and_passowrd(){
    loginPage.verifyTitle();
    loginPage.enterUsername();
    loginPage.enterPassword();
  }

  @And("User clicks the login button")
  public void user_clicks_login_button(){
    loginPage.clickLoginButton();
  }
}
