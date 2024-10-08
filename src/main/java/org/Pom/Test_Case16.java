package org.Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test_Case16 {
    WebDriver driver;

    public Test_Case16(WebDriver driver) {
        this.driver = driver;
    }
    public By Email = By.xpath("//input[@data-qa='login-email']");
    public By Password = By.xpath("//input[@placeholder='Password']");
    public By LgnBtn = By.xpath("//button[normalize-space()='Login']");

    public void EnterEmail(){driver.findElement(Email).sendKeys("Shree123@gmail.com");}
    public void EnterPassword(){driver.findElement(Password).sendKeys("123456789");}
    public void ClickLgnBtn(String button){driver.findElement(LgnBtn).click();}

}
