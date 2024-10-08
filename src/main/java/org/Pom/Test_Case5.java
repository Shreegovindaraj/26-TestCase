package org.Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test_Case5 {
    WebDriver driver;

    public Test_Case5(WebDriver driver){
        this.driver = driver;
    }

    public By UserName = By.xpath("//input[@placeholder='Name']");
    public By EmailID = By.xpath("//input[@data-qa='signup-email']");

    public void EnterUserName(String name){driver.findElement(UserName).sendKeys(name);}
    public void EnterEmailID(String email){driver.findElement(EmailID).sendKeys(email);}
}
