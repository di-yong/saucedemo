package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ProductsPage;
import utility.Hooks;


public class ProductPageSteps {
  private final ProductsPage productsPage;


  public ProductPageSteps() {
    productsPage = new ProductsPage(Hooks.getDriver());
  }

  @When("User navigates to the Products page")
  public void user_navigates_products_page(){
    productsPage.verifyTitle();
  }

  @And("User add some items to the cart")
  public void user_add_some_items_to_the_cart(){
    productsPage.clickAddToCart();
  }

  @Then("User click cart button to Cart page")
  public void user_click_cart_button_to_cart_page(){
    productsPage.clickCart();
  }
}
