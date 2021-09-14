
@AutomationPractice
Feature: Verify the carts price



  @addToCardAndDeleteFromCart4Items
  Scenario: Verify the carts price
  Given I am in the Your Logo web page
    And hover over element1
    And i click on Add to cart button item1
    And press continue shopping button
    And  hover over element2
    And i click on Add to cart button item2
    And press continue shopping button
    And hover over element3
    And i click on Add to cart button item3
    And press continue shopping button
    And hover over element4
    And Pressing on Proceed to Checkout Button
    And I verify if user is on right page an SHOPPING-CART SUMMARY text is displayed

    And I press delete from cart button for item1
    And I press delete from cart button for item2
    And I press delete from cart button for item3
    And I press delete from cart button for item4

    Then I check if shopping cart empty text is displayed


