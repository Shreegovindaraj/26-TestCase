package org.Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test_Case4 {
    WebDriver driver;


    public Test_Case4(WebDriver driver){
        this.driver = driver;
    }
    public By Email = By.xpath("//input[@data-qa='login-email']");
    public By Password = By.xpath("//input[@placeholder='Password']");
    public By Logout = By.xpath("//a[normalize-space()='Logout']");

    public void EnterEmail(String email){driver.findElement(Email).sendKeys(email);}
    public void EnterPassword(String password){driver.findElement(Password).sendKeys(password);}
    public void ClickLogout(){driver.findElement(Logout).click();}

}
