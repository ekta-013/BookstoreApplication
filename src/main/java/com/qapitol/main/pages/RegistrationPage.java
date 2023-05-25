package com.qapitol.main.pages;

import com.qapitol.main.base.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class RegistrationPage extends Baseclass {
    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void registerIntoBookstore() throws InterruptedException {
        WebElement signinButton = driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div/a[2]"));
        signinButton.click();
        Thread.sleep(500);
        WebElement registerButton = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div/div/div/div/div/a"));
        registerButton.click();
        Thread.sleep(500);
        WebElement username = driver.findElement(By.id("userName"));
        username.sendKeys("EKTAM123");
        WebElement firstname = driver.findElement(By.id("firstName"));
        firstname.sendKeys("Ekta");
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("ekta1234@gmail.com");
        WebElement pass = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        pass.sendKeys("Forgot@1");
        WebElement pass1 = driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div/form/div[5]/input"));
        pass1.sendKeys("Forgot@1");
        WebElement button = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div/div/div/form/button"));
        button.click();
        Thread.sleep(2000);
    }
}
