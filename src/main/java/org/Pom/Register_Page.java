package org.Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register_Page {
    WebDriver driver;

    public Register_Page(WebDriver driver){
        this.driver= driver;
    }
    public By SignUp = By.xpath("//a[normalize-space()='Signup / Login']");
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
    public By ContinueBtn = By.xpath("//a[@data-qa='continue-button']");
    public By Delete = By.xpath("(//ul[@class='nav navbar-nav']//following::li//following::a)[4]");


    public void ClickSignUp(){ driver.findElement(SignUp).click();}
    public void EnterUserName(String name){driver.findElement(UserName).sendKeys(name);}
    public void EnterEmailID(String email){driver.findElement(EmailID).sendKeys(email);}
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
    public void ClickContinueBtn(){driver.findElement(ContinueBtn).click();}
    public void ClickDelete(){driver.findElement(Delete).click();}

}
