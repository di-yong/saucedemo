Feature: Swag Labs shopping center - end to end
  Scenario: End to end testing - Swag Labs
    Given User navigates to the login page
    When User enter the username "standard_user" and password "secret_sauce"
    And User navigates to the Products page
    And User add some items to the cart
      | Item Name                         | Price  | Add To Cart? |
      | Sauce Labs Backpack               | $29.99 | Y            |
      | Sauce Labs Bike Light             | $9.99  | N            |
      | Sauce Labs Bolt T-Shirt           | $15.99 | N            |
      | Sauce Labs Fleece Jacket          | $49.99 | N            |
      | Sauce Labs Onesie                 | $7.99  | N            |
      | Test.allTheThings() T-Shirt (Red) | $15.99 | N            |
    Then User click cart button to Cart page
    Then User click Checkout button
    And User enter the personal information and click Continue button
    And User validate the total price
    Then User click the Finish button
    And User validate the order is completed



