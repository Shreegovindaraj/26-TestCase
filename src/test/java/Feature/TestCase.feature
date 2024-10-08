
Feature: Register User
@TestCase1
  Scenario: Successful user registration
    Given I launch the browser and navigate to url "http://automationexercise.com"
    When I Verify that home page is visible successfully
    Then I click on the "Signup / Login" button
    And I verify "New User Signup!" is visible
    Then I enter name as "Shree" and email as "Shree123@gmail.com"
    And I click the "Signup" button
    Then I should verify that 'ENTER ACCOUNT INFORMATION' is visible
    And I fill the required details for registration
    And I Select checkbox "Sign up for our newsletter!"
    And Select checkbox "Receive special offers from our partners!"
    And I Fill the details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    Then I Click "Create Account button"
    And I verify that "ACCOUNT CREATED!" Text is visible
    And I Click On "Continue" button
    And I Verify that "Logged in as username" is visible
    Then I Click "Delete Account" button
    And Verify that "ACCOUNT DELETED!" is visible and click "Continue" button

  @TestCase2
  Scenario: Login user with correct email and password
    Given I launch the browser and navigate to url "http://automationexercise.com"
    When I Verify that home page is visible successfully
    Then I click on the "Signup / Login" button
    And I Verify "Login to your account" is visible
    And I Enter correct email "Autotester@gmail.com" and password "123"
    Then I Click the 'login' button
    And I Verify that 'Logged in as username' is visible
    Then I Click 'Delete Account' button
    And Verify that "ACCOUNT DELETED!" is visible and click "Continue" button

  @TestCase3
  Scenario: Login user with correct email and password
    Given I launch the browser and navigate to url "http://automationexercise.com"
    When I Verify that home page is visible successfully
    Then I click on the "Signup / Login" button
    And I Verify "Login to your account" is visible
    And I Enter incorrect email "Shree456@gmail.com" and password "123456789"
    Then I Click the 'login' button
    And I Verify Verify error " Your email or password is incorrect!" is visible

  @TestCase4
  Scenario: Logout User
    Given I launch the browser and navigate to url "http://automationexercise.com"
    When I Verify that home page is visible successfully
    Then I click on the "Signup / Login" button
    And I Verify "Login to your account" is visible
    And I Enter email "Shree123@gmail.com" and password "123456789"
    Then I Click the 'login' button
    And I Verify that 'Logged in as username' is visible
    Then I Click the "Logout"
    Then I Verify that user is navigated to login page

  @TestCase5
  Scenario: Register user with existing email
    Given I launch the browser and navigate to url "http://automationexercise.com"
    When I Verify that home page is visible successfully
    Then I click on the "Signup / Login" button
    And I verify "New User Signup!" is visible
    And I Enter name "Shree" and already registered email "Shree159@gmail.com"
    And I click the "Signup" button
    Then Verify error "Email Address already exist!" is visible

  @TestCase6
  Scenario: Contact Us Form
    Given I launch the browser and navigate to url "http://automationexercise.com"
    When I Verify that home page is visible successfully
    Then I Click on 'Contact Us' button
    And I Verify the 'GET IN TOUCH' is visible
    And I Enter name, email, subject and message
    Then I Upload file
    And I Click Submit button
    And I Click OK button
    Then I Verify success message 'Success! Your details have been submitted successfully.' is visible
    And I Click 'Home' button and verify that landed to home page successfully

@TestCase7
Scenario: Verify Test Cases Page
  Given I launch the browser and navigate to url "http://automationexercise.com"
  When I Verify that home page is visible successfully
  And I click 'Test Cases' button
  Then I Verify user is navigated to test cases page successfully

