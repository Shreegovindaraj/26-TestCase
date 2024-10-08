package org.Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test_Case12 {
    WebDriver driver;

    public Test_Case12(WebDriver driver) {
        this.driver = driver;
    }

    public By Continue = By.cssSelector("[class='btn btn-success close-modal btn-block']");
    public By ViewCart = By.xpath("(//p[@class='text-center'])[2]");
    public By Proceed = By.xpath("//a[@class='btn btn-default check_out']");

    public void ClickFirstProduct() {
        WebElement firstProduct = driver.findElement(By.xpath("(//div[@class='productinfo text-center']//following::a[@class='btn btn-default add-to-cart'])[1]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", firstProduct);

        Actions actions = new Actions(driver);
        actions.moveToElement(firstProduct).perform();

        WebElement addToCartFirst = driver.findElement(By.xpath("(//a[text()='Add to cart'])[1]"));
        addToCartFirst.click();
    }
    public void ClickContinue(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement ContinueShopping = wait.until(ExpectedConditions.visibilityOfElementLocated(Continue));
        ContinueShopping.click();
    }
    public void ClickSecondProduct() {
        WebElement secondProduct = driver.findElement(By.xpath("(//div[@class='productinfo text-center'])[2]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", secondProduct);

        Actions actions = new Actions(driver);
        actions.moveToElement(secondProduct).perform();

        WebElement addToCartFirst = driver.findElement(By.xpath("(//a[text()='Add to cart'])[3]"));
        addToCartFirst.click();
    }
    public void ClickViewCart(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement Cart = wait.until(ExpectedConditions.visibilityOfElementLocated(ViewCart));
        Cart.click();
    }
    public void ClickProceed(){driver.findElement(Proceed).click();}
}
