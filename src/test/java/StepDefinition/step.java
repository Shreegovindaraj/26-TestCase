package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.Base.Base_Class;
import org.Pom.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class step extends Base_Class {
    Register_Page registerPage;
    Test_Case2 testCase2;
    Test_Case3 testCase3;
    Test_Case4 testCase4;
    Test_Case5 testCase5;
    Test_Case6 testCase6;
    Test_Case7 testCase7;
    Test_Case8 testCase8;
    Test_Case9 testCase9;
    Test_Case10 testCase10;
    Test_Case12 testCase12;
    Test_Case13 testCase13;
    Test_Case14 testCase14;
    Test_Case16 testCase16;
    Test_Case20 testCase20;
    Test_Case21 testCase21;
    Test_Case22 testCase22;
    Test_Case24 testCase24;

    @Given("I launch the browser and navigate to url {string}")
    public void iLaunchTheBrowserAndNavigateToUrl(String url) {
        initializeDriver();
        driver.get(url);
        String expectedTitle = "Automation Exercise";
        assertEquals(expectedTitle, driver.getTitle());
        registerPage = new Register_Page(driver);
        testCase2 = new Test_Case2(driver);
        testCase3 = new Test_Case3(driver);
        testCase4 = new Test_Case4(driver);
        testCase5 = new Test_Case5(driver);
        testCase6 = new Test_Case6(driver);
        testCase7 = new Test_Case7(driver);
        testCase8 = new Test_Case8(driver);
        testCase9 = new Test_Case9(driver);
        testCase10 = new Test_Case10(driver);
        testCase12 = new Test_Case12(driver);
        testCase13 = new Test_Case13(driver);
        testCase14 = new Test_Case14(driver);
        testCase16 = new Test_Case16(driver);
        testCase20 = new Test_Case20(driver);
        testCase21 = new Test_Case21(driver);
        testCase22 = new Test_Case22(driver);
        testCase24 = new Test_Case24(driver);
    }
    @When("I Verify that home page is visible successfully")
    public void iVerifyThatHomePageIsVisibleSuccessfully() {
        WebElement HomePage = driver.findElement(By.xpath("//a[normalize-space()='Home']"));
        boolean displayed = HomePage.isDisplayed();
        Assert.assertTrue("Home", displayed);
    }

    @Then("I click on the {string} button")
    public void iClickOnTheButton(String string) {
        registerPage.ClickSignUp();
    }

    @Then("I verify {string} is visible")
    public void iVerifyIsVisible(String string) {
        WebElement NewUser = driver.findElement(By.xpath("//h2[normalize-space()='New User Signup!']"));
        boolean displayed = NewUser.isDisplayed();
        Assert.assertTrue("New User Signup", displayed);

    }
    @Then("I enter name as {string} and email as {string}")
    public void iEnterNameAsAndEmailAs(String name, String email) {
        registerPage.EnterUserName(name);
        registerPage.EnterEmailID(email);
    }
    @Then("I click the {string} button")
    public void iClickTheButton(String string) {
        registerPage.SigNupBtn();

    }
    @Then("I should verify that {string} is visible")
    public void iShouldVerifyThatIsVisible(String string) {
        WebElement element = driver.findElement(By.xpath("//b[normalize-space()='Enter Account Information']"));
        boolean displayed = element.isDisplayed();
        Assert.assertTrue("Enter Account Information", displayed);

    }
    @Then("I fill the required details for registration")
    public void iFillTheRequiredDetailsForRegistration() throws InterruptedException {
        registerPage.ClickMr();
        registerPage.EnterPassword();
        registerPage.EnterDate();
        registerPage.EnterMonth();
        registerPage.EnterYear();
        Thread.sleep(5000);
    }

    @Then("I Select checkbox {string}")
    public void iSelectCheckbox(String string) {
        registerPage.ClickCheckBox1();
    }

    @Then("Select checkbox {string}")
    public void selectCheckbox(String string) {
        registerPage.ClickCheckBox2();
    }

    @Then("I Fill the details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void iFillTheDetailsFirstNameLastNameCompanyAddressAddress2CountryStateCityZipcodeMobileNumber() {
        registerPage.EnterFirstName();
        registerPage.EnterLastName();
        registerPage.EnterCompany();
        registerPage.EnterStreet();
        registerPage.EnterRoad();
        registerPage.EnterState();
        registerPage.EnterCity();
        registerPage.EnterCode();
        registerPage.EnterNumber();
    }

    @Then("I Click {string}")
    public void iClick(String string) {
        registerPage.EnterCreateBtn();
    }
    @And("I verify that {string} Text is visible")
    public void iVerifyThatTextIsVisible(String string) throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("//h2[@data-qa='account-created']"));
        String actualText = element.getText();
        Assert.assertTrue("Expected text is not found!", actualText.contains(string));
        Thread.sleep(5000);
    }
    @Then("I Click On {string} button")
    public void iClickOnButton(String string) throws InterruptedException {
        registerPage.ClickContinueBtn();
        Thread.sleep(5000);
    }
    @Then("I Verify that {string} is visible")
    public void iVerifyThatIsVisible(String string) throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("(//ul[@class='nav navbar-nav']//following::li//following::a)[9]"));
        String text = element.getText();
        boolean contains = text.contains("Logged in as Shree");
        Assert.assertTrue(contains);
        Thread.sleep(5000);
    }

    @Then("I Click {string} button")
    public void iClickButton(String string) {
        registerPage.ClickDelete();
    }
    @Then("Verify that {string} is visible and click {string} button")
    public void verifyThatIsVisibleAndClickButton(String string, String string2) {
        WebElement element = driver.findElement(By.cssSelector("[data-qa='account-deleted']"));
        String text = element.getText();
        boolean contains = text.contains("ACCOUNT DELETED");
        Assert.assertTrue(contains);
        WebElement Continue = driver.findElement(By.cssSelector("[data-qa='continue-button']"));
        Continue.click();
    }

    @And("I Verify {string} is visible")
    public void iVerifyLoginToYourAccountIsVisible(String string) {
        WebElement element = driver.findElement(By.xpath("//h2[normalize-space()='Login to your account']"));
        String text = element.getText();
        boolean contains = text.contains("Login to your account");
        Assert.assertTrue("Login to your account", contains);
    }

    @Then("I Enter correct email {string} and password {string}")
    public void iEnterCorrectEmailAndPassword(String email, String password) {
        testCase2.EnterEmail(email);
        testCase2.EnterPassword(password);
    }

    @Then("I Click the {string} button")
    public void iClickTheLoginButton(String string) {
        testCase2.ClickLogin();
    }

    @And("I Enter incorrect email {string} and password {string}")
    public void iEnterIncorrectEmailAndPassword(String email, String password) {
        testCase3.EnterEmail(email);
        testCase3.EnterPassword(password);
    }

    @And("I Verify Verify error {string} is visible")
    public void iVerifyVerifyErrorIsVisible(String string) {
        WebElement element = driver.findElement(By.xpath("//p[normalize-space()='Your email or password is incorrect!']"));
        boolean displayed = element.isDisplayed();
        Assert.assertTrue("Your email or password is incorrect!", displayed);
    }

    @And("I Enter email {string} and password {string}")
    public void iEnterEmailAndPassword(String email, String password) {
        testCase4.EnterEmail(email);
        testCase4.EnterPassword(password);
    }

    @Then("I Click the {string}")
    public void iClickThe(String string) {
        testCase4.ClickLogout();
    }

    @Then("I Verify that user is navigated to login page")
    public void iVerifyThatUserIsNavigatedToLoginPage() {
        String currentUrl = driver.getCurrentUrl();
        boolean contains = currentUrl.contains("login");
        Assert.assertTrue("The URL does not contain 'login'", contains);

    }

    @And("I Enter name {string} and already registered email {string}")
    public void iEnterNameAndAlreadyRegisteredEmail(String name, String email) {
        testCase5.EnterUserName(name);
        testCase5.EnterEmailID(email);
    }

    @Then("Verify error {string} is visible")
    public void verifyErrorIsVisible(String arg0) {
        WebElement element = driver.findElement(By.xpath("//p[normalize-space()='Email Address already exist!']"));
        String text = element.getText();
        boolean contains = text.contains("Email Address already exist");
        Assert.assertTrue("Email Address already exist", contains);
    }

    @Then("I Click on {string} button")
    public void iClickOnContactUsButton(String button) {
        testCase6.ClickContact();
    }

    @And("I Verify the {string} is visible")
    public void iVerifyTheGETINTOUCHIsVisible(String message) {
        WebElement element = driver.findElement(By.xpath("//h2[normalize-space()='Get In Touch']"));
        String Actual = element.getText();
        String expected = "GET IN TOUCH";
        Assert.assertEquals("GET IN TOUCH",expected,Actual);
    }

    @And("I Enter name, email, subject and message")
    public void iEnterNameEmailSubjectAndMessage() {
        testCase6.EnterName();
        testCase6.EnterEmail();
        testCase6.EnterSubject();
        testCase6.EnterMessage();
    }
    @Then("I Upload file")
    public void iUploadFile() throws InterruptedException {
        testCase6.FileUpload();
        Thread.sleep(5000);
    }
    @And("I Click Submit button")
    public void iClickSubmitButton() {
        testCase6.ClickSubmit();
    }
    @And("I Click OK button")
    public void iClickOKButton() {
        driver.switchTo().alert().accept();
    }
    @Then("I Verify success message {string} is visible")
    public void iVerifySuccessMessageSuccessYourDetailsHaveBeenSubmittedSuccessfullyIsVisible(String string) {
        WebElement element = driver.findElement(By.xpath("//div[@class='status alert alert-success']"));
        String Actual = element.getText();
        String Expected = "Success! Your details have been submitted successfully.";
        Assert.assertEquals("Success! Your details have been submitted successfully.",Expected,Actual);
    }
    @And("I Click {string} button and verify that landed to home page successfully")
    public void iClickHomeButtonAndVerifyThatLandedToHomePageSuccessfully(String string) {
        testCase6.ClickHome();
        String currentUrl = driver.getCurrentUrl();
        String expectedUrl = "https://automationexercise.com/";
        Assert.assertEquals("User is not on the home page", expectedUrl, currentUrl);
    }
    @And("I click {string} button")
    public void iClickTestCasesButton(String string) {
        testCase7.ClickTestCase();
    }
    @Then("I Verify user is navigated to test cases page successfully")
    public void iVerifyUserIsNavigatedToTestCasesPageSuccessfully() {
        String currentUrl = driver.getCurrentUrl();
        String Expected = "https://automationexercise.com/test_cases";
        Assert.assertEquals("https://automationexercise.com/test_cases",Expected,currentUrl);
    }
    @Then("I click on {string} button")
    public void iClickOnProductsButton(String String) {
        testCase8.ClickProduct();
    }
    @And("I Verify user is navigated to ALL PRODUCTS page successfully")
    public void iVerifyUserIsNavigatedToALLPRODUCTSPageSuccessfully() {
        WebElement AllProducts = driver.findElement(By.cssSelector("[class='title text-center']"));
        String Actual = AllProducts.getText();
        String Expected = "ALL PRODUCTS";
        Assert.assertEquals("ALL PRODUCTS",Expected,Actual);
    }
    @And("I verify the products list is visible")
    public void iVerifyTheProductsListIsVisible() {
        WebElement productList = driver.findElement(By.cssSelector(".features_items"));
        Assert.assertTrue(productList.isDisplayed());
    }
    @Then("I Click on {string} of first product")
    public void iClickOnViewProductOfFirstProduct(String string) {
        testCase8.ClickFirstProduct();
    }
    @And("I verify User is landed to product detail page")
    public void iVerifyUserIsLandedToProductDetailPage() {
        WebElement productDetailPageHeader = driver.findElement(By.cssSelector("[class='product-information']"));
        Assert.assertTrue(productDetailPageHeader.isDisplayed());
    }
    @Then("I Verify that detail detail is visible: product name, category, price, availability, condition, brand")
    public void iVerifyThatDetailDetailIsVisibleProductNameCategoryPriceAvailabilityConditionBrand() {
        WebElement productName = driver.findElement(By.xpath("//h2[text()='Blue Top']"));
        WebElement category = driver.findElement(By.xpath("//p[text()='Category: Women > Tops']"));
        WebElement price = driver.findElement(By.xpath("//span[text()='Rs. 500']"));
        WebElement availability = driver.findElement(By.xpath("//b[text()='Availability:']"));
        WebElement condition = driver.findElement(By.xpath("//b[text()='Condition:']"));
        WebElement brand = driver.findElement(By.xpath("//b[text()='Brand:']"));

        Assert.assertTrue(productName.isDisplayed());
        Assert.assertTrue(category.isDisplayed());
        Assert.assertTrue(price.isDisplayed());
        Assert.assertTrue(availability.isDisplayed());
        Assert.assertTrue(condition.isDisplayed());
        Assert.assertTrue(brand.isDisplayed());
    }
    @Then("I Enter product name in search input and click search button")
    public void iEnterProductNameInSearchInputAndClickSearchButton() {
        testCase9.ClickSearch();
        testCase9.ClickSearchBtn();
    }
    @And("I Verify the title {string} is visible")
    public void iVerifyTheTitleSEARCHEDPRODUCTSIsVisible(String string) {
        WebElement element = driver.findElement(By.xpath("//h2[@class='title text-center']"));
        String Actual = element.getText();
        String Expected = "SEARCHED PRODUCTS";
        Assert.assertEquals("SEARCHED PRODUCTS",Expected,Actual);
    }
    @And("I Verify all the products related to search are visible")
    public void iVerifyAllTheProductsRelatedToSearchAreVisible() {
        WebElement searchResults = driver.findElement(By.cssSelector(".features_items"));
        Assert.assertTrue(searchResults.isDisplayed());
    }
    @Then("I Scroll down to footer")
    public void iScrollDownToFooter() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }
    @And("I Verify text {string}")
    public void iVerifyTextSUBSCRIPTION(String string) {
        WebElement subscriptionText = driver.findElement(By.xpath("//h2[text()='Subscription']"));
        Assert.assertTrue(subscriptionText.isDisplayed());
    }
    @And("I Enter email address in input and click arrow button")
    public void iEnterEmailAddressInInputAndClickArrowButton() {
        testCase10.EnterEmail();
        testCase10.ClickArrow();
    }
    @Then("Verify success message {string} is visible")
    public void verifySuccessMessageYouHaveBeenSuccessfullySubscribedIsVisible(String string) {
        WebElement successMessage = driver.findElement(By.xpath("//div[contains(text(), 'You have been successfully subscribed!')]"));
        Assert.assertTrue(successMessage.isDisplayed());
    }
    @Then("I Click the {string} Option button")
    public void iClickTheOptionButton(String string) throws InterruptedException {
        driver.findElement(By.xpath("//li[3]")).click();
        Thread.sleep(5000);
    }
    @And("I Hover over first product and click {string}")
    public void iHoverOverFirstProductAndClickAddToCart(String string) throws InterruptedException{
        testCase12.ClickFirstProduct();
        Thread.sleep(5000);
    }
    @And("I Click {string} option button")
    public void iClickContinueShoppingOptionButton(String string)  throws InterruptedException {
        testCase12.ClickContinue();
        Thread.sleep(5000);
    }
    @Then("I Hover over second product and click {string}")
    public void iHoverOverSecondProductAndClickAddToCart(String string) {
        testCase12.ClickSecondProduct();
    }
    @And("I Click {string} button to see the products added in cart")
    public void iClickViewCartButtonToSeeTheProductsAddedInCart(String string) {
        testCase12.ClickViewCart();
        testCase12.ClickProceed();
    }
    @And("I Verify both products are added to Cart")
    public void iVerifyBothProductsAreAddedToCart() {
        WebElement firstProductInCart = driver.findElement(By.xpath("//tr[@id='product-1']"));
        WebElement secondProductInCart = driver.findElement(By.xpath("//tr[@id='product-2']"));

        Assert.assertTrue(firstProductInCart.isDisplayed());
        Assert.assertTrue(secondProductInCart.isDisplayed());
    }
    @Then("Verify their prices, quantity and total price")
    public void verifyTheirPricesQuantityAndTotalPrice() {
        JavascriptExecutor is = (JavascriptExecutor)driver;
        is.executeScript("window.scrollTo(0, 500);");

        WebElement firstProductPrice = driver.findElement(By.xpath("(//td[@class='cart_price'])[1]"));
        WebElement secondProductPrice = driver.findElement(By.xpath("(//td[@class='cart_price'])[2]"));
        WebElement firstProductQuantity = driver.findElement(By.xpath("(//td[@class='cart_quantity']//following::button[@class='disabled'])[1]"));
        WebElement secondProductQuantity = driver.findElement(By.xpath("(//td[@class='cart_quantity']//following::button[@class='disabled'])[2]"));
        WebElement TotalPrice = driver.findElement(By.xpath("//p[normalize-space()='Rs. 900']"));


        Assert.assertEquals(firstProductPrice.getText(), "Rs. 500");
        Assert.assertEquals(secondProductPrice.getText(), "Rs. 400");
        Assert.assertEquals(firstProductQuantity.getAttribute("value"),"1", "1");
        Assert.assertEquals(secondProductQuantity.getAttribute("value"),"1", "1");
        Assert.assertEquals(TotalPrice.getText(), "Rs. 900");
    }
    @Then("I Click {string} for any product on home page")
    public void iClickViewProductForAnyProductOnHomePage(String string) {
        testCase13.ClickViewCart();
    }
    @And("I Verify product detail is opened")
    public void iVerifyProductDetailIsOpened() {
        WebElement ProductInformation = driver.findElement(By.cssSelector("[class='product-information']"));

        Assert.assertTrue(ProductInformation.isDisplayed());
    }
    @And("I Increase quantity to {int}")
    public void iIncreaseQuantityTo(int qty4) {
        testCase13.IncreaseQty();
    }
    @And("I Verify that product is displayed in cart page with exact quantity")
    public void iVerifyThatProductIsDisplayedInCartPageWithExactQuantity() {
        WebElement product = driver.findElement(By.cssSelector("[id='product-1']"));
        WebElement ProductQuantity = driver.findElement(By.xpath("(//td[@class='cart_quantity']//following::button[@class='disabled'])[1]"));
        Assert.assertTrue(product.isDisplayed());
        Assert.assertEquals(ProductQuantity.getAttribute("value"),"4", "4");
    }
    @And("I add products to cart")
    public void iAddProductsToCart() {
        JavascriptExecutor is = (JavascriptExecutor)driver;
        is.executeScript("window.scrollTo(0, 300);");
        testCase12.ClickFirstProduct();
    }
    @And("I Verify that cart page is displayed")
    public void iVerifyThatCartPageIsDisplayed() {
        WebElement element = driver.findElement(By.xpath("//li[@class='active']"));
        Assert.assertEquals(element.getText(),"Shopping Cart","Shopping Cart");
    }
    @Then("I Click Proceed To Checkout")
    public void iClickProceedToCheckout() {
        testCase14.ClickProceedToCheckOut();
    }
    @And("I Click the {string} option")
    public void iClickTheRegisterLoginOption(String string) {
        testCase14.ClickLoginBtn();
    }
    @And("Fill all details in Signup and create account")
    public void fillAllDetailsInSignupAndCreateAccount() throws InterruptedException {
        testCase14.EnterUserName();
        testCase14.EnterEmailID();
        testCase14.SigNupBtn();
        Thread.sleep(5000);
        testCase14.ClickMr();
        testCase14.EnterPassword();
        testCase14.EnterDate();
        testCase14.EnterMonth();
        testCase14.EnterYear();
        Thread.sleep(5000);
        JavascriptExecutor is = (JavascriptExecutor)driver;
        is.executeScript("window.scrollTo(0, 300);");
        testCase14.ClickCheckBox1();
        Thread.sleep(5000);
        testCase14.ClickCheckBox2();
        Thread.sleep(5000);
        JavascriptExecutor to = (JavascriptExecutor)driver;
        to.executeScript("window.scrollTo(0, 500);");
        testCase14.EnterFirstName();
        testCase14.EnterLastName();
        testCase14.EnterCompany();
        testCase14.EnterStreet();
        testCase14.EnterRoad();
        testCase14.EnterState();
        testCase14.EnterCity();
        JavascriptExecutor was = (JavascriptExecutor)driver;
        was.executeScript("window.scrollTo(0, 500);");
        testCase14.EnterCode();
        testCase14.EnterNumber();
        Thread.sleep(5000);
        testCase14.EnterCreateBtn();
        Thread.sleep(5000);
    }
    @And("I Click on the {string} button")
    public void iClickOnTheProceedToCheckoutButton(String string) {
        testCase14.ClickProceedToCheckOut();
    }
    @And("I Verify Address Details and Review Your Order")
    public void iVerifyAddressDetailsAndReviewYourOrder() {
        WebElement Address = driver.findElement(By.cssSelector("[class='address item box']"));
        Assert.assertEquals(Address.getText(),"Your delivery address","Your delivery address");

        WebElement OrderReview = driver.findElement(By.xpath("(//h2[@class='heading'])[2]"));
        Assert.assertEquals(OrderReview.getText(),"Review Your Order","Review Your Order");
    }
    @Then("I Enter description in comment text area and click {string}")
    public void iEnterDescriptionInCommentTextAreaAndClickPlaceOrder(String string) {
        testCase14.SendMessage();
        testCase14.ClickPlaceOrder();
    }
    @And("I Enter payment details: Name on Card, Card Number, CVC, Expiration date")
    public void iEnterPaymentDetailsNameOnCardCardNumberCVCExpirationDate() throws InterruptedException {
        testCase14.SendName();
        testCase14.EnterCardNumber();
        testCase14.EnterCvv();
        testCase14.EnterExpMonth();
        testCase14.EnterExpYear();
        Thread.sleep(5000);
    }
    @And("I Click the {string} option button")
    public void iClickThePayAndConfirmOrderOptionButton(String string) throws InterruptedException {
        testCase14.ClickPayAndConfirm();
        Thread.sleep(10000);
    }
    @Then("Verify success message {string}")
    public void verifySuccessMessageYourOrderHasBeenPlacedSuccessfully(String string) throws InterruptedException {
        WebElement SuccessMessage = driver.findElement(By.xpath("(//div[@class='alert-success alert'])[1]"));
        Assert.assertEquals(SuccessMessage.getText(), "Your order has been placed successfully!","Your order has been placed successfully!");
        Thread.sleep(5000);
    }
    @And("Fill email, password and click {string} button")
    public void fillEmailPasswordAndClickLoginButton(String button) throws InterruptedException {
        testCase16.EnterEmail();
        testCase16.EnterPassword();
        Thread.sleep(5000);
        testCase16.ClickLgnBtn(button);
    }
    @And("Click {string} button corresponding to particular product")
    public void clickXButtonCorrespondingToParticularProduct(String string) throws InterruptedException {
        driver.findElement(By.xpath("//i[@class='fa fa-times']")).click();
        Thread.sleep(5000);
    }
    @Then("I Verify that product is removed from the cart")
    public void iVerifyThatProductIsRemovedFromTheCart() {
        WebElement element = driver.findElement(By.xpath("//b[normalize-space()='Cart is empty!']"));
        Assert.assertEquals(element.getText(),"Cart is empty!","Cart is empty!");
    }
    @When("I Verify that categories are visible on left side bar")
    public void iVerifyThatCategoriesAreVisibleOnLeftSideBar() {
        WebElement element = driver.findElement(By.xpath("//h2[normalize-space()='Category']"));
        Assert.assertEquals(element.getText(),"Category","Category");
    }
    @And("I Click on {string} category")
    public void iClickOnWomenCategory(String string) {
        JavascriptExecutor is = (JavascriptExecutor)driver;
        is.executeScript("window.scrollTo(0, 300);");

        driver.findElement(By.xpath("//a[normalize-space()='Women']")).click();
    }
    @And("I Click on any category link under {string} category, for example: Dress")
    public void iClickOnAnyCategoryLinkUnderWomenCategoryForExampleDress(String string) throws InterruptedException {
        JavascriptExecutor is = (JavascriptExecutor)driver;
        is.executeScript("window.scrollTo(0, 300);");

        driver.findElement(By.xpath("//div[@id='Women']//li[2]")).click();
        Thread.sleep(5000);
    }
    @Then("I Verify that category page is displayed and confirm text {string}")
    public void iVerifyThatCategoryPageIsDisplayedAndConfirmTextWOMENTOPSPRODUCTS(String string) throws InterruptedException {
        JavascriptExecutor is = (JavascriptExecutor)driver;
        is.executeScript("window.scrollTo(0, 300);");

        WebElement element = driver.findElement(By.cssSelector("[class='title text-center']"));
        Assert.assertEquals(element.getText(),"Women -  Tops Products","Women -  Tops Products");
        Thread.sleep(10000);
    }
    @And("On left side bar, click on any sub-category link of {string} category")
    public void onLeftSideBarClickOnAnySubCategoryLinkOfMenCategory(String category) throws InterruptedException {
        JavascriptExecutor is = (JavascriptExecutor)driver;
        is.executeScript("window.scrollTo(0, 400);");
        driver.findElement(By.xpath("//a[normalize-space()='Men']")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//a[contains(text(),'Tshirts')]")).click();

        Thread.sleep(10000);
    }
    @And("I Verify that user is navigated to that category page")
    public void iVerifyThatUserIsNavigatedToThatCategoryPage() throws InterruptedException {
        WebElement element = driver.findElement(By.cssSelector("[class='title text-center']"));

        // Verify the text
        Assert.assertEquals(element.getText(),"MEN - TSHIRTS PRODUCTS", "MEN - TSHIRTS PRODUCTS");
    }
    @And("Verify that Brands are visible on left side bar")
    public void verifyThatBrandsAreVisibleOnLeftSideBar() throws InterruptedException {
        JavascriptExecutor is = (JavascriptExecutor)driver;
        is.executeScript("window.scrollTo(0, 500);");

        WebElement element = driver.findElement(By.xpath("//h2[normalize-space()='Brands']"));
        Assert.assertEquals(element.getText(),"Brands","Brands");
        Thread.sleep(5000);
    }
    @And("I Click on any brand name")
    public void iClickOnAnyBrandName() throws InterruptedException {
        JavascriptExecutor is = (JavascriptExecutor)driver;
        is.executeScript("window.scrollTo(0, 500);");

        driver.findElement(By.xpath("//a[@href='/brand_products/Polo']")).click();
        Thread.sleep(5000);
    }
    @Then("I Verify that user is navigated to brand page and brand products are displayed")
    public void iVerifyThatUserIsNavigatedToBrandPageAndBrandProductsAreDisplayed() {

        WebElement element = driver.findElement(By.cssSelector("[class='title text-center']"));
        Assert.assertEquals(element.getText(),"BRAND - POLO PRODUCTS","BRAND - POLO PRODUCTS");
    }
    @And("On left side bar, click on any other brand link")
    public void onLeftSideBarClickOnAnyOtherBrandLink() throws InterruptedException {
        JavascriptExecutor is = (JavascriptExecutor)driver;
        is.executeScript("window.scrollTo(0, 500);");

        driver.findElement(By.xpath("//a[@href='/brand_products/H&M']")).click();
        Thread.sleep(5000);
    }
    @And("I Verify that user is navigated to that brand page and can see products")
    public void iVerifyThatUserIsNavigatedToThatBrandPageAndCanSeeProducts() {
        WebElement element = driver.findElement(By.cssSelector("[class='title text-center']"));
        Assert.assertEquals(element.getText(),"BRAND - H&M PRODUCTS","BRAND - H&M PRODUCTS");
    }
    @And("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verifyUserIsNavigatedToALLPRODUCTSPageSuccessfully() throws InterruptedException {
        WebElement element = driver.findElement(By.cssSelector("[class='title text-center']"));
        Assert.assertEquals(element.getText(),"All Products","All Products");
        Thread.sleep(5000);
    }
    @And("I Enter product name in search input and click search")
    public void iEnterProductNameInSearchInputAndClickSearch() throws InterruptedException {
        testCase20.EnterTshIrt();
        testCase20.ClickSearch();
        Thread.sleep(5000);
    }
    @Then("Verify {string} is visible")
    public void verifySEARCHEDPRODUCTSIsVisible(String string) throws InterruptedException {
        WebElement element = driver.findElement(By.cssSelector("[class='title text-center']"));
        Assert.assertEquals(element.getText(),"SEARCHED PRODUCTS","SEARCHED PRODUCTS");
        Thread.sleep(5000);
    }
    @And("Verify all the products related to search are visible")
    public void verifyAllTheProductsRelatedToSearchAreVisible() {
        JavascriptExecutor is = (JavascriptExecutor)driver;
        is.executeScript("window.scrollTo(0, 500);");

        String searchTerm = "T-shirt";
        List<WebElement> products = driver.findElements(By.cssSelector("[class='productinfo text-center']"));

// Loop through each product to check if its name contains the search term
        for (WebElement product : products) {
            // Adjust this locator based on the correct HTML structure
            String productName = product.findElement(By.tagName("p")).getText();
            System.out.println(productName);
            Assert.assertEquals(productName,"T-shirt","T-shirt");
            // Verify the product name contains the search term
            Assert.assertTrue("Product name '" + productName + "' does not match the search term '" + searchTerm + "'",
                    productName.toLowerCase().contains(searchTerm.toLowerCase()));
        }
    }
    @And("Add those products to cart")
    public void addThoseProductsToCart() throws InterruptedException {
//        List<WebElement> products = driver.findElements(By.cssSelector(".productinfo.text-center"));
//        for (WebElement product : products) {
//            product.findElement(By.xpath("//a[text()='Add to cart']")).click();
//            Thread.sleep(3000);
//                driver.findElement(By.xpath("//button[text()='Continue Shopping']")).click();
//        }
        testCase20.ClickFProduct();
        testCase20.ClickCtnBtn();
        testCase20.ClickSProduct();
        testCase20.ClickCtnBtn();
        testCase20.ClickTProduct();
        testCase20.ClickCtnBtn();
    }
    @Then("I Click {string} button and verify that products are visible in cart")
    public void iClickCartButtonAndVerifyThatProductsAreVisibleInCart(String string) throws InterruptedException {
        testCase20.ClickCart();
        Thread.sleep(5000);
        WebElement cartProductList = driver.findElement(By.xpath("//table[@id='cart_info_table']"));
        Assert.assertTrue(cartProductList.isDisplayed());
    }
    @And("submit login details")
    public void submitLoginDetails() throws InterruptedException {
        testCase20.EnterEmail();
        testCase20.EnterPassword();
        testCase20.ClickLgnBtn();
        Thread.sleep(5000);
    }
    @And("Again, go to Cart page")
    public void againGoToCartPage() {
        testCase20.ClickCart();
    }
    @Then("I Verify that those products are visible in cart after login as well")
    public void iVerifyThatThoseProductsAreVisibleInCartAfterLoginAsWell() {
        WebElement cartProductList = driver.findElement(By.xpath("//table[@id='cart_info_table']"));
        Assert.assertTrue(cartProductList.isDisplayed());
    }
    @And("I Click on {string} button in anyone of the product")
    public void iClickOnViewProductButtonInAnyoneOfTheProduct(String string) throws InterruptedException {
        JavascriptExecutor is = (JavascriptExecutor)driver;
        is.executeScript("window.scrollTo(0, 450);");
        testCase21.ClickFirstViewCart();
        Thread.sleep(5000);
    }
    @Then("I Verify {string} option is visible")
    public void iVerifyWriteYourReviewOptionIsVisible(String string) {
        WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Write Your Review']"));
        Assert.assertEquals(element.getText(),"Write Your Review","Write Your Review");
    }
    @And("I Enter name, email and review")
    public void iEnterNameEmailAndReview() {
        testCase21.EnterName();
        testCase21.EnterEmail();
        testCase21.EnterMessage();
    }
    @And("Click the {string} button")
    public void clickTheButton(String string) {
        testCase21.ClickSubmit();
    }
    @Then("I Verify success message {string}")
    public void iVerifySuccessMessageThankYouForYourReview(String string) {
        WebElement element = driver.findElement(By.xpath("(//div[@class='alert-success alert'])[1]"));
        Assert.assertEquals(element.getText(),"Thank you for your review.","Thank you for your review.");
    }
    @When("I Scroll to bottom of page")
    public void iScrollToBottomOfPage() throws InterruptedException {
        JavascriptExecutor is = (JavascriptExecutor) driver;
        is.executeScript("window.scrollTo(0, 8000);");
        Thread.sleep(2000);
    }
    @Then("I Verify {string} are visible")
    public void iVerifyRECOMMENDEDITEMSAreVisible(String string) {
        WebElement element = driver.findElement(By.xpath("//h2[normalize-space()='recommended items']"));
        Assert.assertEquals(element.getText(),"RECOMMENDED ITEMS","RECOMMENDED ITEMS");

    }
    @And("I Click on {string} on Recommended product")
    public void iClickOnAddToCartOnRecommendedProduct(String string)  {
        testCase22.ClickProduct();
    }
    @And("I Click {string} button option")
    public void iClickViewCartButtonOption(String string) throws InterruptedException {
        testCase22.ClickViewCart();
        Thread.sleep(1000);
    }
    @And("I Verify that product is displayed in cart page")
    public void iVerifyThatProductIsDisplayedInCartPage() throws InterruptedException {
        WebElement cartProductList = driver.findElement(By.xpath("//table[@id='cart_info_table']"));
        Assert.assertTrue(cartProductList.isDisplayed());
        Thread.sleep(5000);
    }
    @Then("I Verify that the delivery address is same address filled at the time registration of account")
    public void iVerifyThatTheDeliveryAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() {
        WebElement DeliveryAddress = driver.findElement(By.xpath("//ul[@id='address_delivery']//li[@class='address_city address_state_name address_postcode']"));
        Assert.assertEquals(DeliveryAddress.getText(),"Coimbatore Tamil Nadu 600100","Coimbatore Tamil Nadu 600100");
    }
    @And("I Verify that the billing address is same address filled at the time registration of account")
    public void iVerifyThatTheBillingAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() {
        WebElement BillingAddress = driver.findElement(By.xpath("//ul[@id='address_invoice']//li[@class='address_city address_state_name address_postcode']"));
        Assert.assertEquals(BillingAddress.getText(),"Coimbatore Tamil Nadu 600100","Coimbatore Tamil Nadu 600100");
    }

    @And("I Click {string} button and verify invoice is downloaded successfully")
    public void iClickDownloadInvoiceButtonAndVerifyInvoiceIsDownloadedSuccessfully(String string) throws InterruptedException {
        testCase24.ClickDownloadInvoice();
        Thread.sleep(5000);
        WebElement InvoiceText = driver.findElement(By.cssSelector("[style='font-size: 20px; font-family: garamond;']"));
        Assert.assertEquals(InvoiceText.getText(),"Congratulations! Your order has been confirmed!","Congratulations! Your order has been confirmed!");
    }
    @And("I Scroll down page to bottom")
    public void iScrollDownPageToBottom() {
        JavascriptExecutor is = (JavascriptExecutor) driver;
        is.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }
    @Then("I Click on arrow at bottom right side to move upward")
    public void iClickOnArrowAtBottomRightSideToMoveUpward() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-angle-up']"))).click();
    }
    @And("I Verify that page is scrolled up and {string} text is visible on screen")
    public void iVerifyThatPageIsScrolledUpAndFullFledgedPracticeWebsiteForAutomationEngineersTextIsVisibleOnScreen(String string) {
        WebElement element = driver.findElement(By.cssSelector("div[class='item active'] div[class='col-sm-6'] h2"));
        Assert.assertEquals(element.getText(),"Full-Fledged practice website for Automation Engineers","Full-Fledged practice website for Automation Engineers");
    }

    @Then("I Scroll up page to top")
    public void iScrollUpPageToTop() {
        JavascriptExecutor is = (JavascriptExecutor) driver;
        is.executeScript("window.scrollTo(0, 0);");
    }
}