@TestCase8
Scenario: Verify All Products and product detail page
  Given I launch the browser and navigate to url "http://automationexercise.com"
  When I Verify that home page is visible successfully
  Then I click on 'Products' button
  And I Verify user is navigated to ALL PRODUCTS page successfully
  And I verify the products list is visible
  Then I Click on 'View Product' of first product
  And I verify User is landed to product detail page
  Then I Verify that detail detail is visible: product name, category, price, availability, condition, brand

  @TestCase9
  Scenario: Search Product
    Given I launch the browser and navigate to url "http://automationexercise.com"
    When I Verify that home page is visible successfully
    Then I click on 'Products' button
    And I Verify user is navigated to ALL PRODUCTS page successfully
    Then I Enter product name in search input and click search button
    And I Verify the title 'SEARCHED PRODUCTS' is visible
    And I Verify all the products related to search are visible

  @TestCase10
  Scenario: Verify Subscription in home Page
      Given I launch the browser and navigate to url "http://automationexercise.com"
      When I Verify that home page is visible successfully
      Then I Scroll down to footer
      And I Verify text 'SUBSCRIPTION'
      And I Enter email address in input and click arrow button
      Then Verify success message 'You have been successfully subscribed!' is visible

  @TestCase11
  Scenario: Verify Subscription in Cart Page
    Given I launch the browser and navigate to url "http://automationexercise.com"
    When I Verify that home page is visible successfully
    Then I Click the "Cart" Option button
    And I Scroll down to footer
    And I Verify text 'SUBSCRIPTION'
    Then I Enter email address in input and click arrow button
    Then Verify success message 'You have been successfully subscribed!' is visible

  @TestCase12
  Scenario: Add Products in Cart
    Given I launch the browser and navigate to url "http://automationexercise.com"
    When I Verify that home page is visible successfully
    Then I click on the "Signup / Login" button
    And I Verify "Login to your account" is visible
    And I Enter email "Shree123@gmail.com" and password "123456789"
    Then I Click the 'login' button
    Then I click on 'Products' button
    And I Hover over first product and click 'Add to cart'
    And I Click 'Continue Shopping' option button
    Then I Hover over second product and click 'Add to cart'
    And I Click 'View Cart' button to see the products added in cart
    And I Verify both products are added to Cart
    Then Verify their prices, quantity and total price

  @TestCase13
  Scenario: Verify Product quantity in cart
    Given I launch the browser and navigate to url "http://automationexercise.com"
    When I Verify that home page is visible successfully
    Then I Click 'View Product' for any product on home page
    And I Verify product detail is opened
    And I Increase quantity to 4
    And I Click 'Add to cart' button
    Then I Click 'View Cart' button
    And I Verify that product is displayed in cart page with exact quantity

  @TestCase14
  Scenario: Place Order: Register while Checkout
    Given I launch the browser and navigate to url "http://automationexercise.com"
    When I Verify that home page is visible successfully
    And I add products to cart
    Then I Click the "Cart" Option button
    And I Verify that cart page is displayed
    Then I Click Proceed To Checkout
    And I Click the 'Register / Login' option
    And Fill all details in Signup and create account
    And I verify that "ACCOUNT CREATED!" Text is visible
    And I Click On "Continue" button
    And I Verify that "Logged in as username" is visible
    Then I Click the "Cart" Option button
    And I Click on the 'Proceed To Checkout' button
    And I Verify Address Details and Review Your Order
    Then I Enter description in comment text area and click 'Place Order'
    And I Enter payment details: Name on Card, Card Number, CVC, Expiration date
    And I Click the 'Pay and Confirm Order' option button
    Then Verify success message 'Your order has been placed successfully!'
    Then I Click 'Delete Account' button
    And Verify that "ACCOUNT DELETED!" is visible and click "Continue" button

@TestCase15
Scenario: Place Order: Register before Checkout
  Given I launch the browser and navigate to url "http://automationexercise.com"
  When I Verify that home page is visible successfully
  Then I click on the "Signup / Login" button
  And Fill all details in Signup and create account
  And I verify that "ACCOUNT CREATED!" Text is visible
  And I Click On "Continue" button
  And I Verify that "Logged in as username" is visible
  And I add products to cart
  Then I Click the "Cart" Option button
  And I Verify that cart page is displayed
  And I Click on the 'Proceed To Checkout' button
  And I Verify Address Details and Review Your Order
  Then I Enter description in comment text area and click 'Place Order'
  And I Enter payment details: Name on Card, Card Number, CVC, Expiration date
  And I Click the 'Pay and Confirm Order' option button
  Then Verify success message 'Your order has been placed successfully!'
  Then I Click 'Delete Account' button
  And Verify that "ACCOUNT DELETED!" is visible and click "Continue" button

@TestCase16
Scenario: Place Order: Login before Checkout
  Given I launch the browser and navigate to url "http://automationexercise.com"
  When I Verify that home page is visible successfully
  Then I click on the "Signup / Login" button
  And Fill email, password and click 'Login' button
  And I Verify that "Logged in as username" is visible
  And I add products to cart
  Then I Click the "Cart" Option button
  And I Verify that cart page is displayed
  And I Click on the 'Proceed To Checkout' button
  And I Verify Address Details and Review Your Order
  Then I Enter description in comment text area and click 'Place Order'
  And I Enter payment details: Name on Card, Card Number, CVC, Expiration date
  And I Click the 'Pay and Confirm Order' option button
  Then Verify success message 'Your order has been placed successfully!'
  Then I Click 'Delete Account' button
  And Verify that "ACCOUNT DELETED!" is visible and click "Continue" button

  @TestCase17
  Scenario: Remove Products From Cart
    Given I launch the browser and navigate to url "http://automationexercise.com"
    When I Verify that home page is visible successfully
    And I add products to cart
    Then I Click the "Cart" Option button
    And I Verify that cart page is displayed
    And Click 'X' button corresponding to particular product
    Then I Verify that product is removed from the cart

