package org.Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class Test_Case2 {
    WebDriver driver;

    public Test_Case2(WebDriver driver){
        this.driver = driver;
    }

    public By Email = By.xpath("//input[@data-qa='login-email']");
    public By Password = By.xpath("//input[@placeholder='Password']");
    public By Login = By.xpath("//button[normalize-space()='Login']");

    public void EnterEmail(String email){driver.findElement(Email).sendKeys(email);}
    public void EnterPassword(String password){driver.findElement(Password).sendKeys(password);}
    public void ClickLogin(){driver.findElement(Login).click();}
}
