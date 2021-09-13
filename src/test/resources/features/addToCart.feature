
@AutomationPractice
Feature: Verify the carts price

  @addToCard
  Scenario: Verify the carts price
  Given I am in the Your Logo web page
    And Faded Short Sleeve T-shirts to hover over it
    When i click on Add to cart button
    And i click on proceed to checkout  button
    Then i should see the total price is correct

  @ProceedToCheckout
  Scenario: Checkout after adding to cart
    Given Pressing on Proceed to Checkout Button
    When Checking if create an account is displayed
    When Entering an email address in the email address box
    And Press Create an account button
    And Checking if we are on right page
    When Filling up personal information name
    When Filling up personal information last name
    When Filling up personal information password
    When Entering date of birth
    When Entering address
    When  Entering City
    When  Selecting State
    When Entering zip code
    When Entering Phone number
    When Assigning alis address
    And Pressing register Button
