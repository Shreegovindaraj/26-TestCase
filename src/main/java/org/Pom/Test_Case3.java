package org.Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test_Case3 {
    WebDriver driver;

    public Test_Case3(WebDriver driver){
        this.driver = driver;
    }
    public By Email = By.xpath("//input[@data-qa='login-email']");
    public By Password = By.xpath("//input[@placeholder='Password']");

    public void EnterEmail(String email){driver.findElement(Email).sendKeys(email);}
    public void EnterPassword(String password){driver.findElement(Password).sendKeys(password);}
}
