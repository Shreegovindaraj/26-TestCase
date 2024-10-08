package org.Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test_Case24 {
    WebDriver driver;

    public Test_Case24(WebDriver driver) {
        this.driver = driver;
    }

    public By DownloadInvoice = By.cssSelector("[class='btn btn-default check_out']");

    public void ClickDownloadInvoice(){driver.findElement(DownloadInvoice).click();}
}

