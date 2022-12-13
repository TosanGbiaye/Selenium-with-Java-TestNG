package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class First {
    WebDriver driver;
    WebDriverWait wait;
    ElementMapper em;

    public void startSession(){
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,10);
        driver.get(em.homePage);
        driver.manage().window().maximize();
    }
    public void terminateSession(){
        driver.quit();
    }

    public void adminLogin(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(em.usernameField)));
        driver.findElement(By.cssSelector(em.usernameField)).sendKeys(em.adminUser);
        driver.findElement(By.cssSelector(em.passwordField)).sendKeys(em.password);
        driver.findElement(By.cssSelector(em.loginButton)).click();
        //To get an element text (welcome text) on the web page
        String welcome_text = driver.findElement(By.cssSelector(em.welcomeHeader)).getText();
        Assert.assertEquals(welcome_text, "Welcome back, Admin! \uD83D\uDC4B");

    }

    public void managerLogin(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(em.usernameField)));
        //to enter username
        driver.findElement(By.cssSelector(em.usernameField)).sendKeys(em.managerUser);
        //To enter password
        driver.findElement(By.cssSelector(em.passwordField)).sendKeys(em.password);
        //To click on login button
        driver.findElement(By.cssSelector(em.loginButton)).click();
        //To get an element text (welcome text) on the web page
        String welcome_text = driver.findElement(By.cssSelector(em.welcomeHeader)).getText();
        Assert.assertEquals(welcome_text, "Welcome back, Max! \uD83D\uDC4B");

    }

    public void teacherLogin(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(em.usernameField)));
        //To enter  username
        driver.findElement(By.cssSelector(em.usernameField)).sendKeys(em.teacherUser);
        //To enter password
        driver.findElement(By.cssSelector(em.passwordField)).sendKeys(em.password);
        //To click on login button
        driver.findElement(By.cssSelector(em.loginButton)).click();
        //To get an element text (welcome text) on the web page
        String welcome_text = driver.findElement(By.cssSelector(em.welcomeHeader)).getText();
        Assert.assertEquals(welcome_text, "Welcome back, Terri! \uD83D\uDC4B");

    }

    public void studentLogin(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(em.usernameField)));
        //enter valid username
        driver.findElement(By.cssSelector(em.usernameField)).sendKeys(em.studentUser);
        //To enter password
        driver.findElement(By.cssSelector(em.passwordField)).sendKeys(em.password);
        //To click on login button
        driver.findElement(By.cssSelector(em.loginButton)).click();
        //To get an element text (welcome text) on the web page
        String welcome_text = driver.findElement(By.cssSelector(em.welcomeHeader)).getText();
        Assert.assertEquals(welcome_text, "Welcome back, Sam! \uD83D\uDC4B");

    }
}