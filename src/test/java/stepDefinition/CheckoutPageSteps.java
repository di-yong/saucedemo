package stepDefinition;

import context.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.CheckoutPage;
import utility.Hooks;

import java.math.BigDecimal;


public class CheckoutPageSteps {
  private final CheckoutPage checkoutPage;

  public CheckoutPageSteps() {
    checkoutPage = new CheckoutPage(Hooks.getDriver());
  }

  @And("User enter the personal information and click Continue button")
  public void user_enter_information_and_click_continue(){
    checkoutPage.verifyTitle();
    checkoutPage.enterPersonalInfo();
    checkoutPage.clickContinue();
  }

  @And("User validate the total price")
  public void user_validate_the_total_price(){
    String actualTotalPrice = checkoutPage.getTotalPrice();

    BigDecimal expectedTotalPrice = new BigDecimal(TestContext.getTotalPrice()).setScale(2, BigDecimal.ROUND_HALF_UP);
    BigDecimal actualTotalPriceDecimal = new BigDecimal(actualTotalPrice.replace("$", "")).setScale(2, BigDecimal.ROUND_HALF_UP);

    assert expectedTotalPrice.equals(actualTotalPriceDecimal) :
      "Expected total price: " + expectedTotalPrice + ", but got: " + actualTotalPrice;
  }

  @Then("User click the Finish button")
  public void user_click_finish(){
    checkoutPage.clickFinish();
  }

  @And("User validate the order is completed")
  public void user_validate_order_is_completed(){
    checkoutPage.verifyOrderCompleteInfo();
  }
}

