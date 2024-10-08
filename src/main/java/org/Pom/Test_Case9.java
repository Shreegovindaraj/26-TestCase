package org.Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test_Case9 {
    WebDriver driver;

    public Test_Case9(WebDriver driver) {
        this.driver = driver;
    }

    public By Search = By.xpath("//input[@id='search_product']");
    public By SearchBtn = By.xpath("//i[@class='fa fa-search']");

    public void ClickSearch() {driver.findElement(Search).sendKeys("Shrit");}
    public void ClickSearchBtn() {driver.findElement(SearchBtn).click();}
}

