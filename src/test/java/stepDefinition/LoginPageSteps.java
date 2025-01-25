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

  @When("User enter the username {string} and password {string}")
  public void user_enter_username_and_password(String username, String password){
    loginPage.verifyTitle();
    loginPage.login(username, password);
  }

}
