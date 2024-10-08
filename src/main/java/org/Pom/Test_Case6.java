package org.Pom;

import org.openqa.selenium.*;

public class Test_Case6 {
    WebDriver driver;

    public Test_Case6(WebDriver driver){
        this.driver = driver;
    }

    public By Contact = By.xpath("//a[normalize-space()='Contact us']");
    public By Name = By.xpath("//input[@placeholder='Name']");
    public By Email = By.xpath("//input[@placeholder='Email']");
    public By Subject = By.xpath("//input[@placeholder='Subject']");
    public By Message = By.xpath("//textarea[@id='message']");
    public By Upload = By.xpath("//input[@name='upload_file']");
    public By Submit = By.xpath("//input[@name='submit']");
    public By Home = By.xpath("//span[normalize-space()='Home']");

    public void ClickContact(){driver.findElement(Contact).click();}
    public void EnterName(){driver.findElement(Name).sendKeys("Shree");}
    public void EnterEmail(){driver.findElement(Email).sendKeys("Shree123@gmail.com");}
    public void EnterSubject(){driver.findElement(Subject).sendKeys("Nothing");}
    public void EnterMessage(){driver.findElement(Message).sendKeys("Nothing");}
    public void FileUpload(){
        WebElement element = driver.findElement(Upload);
        String filepath = "C:\\Users\\Dell\\Desktop\\shree\\axess\\Cucumber\\Automation Exercise.pdf";
        element.sendKeys(filepath);
    }
    public void ClickSubmit(){
        try {
            WebElement ad = driver.findElement(By.id("aswift_4_host")); // Adjust the locator based on the actual blocking element
            ((JavascriptExecutor) driver).executeScript("arguments[0].style.visibility='hidden';", ad);
        } catch (NoSuchElementException e) {
            // If the element doesn't exist, continue
        }
        // Now try to click the submit button
        driver.findElement(Submit).click();
    }
    public void ClickHome(){driver.findElement(Home).click();}
}
