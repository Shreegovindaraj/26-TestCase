package org.Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test_Case21 {
    WebDriver driver;

    public Test_Case21(WebDriver driver) {
        this.driver = driver;
    }
    public By ViewCart = By.xpath("(//a[@style='color: brown;'])[1]");
    public By Name = By.xpath("//input[@id='name']");
    public By Email = By.xpath("//input[@id='email']");
    public By Message = By.xpath("//textarea[@id='review']");
    public By Submit = By.cssSelector("[class='btn btn-default pull-right']");

    public void ClickFirstViewCart(){driver.findElement(ViewCart).click();}
    public void EnterName(){driver.findElement(Name).sendKeys("Shree");}
    public void EnterEmail(){driver.findElement(Email).sendKeys("Shree159@gmail.com");}
    public void EnterMessage(){driver.findElement(Message).sendKeys("Nothing");}
    public void ClickSubmit(){driver.findElement(Submit).click();}

}
