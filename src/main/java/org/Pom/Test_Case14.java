package org.Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test_Case14 {
    WebDriver driver;

    public Test_Case14(WebDriver driver) {
        this.driver = driver;
    }
    public By ProceedToCheckOut = By.xpath("//a[@class='btn btn-default check_out']");
    public By LoginBtn = By.xpath("(//a[@href='/login'])[2]");
    public By UserName = By.xpath("//input[@placeholder='Name']");
    public By EmailID = By.xpath("//input[@data-qa='signup-email']");
    public By SigNup = By.xpath("//button[normalize-space()='Signup']");
    public By Mr = By.xpath("//input[@id='id_gender1']");
    public By Password = By.xpath("//input[@id='password']");
    public By Date = By.xpath("//select[@id='days']");
    public By Month = By.xpath("//select[@id='months']");
    public By Year = By.xpath("//select[@id='years']");
    public By CheckBox1 = By.cssSelector("[id='newsletter']");
    public By CheckBox2 = By.cssSelector("[id='optin']");
    public By FirstName = By.xpath("//input[@id='first_name']");
    public By LastName = By.xpath("//input[@id='last_name']");
    public By Company = By.xpath("//input[@id='company']");
    public By Street = By.xpath("//input[@id='address1']");
    public By Road = By.xpath("//input[@id='address2']");
    public By State = By.xpath("//input[@id='state']");
    public By City = By.xpath("//input[@id='city']");
    public By Code = By.xpath("//input[@id='zipcode']");
    public By Number = By.xpath("//input[@id='mobile_number']");
    public By CreateBtn = By.cssSelector("[data-qa='create-account']");
    public By Message = By.xpath("//textarea[@name='message']");
    public By PlaceOrder = By.xpath("//a[text()='Place Order']");
    public By Name = By.cssSelector("[name='name_on_card']");
    public By CardNumber = By.cssSelector("[name='card_number']");
    public By Cvv = By.cssSelector("[name='cvc']");
    public By ExpMonth = By.cssSelector("[name='expiry_month']");
    public By ExpYear = By.cssSelector("[name='expiry_year']");
    public By PayAndConfirm = By.cssSelector("[class='form-control btn btn-primary submit-button']");

    public void ClickProceedToCheckOut(){driver.findElement(ProceedToCheckOut).click();}

    public void ClickLoginBtn(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement until = wait.until(ExpectedConditions.visibilityOfElementLocated(LoginBtn));
        until.click();
    }
    public void EnterUserName(){driver.findElement(UserName).sendKeys("Shree");}
    public void EnterEmailID(){driver.findElement(EmailID).sendKeys("Shree4856@gmail.com");}
    public void SigNupBtn(){driver.findElement(SigNup).click();}
    public void ClickMr(){driver.findElement(Mr).click();}
    public void EnterPassword(){driver.findElement(Password).sendKeys("123456789");}
    public void EnterDate(){driver.findElement(Date).sendKeys("8");}
    public void EnterMonth(){driver.findElement(Month).sendKeys("October");}
    public void EnterYear(){driver.findElement(Year).sendKeys("1995");}
    public void ClickCheckBox1(){driver.findElement(CheckBox1).click();}
    public void ClickCheckBox2(){driver.findElement(CheckBox2).click();}
    public void EnterFirstName(){driver.findElement(FirstName).sendKeys("Shree");}
    public void EnterLastName(){driver.findElement(LastName).sendKeys("G");}
    public void EnterCompany(){driver.findElement(Company).sendKeys("XYZ Company");}
    public void EnterStreet(){driver.findElement(Street).sendKeys("X Street");}
    public void EnterRoad(){driver.findElement(Road).sendKeys("Y Road");}
    public void EnterState(){driver.findElement(State).sendKeys("Tamil Nadu");}
    public void EnterCity(){driver.findElement(City).sendKeys("Coimbatore");}
    public void EnterCode(){driver.findElement(Code).sendKeys("600100");}
    public void EnterNumber(){driver.findElement(Number).sendKeys("9876543210");}
    public void EnterCreateBtn(){driver.findElement(CreateBtn).click();}
    public void SendMessage(){driver.findElement(Message).sendKeys("Nothing");}
    public void ClickPlaceOrder(){driver.findElement(PlaceOrder).click();}

    public void SendName(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement until = wait.until(ExpectedConditions.visibilityOfElementLocated(Name));
        until.sendKeys("Shree");
    }
    public void EnterCardNumber(){driver.findElement(CardNumber).sendKeys("1122334455667788");}
    public void EnterCvv(){driver.findElement(Cvv).sendKeys("951");}
    public void EnterExpMonth(){driver.findElement(ExpMonth).sendKeys("10");}
    public void EnterExpYear(){driver.findElement(ExpYear).sendKeys("2026");}
    public void ClickPayAndConfirm(){driver.findElement(PayAndConfirm).click();}
}

