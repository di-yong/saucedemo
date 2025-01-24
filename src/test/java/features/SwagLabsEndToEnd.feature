Feature: Swag Labs shopping center - end to end
  Scenario: End to end testing
    Given User navigates to the login page
    When User enter the username and password
    Then User clicks the login button
    When User navigates to the Products page
    Then User add some items to the cart
    Then User click cart button to Cart page
    Then User click Checkout button
    Then User enter the personal information and click Continue button
    And User validate the total price
    Then User click the Finish button
    And User validate the order is completed



