Feature: Verify the carts price

  @yourLogo
  Scenario: Verify the carts price
  Given I am in the Your Logo web page
    And Faded Short Sleeve T-shirts to hover over it
    When i click on Add to cart button
    And i click on proceed to checkout  button
    Then i should see the total price is correct
