# Swag Labs Automation Test

This project is an automated testing framework designed to verify the login page, products page, checkout page, and cart page functionality of a web application. The framework uses Cucumber BDD, Page Object Model (POM), Maven, Selenium, TestNG, and Jenkins. It allows for behavior-driven development (BDD) testing and produces detailed HTML reports.

## Features

- Automated end to end test using Selenium.
- BDD style testing with Cucumber.
- Maven for dependency management.
- Page Object Model for scalable test code.
- TestNG for test execution.
- Jenkins for CI

## How to Run the Tests

You can run the tests directly from the command line or via the `runner.bat` file.

### Option 1: Run with Maven

To execute the tests using Maven:

```
mvn clean test
```

### Option 2: Run via Batch File

Simply run the `runner.bat` file:

```
./runner.bat
```

This script will trigger the test execution and generate the results report.

## Test Scenario Outline

The test verifies the functionality of a web application:

**1. User navigates to the login page, enters valid credentials, and logs in successfully**:
- Steps:
  1. Navigate to the login page. 
  2. Enter valid username and password (e.g., username: "standard_user", password: "secret_sauce").
  3. Click the login button.
- Verification:
  - Check for the "Swag Labs" title indicating that the user is on the Login page.

**2. User adds selected items to the shopping cart**:
- Steps:
  1. Choose products to add to the cart based on a data table. 
  2. Add the selected products to the cart by clicking the "Add to Cart" button next to each product.
  3. Click the cart icon to view the shopping cart.
- Verification:
  - Check for the "Products" title indicating that the user is on the Products page.
  - Ensure that the "Add to Cart" button is functional and adds the items to the cart.

**3. User proceeds to checkout**:
- Steps:
  1. Click the "Checkout" button to proceed to the checkout page.
- Verification:
  - Check for the "Your Cart" title indicating that the user is on the Cart page.
  
**4. User enters their personal details for the order**:
- Steps:
  1. Enter the following details on the checkout page: First name, Last name, Zip code
  2. Click the "Continue" button to proceed to the overview page.
- Verification:
  - Check for the "Checkout: Your Information" title indicating that the user is on the Checkout page.

**5. User finalizes the order**:
- Steps:
  1. Review the order details (Item total price). 
  2. Click the "Finish" button to complete the purchase.
- Verification:
  - Check for the "Checkout: Overview" title indicating that the user is on the Checkout page.
  - Verify that the correct item total price is displayed correctly. 
  - Confirm that clicking the "Finish" button leads to an order confirmation page.

**6. User validates that the order is confirmed**:
- Steps:
  1. After completing the purchase, verify that the user is directed to an order completion page. 
  2. Check for a confirmation message ( "Thank you for your purchase!").
- Verification:
  - Confirm that the completion message displays correctly.

## Test Case Assumptions
**1. Functional Assumptions:**
   - The platform has pre-defined valid credentials for login (e.g., "standard_user" and "secret_sauce").
   - The product list on the website is consistent and accessible during testing.
   - The shopping cart functionality is implemented correctly and reflects the updated total price.
   - The checkout process, including entering personal details and payment information, is functional.

**2. Environment Assumptions:**
  - The website is available and functioning during testing.
  - All elements required for testing (e.g., buttons, fields, product listings) load within 10 seconds.
  - There are no network or server disruptions during the test, and the website remains responsive throughout the process.

**3. Data Assumptions:**
  - The list of products is up-to-date and accurately reflects the prices. 
  - User personal details (e.g., name, address, zip code) are randomly generated for the testing process.
  - The test cases will use a set of predetermined products with known prices (e.g., Sauce Labs Backpack, Bike Light, etc.).


## Project Structure
- **`features/`**:
    - Contains Cucumber `.feature` files that define test scenarios using Gherkin syntax.
    - Examples: `SwagLabsEndToEnd.feature`.
- **`context/`**:
  - Includes context for different products total price.
  - Examples: `TestContext.java`.
- **`pages/`**:
    - Includes Page Object Model (POM) classes for different pages of the application.
    - Examples: `CartPage.java`, `ProductsPage.java`, etc.
- **`runner/`**:
    - Contains the TestNG configuration (`testng.xml`) and the main test runner class (`TestRunner.java`).
- **`stepDefinition/`**:
    - Houses the step definition classes that map the Gherkin steps in `.feature` files to Java methods.
    - Examples: `CartPageSteps.java`, `LoginPageSteps.java`.
- **`utility/`**:
    - Provides helper classes for reusable utilities, such as:
        - `ElementHelper.java`: For common element interactions.
        - `Hooks.java`: For setup and teardown methods in Cucumber.
        - `ProductHelper.java`: For managing product-related logic.
        - `RandomGenerator.java`: For generating random strings and numbers.
- **`resources/`**:
    - Contains resource files required for the project, such as the `chromedriver.exe`.
- **`target/`**:
    - Directory generated during the Maven build process. Contains compiled classes, test reports, and other outputs.
- **Root Files**:
    - `.gitignore`: Specifies files and directories to be ignored by Git.
    - `cucumber.json`: Configuration or output file for Cucumber.
    - `Jenkinsfile`: Defines the CI/CD pipeline using Jenkins.
    - `pom.xml`: Maven configuration file for managing dependencies and build settings.
    - `runner.bat`: Batch script to execute the tests locally.

## Dependencies

This project uses the following libraries and frameworks:

- **Selenium**: Browser automation.
- **Cucumber**: BDD testing framework.
- **TestNG**: Test execution and assertions.
- **Maven**: Dependency management and build tool.

## Contribution

Feel free to fork this repository and submit pull requests. Follow the steps below for contributing:

1. Fork the repo.
2. Create a new branch (`git checkout -b feature/YourFeature`).
3. Commit your changes (`git commit -m 'Add YourFeature'`).
4. Push to the branch (`git push origin feature/YourFeature`).
5. Open a pull request.

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Author
[**Di Yong**](https://www.linkedin.com/in/di-yong/)