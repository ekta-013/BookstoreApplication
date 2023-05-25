package com.qapitol.main.pages;

import com.qapitol.main.base.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

public class OrderPage extends Baseclass {
    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void VerifyPlacedOrder() throws InterruptedException {
        WebElement receipt = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[1]/div/div[2]/p[2]/a"));
        Actions actions = new Actions(driver);
        actions.moveToElement(receipt);
        receipt.click();

        Set<String> window = driver.getWindowHandles();
        Iterator<String> itr = window.iterator();
        String p = itr.next();
        String c = itr.next();
        driver.switchTo().window(c);

        Thread.sleep(1000);
        WebElement verify = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td/table[2]/tbody/tr[1]/td"));
        System.out.println(verify.getText());
        Assert.assertEquals(verify.getText(),"Receipt from BookStore");
        Thread.sleep(1000);
        driver.close();
        driver.switchTo().window(p);
    }
}
