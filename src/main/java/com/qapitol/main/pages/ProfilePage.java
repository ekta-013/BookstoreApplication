package com.qapitol.main.pages;

import com.qapitol.main.base.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ProfilePage extends Baseclass {
    public ProfilePage(WebDriver driver) {
        this.driver = driver;
    }

    public void RecentorderDetail() throws InterruptedException {
        WebElement name = driver.findElement(By.id("username"));
        name.click();
        WebElement profile = driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div/div/div/a[1]"));
        profile.click();
        WebElement recentOdrDetail = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[2]/div/table/tbody/tr[1]"));
        System.out.println(recentOdrDetail.getText());
    }
    public void update(){
        WebElement name = driver.findElement(By.id("username"));
        name.click();
        WebElement profile = driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div/div/div/a[1]"));
        profile.click();
        WebElement lastname = driver.findElement(By.id("lastName"));
        lastname.clear();
        lastname.sendKeys("Mohite");
        WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        password.sendKeys("Forgot@1");
        WebElement pass = driver.findElement(By.xpath("//*[@id=\"confirmPassword\"]"));
        pass.sendKeys("Forgot@1");
        Actions act = new Actions(driver);
        WebElement button = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[1]/form/button"));
        act.moveToElement(button).click().build().perform();
    }
}
