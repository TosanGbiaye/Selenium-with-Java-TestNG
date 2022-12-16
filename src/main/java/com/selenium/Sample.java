////Multiple Scenerio Automation
//package com.selenium;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//
//public class Sample {
//    WebDriver driver = new ChromeDriver();
//   public void adminLogin(){
//        driver = new ChromeDriver();
//        driver.get("https://sandbox.moodledemo.net/login/");
//        driver.manage().window().maximize();
//        driver.findElement(By.cssSelector("#username")).sendKeys("admin");
//        driver.findElement(By.cssSelector("#password")).sendKeys("sandbox");
//        driver.findElement(By.cssSelector("#loginbtn")).click();
//        //to inspect the welcome test we use Assert
//        String welcome_text = driver.findElement(By.cssSelector("[class='mb-3 mt-3']")).getText();
//        Assert.assertEquals(welcome_text, "Welcome back, Admin! \uD83D\uDC4B");
//        driver.quit();
//    }
//    public void managerLogin(){
//        driver = new ChromeDriver();
//        driver.get("https://sandbox.moodledemo.net/login/");
//        driver.manage().window().maximize();
//        driver.findElement(By.cssSelector("#username")).sendKeys("manager");
//        driver.findElement(By.cssSelector("#password")).sendKeys("sandbox");
//        driver.findElement(By.cssSelector("#loginbtn")).click();
//        //to inspect the welcome test we use Assert
//        String welcome_text = driver.findElement(By.cssSelector("[class='mb-3 mt-3']")).getText();
//        Assert.assertEquals(welcome_text, "Welcome back, Max! \uD83D\uDC4B");
//        driver.quit();
//    }
//    public void teacherLogin(){
//        driver = new ChromeDriver();
//        driver.get("https://sandbox.moodledemo.net/login/");
//        driver.manage().window().maximize();
//        driver.findElement(By.cssSelector("#username")).sendKeys("teacher");
//        driver.findElement(By.cssSelector("#password")).sendKeys("sandbox");
//        driver.findElement(By.cssSelector("#loginbtn")).click();
//        //to inspect the welcome test we use Assert
//        String welcome_text = driver.findElement(By.cssSelector("[class='mb-3 mt-3']")).getText();
//        Assert.assertEquals(welcome_text, "Welcome back, Terri! \uD83D\uDC4B");
//        driver.quit();
//    }
//    public void studentLogin(){
//        driver = new ChromeDriver();
//        driver.get("https://sandbox.moodledemo.net/login/");
//        driver.manage().window().maximize();
//        driver.findElement(By.cssSelector("#username")).sendKeys("student");
//        driver.findElement(By.cssSelector("#password")).sendKeys("sandbox");
//        driver.findElement(By.cssSelector("#loginbtn")).click();
//        //to inspect the welcome test we use Assert
//        String welcome_text = driver.findElement(By.cssSelector("[class='mb-3 mt-3']")).getText();
//        Assert.assertEquals(welcome_text, "Welcome back, Sam! \uD83D\uDC4B");
//        driver.quit();
//    }
//
//
//    public static void main(String[] args) {
//        Sample sample = new Sample();
//        sample.adminLogin();
//        sample.managerLogin();
//        sample.teacherLogin();
//        sample.studentLogin();
//
//    }
//
//}

