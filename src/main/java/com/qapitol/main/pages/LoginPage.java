package com.qapitol.main.pages;

import com.qapitol.main.base.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends Baseclass {
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void LoginToBookstore(String uname, String pass) throws InterruptedException {
        WebElement signinButton = driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div/a[2]"));
        signinButton.click();
        Thread.sleep(500);
        WebElement username = driver.findElement(By.id("userNameOrEmail"));
        username.sendKeys(uname);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys(pass);
        Thread.sleep(500);
        WebElement button = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div/div/div/form/button"));
        button.click();
    }

}
