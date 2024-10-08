package org.Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test_Case7 {
    WebDriver driver;

    public Test_Case7(WebDriver driver){
        this.driver = driver;
    }
    public By TestCase = By.xpath("//a[normalize-space()='Test Cases']");

    public void ClickTestCase(){ driver.findElement(TestCase).click();}
}
