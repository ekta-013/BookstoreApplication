package com.qapitol.main.pages;

import com.qapitol.main.base.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShippingPage extends Baseclass {
    public ShippingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void placeOrder() throws InterruptedException {
        WebElement button = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[2]/div[2]/div/div/div[6]/button"));
        button.click();
        Thread.sleep(1000);
    }
}
