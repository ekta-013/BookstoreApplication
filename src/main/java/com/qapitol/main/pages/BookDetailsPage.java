package com.qapitol.main.pages;

import com.qapitol.main.base.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class BookDetailsPage extends Baseclass {
    public BookDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void firstBook() throws InterruptedException {
        String text = "Description : Modern Indian Literature: Poems and Short Stories";
        String description = driver.findElement(By.xpath("/html/body/div/main/div/div[1]/div[2]/div/div[4]")).getText();
        if(text.equalsIgnoreCase(description))
            System.out.println("The expected heading is same as actual heading --- "+description);
        else
            System.out.println("The expected heading doesn't match the actual heading --- "+description);
        WebElement button = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[1]/div[3]/div/div/div[4]/button"));
        button.click();
        Thread.sleep(1000);
    }
    public void lastBook() throws InterruptedException {
        String text = "Description : The Business Book: Big Ideas Simply Explained";
        String description = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[1]/div[2]/div/div[4]")).getText();
        if(text.equalsIgnoreCase(description))
            System.out.println("The expected heading is same as actual heading --- "+description);
        else
            System.out.println("The expected heading doesn't match the actual heading --- "+description);
        WebElement button = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[1]/div[3]/div/div/div[4]/button"));
        button.click();
        Thread.sleep(1000);
    }
    public void bookFrom2ndPage() throws InterruptedException {
        String text = "Description : The Theory of Everything";
        String description = driver.findElement(By.xpath("/html/body/div/main/div/div[1]/div[2]/div/div[4]")).getText();
        if(text.equalsIgnoreCase(description))
            System.out.println("The expected heading is same as actual heading --- "+description);
        else
            System.out.println("The expected heading doesn't match the actual heading --- "+description);
        WebElement button = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[1]/div[3]/div/div/div[4]/button"));
        button.click();
        Thread.sleep(1000);
    }
    public void bookFrom3rdPage() throws InterruptedException {
        String text = "Description : 52 Small Changes for the Mind: Improve Memory";
        String description = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[1]/div[2]/div/div[4]")).getText();
        if (text.equalsIgnoreCase(description))
            System.out.println("The expected heading is same as actual heading --- " + description);
        else
            System.out.println("The expected heading doesn't match the actual heading --- " + description);
        WebElement button = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[1]/div[3]/div/div/div[4]/button"));
        button.click();
        Thread.sleep(1000);
    }
    public void bookFrom4thPage() throws InterruptedException {
        String text = "Description : The Belated Bachelor Party";
        String description = driver.findElement(By.xpath("/html/body/div/main/div/div[1]/div[2]/div/div[4]")).getText();
        if (text.equalsIgnoreCase(description))
            System.out.println("The expected heading is same as actual heading --- " + description);
        else
            System.out.println("The expected heading doesn't match the actual heading --- " + description);
        WebElement button = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[1]/div[3]/div/div/div[4]/button"));
        button.click();
        Thread.sleep(1000);
    }
}
