@automation
Feature: Add Product to Cart

  @a
  Scenario: User search the product and add to cart
    Given user navigates to "https://www.bhinneka.com//"
    And user dismiss notification pop up
    When user click on Login button
    And user fill email "gorbytest007@gmail.com"
    And user fill password "Qwerty123$"
    And user click on Sign in button
    And user search for "Asus ROG"
    And user select the top result
    And user see product information
    And user click add the amount of the product
    And user click on Add to Cart button
    And user click on Continue to Cart button
    And user click on minus button on cart page
    Then user click on delete cart
    And user back to homepage

  @b
  Scenario: User search the product from category and add to cart
    Given user navigates to "https://www.bhinneka.com//"
    And user dismiss notification pop up
    When user click on Login button
    And user fill email "gorbytest007@gmail.com"
    And user fill password "Qwerty123$"
    And user click on Sign in button
    And user click on Tech and Comms category
    And user click on Computer product
    And user check Asus brand filter
    And user set minimal price "8000000"
    And user set maximum price "13000000"
    And user choose the product
    And user click on Add to Cart button
    And user click on Continue to Cart button
    Then user click on delete cart
    And user back to homepage

  @c
  Scenario: User add flash sale product to cart
    Given user navigates to "https://www.bhinneka.com//"
    And user dismiss notification pop up
    When user click on Login button
    And user fill email "gorbytest007@gmail.com"
    And user fill password "Qwerty123$"
    And user click on Sign in button
    And user search select flash sale product
    And user see product information
    And user click on Add to Cart button
    And user click on Continue to Cart button
    And user back to homepage
    And user select another flash sale product
    And user see product information
    And user click on Add to Cart button
    And user click on Continue to Cart button
    Then user click on delete cart
    And user back to homepage