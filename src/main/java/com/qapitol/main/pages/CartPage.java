package com.qapitol.main.pages;

import com.qapitol.main.base.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends Baseclass {
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void book() throws InterruptedException {
        String description = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[2]/div[2]/div/div/div[2]/h3")).getText();
        System.out.println(description);
        WebElement button = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[2]/div[2]/div/div/div[3]/button"));
        button.click();
        Thread.sleep(1000);
    }
    public void bookdelete() throws InterruptedException {
        WebElement deletebutton = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[2]/div[1]/div[1]/div/div/div[6]/button/i"));
        deletebutton.click();
        Thread.sleep(1000);
        WebElement Addbook = driver.findElement(By.xpath("//*[@id=\"root\"]/header/nav/div/a"));
        Addbook.click();
    }
}
