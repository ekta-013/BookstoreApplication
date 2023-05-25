package com.qapitol.main.pages;

import com.qapitol.main.base.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Logout extends Baseclass {
    Select dropdown;

    public Logout(WebDriver driver) {
        this.driver = driver;
    }

    public void logoutFromStore() throws InterruptedException {
        WebElement name = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        name.click();
        Thread.sleep(500);
        WebElement button = driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div/div/div/a[2]"));
        button.click();
    }
}
