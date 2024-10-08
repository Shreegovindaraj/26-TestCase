package org.Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test_Case10 {
    WebDriver driver;

    public Test_Case10(WebDriver driver) {
        this.driver = driver;
    }

    public By Email = By.xpath("//input[@id='susbscribe_email']");
    public By Arrow = By.xpath("//i[@class='fa fa-arrow-circle-o-right']");


    public void EnterEmail() {driver.findElement(Email).sendKeys("Shree123@gmail.com");}
    public void ClickArrow() {driver.findElement(Arrow).click();}
}