@TestCase18
Scenario: View Category Products
  Given I launch the browser and navigate to url "http://automationexercise.com"
  When I Verify that categories are visible on left side bar
  And I Click on 'Women' category
  And I Click on any category link under 'Women' category, for example: Dress
  Then I Verify that category page is displayed and confirm text 'WOMEN - TOPS PRODUCTS'
  And On left side bar, click on any sub-category link of 'Men' category
  And I Verify that user is navigated to that category page

  @TestCase19
  Scenario: View & Cart Brand Products
    Given I launch the browser and navigate to url "http://automationexercise.com"
    Then I click on 'Products' button
    And Verify that Brands are visible on left side bar
    And I Click on any brand name
    Then I Verify that user is navigated to brand page and brand products are displayed
    And On left side bar, click on any other brand link
    And I Verify that user is navigated to that brand page and can see products

@TestCase20
Scenario: Search Products and Verify Cart After Login
  Given I launch the browser and navigate to url "http://automationexercise.com"
  Then I click on 'Products' button
  And Verify user is navigated to ALL PRODUCTS page successfully
  And I Enter product name in search input and click search
  Then Verify 'SEARCHED PRODUCTS' is visible
  And Verify all the products related to search are visible
  And Add those products to cart
  Then I Click 'Cart' button and verify that products are visible in cart
  Then I click on the "Signup / Login" button
  And submit login details
  And Again, go to Cart page
  Then I Verify that those products are visible in cart after login as well

  @TestCase21
  Scenario: Add review on product
    Given I launch the browser and navigate to url "http://automationexercise.com"
    Then I click on 'Products' button
    And Verify user is navigated to ALL PRODUCTS page successfully
    And I Click on 'View Product' button in anyone of the product
    Then I Verify 'Write Your Review' option is visible
    And I Enter name, email and review
    And Click the "Submit" button
    Then I Verify success message 'Thank you for your review.'

    @TestCase22
    Scenario: Add to cart from Recommended items
      Given I launch the browser and navigate to url "http://automationexercise.com"
      When I Scroll to bottom of page
      Then I Verify 'RECOMMENDED ITEMS' are visible
      And I Click on 'Add To Cart' on Recommended product
      And I Click 'View Cart' button option
      And I Verify that product is displayed in cart page

      @TestCase23
      Scenario: Verify address details in checkout page
        Given I launch the browser and navigate to url "http://automationexercise.com"
        When I Verify that home page is visible successfully
        Then I click on the "Signup / Login" button
        And Fill all details in Signup and create account
        And I verify that "ACCOUNT CREATED!" Text is visible
        And I Click On "Continue" button
        And I Verify that "Logged in as username" is visible
        And I add products to cart
        Then I Click the "Cart" Option button
        And I Verify that cart page is displayed
        And I Click on the 'Proceed To Checkout' button
        Then I Verify that the delivery address is same address filled at the time registration of account
        And I Verify that the billing address is same address filled at the time registration of account
        Then I Click 'Delete Account' button
        And Verify that "ACCOUNT DELETED!" is visible and click "Continue" button

  @TestCase24
  Scenario: Download Invoice after purchase order
    Given I launch the browser and navigate to url "http://automationexercise.com"
    When I Verify that home page is visible successfully
    And I add products to cart
    Then I Click the "Cart" Option button
    And I Verify that cart page is displayed
    Then I Click Proceed To Checkout
    And I Click the 'Register / Login' option
    And Fill all details in Signup and create account
    And I verify that "ACCOUNT CREATED!" Text is visible
    And I Click On "Continue" button
    And I Verify that "Logged in as username" is visible
    Then I Click the "Cart" Option button
    And I Click on the 'Proceed To Checkout' button
    And I Verify Address Details and Review Your Order
    Then I Enter description in comment text area and click 'Place Order'
    And I Enter payment details: Name on Card, Card Number, CVC, Expiration date
    And I Click the 'Pay and Confirm Order' option button
    Then Verify success message 'Your order has been placed successfully!'
    And I Click 'Download Invoice' button and verify invoice is downloaded successfully
    And I Click On "Continue" button
    Then I Click 'Delete Account' button
    And Verify that "ACCOUNT DELETED!" is visible and click "Continue" button

    @TestCase25
    Scenario: Verify Scroll Up using 'Arrow' button and Scroll Down functionality
      Given I launch the browser and navigate to url "http://automationexercise.com"
      When I Verify that home page is visible successfully
      And I Scroll down page to bottom
      And I Verify text 'SUBSCRIPTION'
      Then I Click on arrow at bottom right side to move upward
      And I Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen

  @TestCase26
  Scenario: Verify Scroll Up without 'Arrow' button and Scroll Down functionality
    Given I launch the browser and navigate to url "http://automationexercise.com"
    When I Verify that home page is visible successfully
    And I Scroll down page to bottom
    And I Verify text 'SUBSCRIPTION'
    Then I Scroll up page to top
    And I Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen

















































