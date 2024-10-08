package org.Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test_Case20 {
    WebDriver driver;

    public Test_Case20(WebDriver driver) {
        this.driver = driver;
    }
    public By TshIrt = By.cssSelector("[id='search_product']");
    public By Search = By.cssSelector("[id='submit_search']");
    public By FProduct = By.xpath("(//a[text()='Add to cart'])[1]");
    public By SProduct = By.xpath("(//a[text()='Add to cart'])[3]");
    public By TProduct = By.xpath("(//a[text()='Add to cart'])[5]");
    public By CtnBtn = By.xpath("//button[text()='Continue Shopping']");
    public By Cart = By.xpath("//a[normalize-space()='Cart']");
    public By Email = By.xpath("//input[@data-qa='login-email']");
    public By PassWord = By.xpath("//input[@placeholder='Password']");
    public By LgnBtn = By.xpath("//button[normalize-space()='Login']");

    public void EnterTshIrt(){driver.findElement(TshIrt).sendKeys("T-shirt");}
    public void ClickSearch(){driver.findElement(Search).click();}

    public void ClickFProduct(){driver.findElement(FProduct).click();}
    public void ClickSProduct(){driver.findElement(SProduct).click();}
    public void ClickTProduct(){driver.findElement(TProduct).click();}
    public void ClickCtnBtn(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(CtnBtn)).click();}

    public void ClickCart(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(Cart)).click();}
    public void EnterEmail(){driver.findElement(Email).sendKeys("Shree159@gmail.com");}
    public void EnterPassword(){driver.findElement(PassWord).sendKeys("987654321");}
    public void ClickLgnBtn(){driver.findElement(LgnBtn).click();}
}
