package com.qapitol.main.pages;

import com.qapitol.main.base.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class AddressPage extends Baseclass {
    String propertyFilePath = "C:\\Users\\ekta.mohite\\IdeaProjects\\BookStoreApplication\\config.properties";
    public Properties properties;

    public AddressPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addNewAddress() throws FileNotFoundException {
        FileReader reader = new FileReader(propertyFilePath);
        properties = new Properties();
        try {
            properties.load(reader);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e + "data.properties file not found");
        }
            WebElement line1 = driver.findElement(By.id("addressLine1"));
            line1.sendKeys("flat no:- 1, govind harmony building");
            WebElement line2 = driver.findElement(By.id("addressLine2"));
            line2.sendKeys("near sai temple");
            WebElement city = driver.findElement(By.id("city"));
            city.sendKeys("city");
            WebElement state = driver.findElement(By.id("state"));
            state.sendKeys("Maharashtra");
            WebElement country = driver.findElement(By.id("country"));
            Select dropdown = new Select(country);
            dropdown.selectByValue("IN");
            WebElement code = driver.findElement(By.id("postalCode"));
            code.sendKeys("321098");
            WebElement num = driver.findElement(By.id("phone"));
            num.sendKeys("7658342233");
            WebElement button = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[3]/div[2]/form/div[2]/button"));
            button.click();
            WebElement button1 = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[3]/div[1]/div[1]/div/div/div[1]/div/input"));
            button1.click();
            WebElement button2 = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[4]/button"));
            button2.click();
        }
    public void selectAddress() throws InterruptedException {
    WebElement button1 = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[3]/div[1]/div[1]/div/div/div[1]/div/input"));
    button1.click();
    WebElement button2 = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[4]/button"));
    button2.click();
    Thread.sleep(1000);
    }

}
