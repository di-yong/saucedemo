package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;
import utility.Hooks;

public class CartPageSteps {
  private final CartPage cartPage;

  public CartPageSteps() {
    cartPage = new CartPage(Hooks.getDriver());
  }

  @Then("User click Checkout button")
  public void user_navigates_products_page(){
    cartPage.verifyTitle();
    cartPage.clickCheckout();
  }

}
