package org.Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test_Case8 {
    WebDriver driver;

    public Test_Case8(WebDriver driver){
        this.driver = driver;
    }
    public By Product = By.xpath("//a[@href='/products']");
    public By FirstProduct = By.xpath("(//a[text()='View Product'])[1]");

    public void ClickProduct(){driver.findElement(Product).click();}
    public void ClickFirstProduct(){driver.findElement(FirstProduct).click();}

}
