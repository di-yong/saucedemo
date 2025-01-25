package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.CheckoutPage;
import utility.Hooks;

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

  @Then("User click the Finish button")
  public void user_click_finish(){
    checkoutPage.clickFinish();
  }

  @And("User validate the order is completed")
  public void user_validate_order_is_completed(){
    checkoutPage.verifyOrderCompleteInfo();

  }

}

