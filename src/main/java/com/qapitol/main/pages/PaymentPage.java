package com.qapitol.main.pages;

import com.qapitol.main.base.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class PaymentPage extends Baseclass {
    public PaymentPage(WebDriver driver) {
        this.driver = driver;
    }

    public void AddCard() throws InterruptedException {
        WebElement cardnum = driver.findElement(By.id("cardNumber"));
        cardnum.clear();
        Thread.sleep(1000);
        cardnum.sendKeys("4111 1111 1111 1111");
        WebElement month = driver.findElement(By.id("expirationMonth"));
        month.clear();
        month.sendKeys("10");
        WebElement year = driver.findElement(By.id("expirationYear"));
        year.clear();
        year.sendKeys("2023");
        WebElement cvv = driver.findElement(By.id("cvv"));
        cvv.clear();
        cvv.sendKeys("532");
        Thread.sleep(1000);
        WebElement card = driver.findElement(By.xpath("/html/body/div/main/div/div[3]/div[2]/div[2]/button"));
        card.click();
    }
    public void SelectCard(){
        Actions actions = new Actions(driver);
        WebElement select = driver.findElement(By.name("paymentMethod"));
        actions.moveToElement(select);
        select.click();
        WebElement button = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[4]/button"));
        button.click();
    }
    public void select2ncCard(){
        Actions actions = new Actions(driver);
        WebElement second = driver.findElement(By.id("pm_1N7wBgG9R9y827ntbhBDD5tC"));
        actions.moveToElement(second);
        second.click();
        WebElement button = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[4]/button"));
        button.click();
    }
    public void wrongCardNumber() throws InterruptedException {
        WebElement cardnum = driver.findElement(By.id("cardNumber"));
        cardnum.clear();
        cardnum.sendKeys("4111 1111 1111 11112");
        Thread.sleep(2000);
        WebElement card = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[3]"));
        Thread.sleep(2000);
    }
}
