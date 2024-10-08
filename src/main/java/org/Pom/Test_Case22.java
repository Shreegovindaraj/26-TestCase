package org.Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test_Case22 {
    WebDriver driver;

    public Test_Case22(WebDriver driver) {
        this.driver = driver;
    }

    public By Product = By.xpath("//div[@class='item active']//div[2]//div[1]//div[1]//div[1]//a[1]");
    public By ViewCart = By.xpath("//a[@href='/view_cart']");

    public void ClickProduct(){driver.findElement(Product).click();}
    public void ClickViewCart(){driver.findElement(ViewCart).click();}
}
