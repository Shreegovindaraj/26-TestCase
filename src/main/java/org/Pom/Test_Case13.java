package org.Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test_Case13 {
    WebDriver driver;

    public Test_Case13(WebDriver driver) {
        this.driver = driver;
    }
    public By ViewCart = By.xpath("(//i[@class='fa fa-plus-square'])[1]");
    public By Qty = By.xpath("//input[@id='quantity']");

    public void ClickViewCart(){driver.findElement(ViewCart).click();}
    public void IncreaseQty(){
        driver.findElement(Qty).clear();
        driver.findElement(Qty).sendKeys("4");
    }
}
