package stepDefinition;

import context.TestContext;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.ProductsPage;
import utility.Hooks;
import utility.ProductHelper;

import java.util.List;
import java.util.Map;


public class ProductPageSteps {
  private final ProductsPage productsPage;

  public ProductPageSteps() {
    productsPage = new ProductsPage(Hooks.getDriver());

    TestContext.resetTotalPrice();
  }

  @And("User navigates to the Products page")
  public void user_navigates_products_page(){
    productsPage.verifyTitle();
  }

  @And("User add some items to the cart")
  public void user_add_some_items_to_the_cart(DataTable dataTable){
    List<Map<String, String>> items = dataTable.asMaps(String.class, String.class);

    for (Map<String, String> item : items) {
      String itemName = item.get("Item Name");
      String price = item.get("Price");
      ProductHelper.AddToCartOption addToCart = ProductHelper.AddToCartOption.fromString(item.get("Add To Cart?"));

      if (addToCart == ProductHelper.AddToCartOption.YES) {
        productsPage.clickAddToCart(itemName);
        TestContext.addToTotalPrice(Double.parseDouble(price.replace("$", "")));
      }
    }
  }

  @Then("User click cart button to Cart page")
  public void user_click_cart_button_to_cart_page(){
    productsPage.clickCart();
  }
}
