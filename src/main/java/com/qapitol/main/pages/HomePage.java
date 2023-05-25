package com.qapitol.main.pages;

import com.qapitol.main.base.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends Baseclass {
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectFirstBook() {
    WebElement book1 = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[1]/div[1]/div/a/img"));
    book1.click();
    }
    public void selectBookfromBottomRow() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement book2 = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[1]/div[8]/div/a/img"));
        actions.moveToElement(book2).click().perform();
        Thread.sleep(1000);
    }
    public void selectbookFrom2ndPage() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement page2 = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[2]/ul/li[3]/a"));
        actions.moveToElement(page2).click().perform();
        Thread.sleep(4000);
        WebElement book3 = driver.findElement(By.xpath("/html/body/div/main/div/div[1]/div[3]/div/a/img"));
        book3.click();
        Thread.sleep(1000);
    }
    public void selectBookFrom3rdPage() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement page3 = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[2]/ul/li[4]/a"));
        actions.moveToElement(page3).click().perform();
        Thread.sleep(1000);
        WebElement book4 = driver.findElement(By.xpath("/html/body/div/main/div/div[1]/div[1]/div/a/img"));
        book4.click();
    }
    public void selectbookfrom4thpage(){
        Actions actions = new Actions(driver);
        WebElement page4 = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[2]/ul/li[5]/a"));
        actions.moveToElement(page4).click().perform();
        WebElement book4 = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[1]/div/div/a/img"));
        book4.click();
    }
}
