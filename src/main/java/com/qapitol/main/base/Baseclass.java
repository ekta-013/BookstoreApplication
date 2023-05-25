package com.qapitol.main.base;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;
import org.testng.annotations.*;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import static java.lang.System.currentTimeMillis;

public class Baseclass {
    public static Logger log;
    public static WebDriver driver;

    @Parameters("Browser")
    public void setUp() throws IOException {
        log = Logger.getLogger(Baseclass.class.getName());
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("autofill.profile_enabled", false);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.setExperimentalOption("prefs", prefs);
        driver = new ChromeDriver(options);
        driver.get("http://139.59.27.246:3000/");
        driver.manage().window().maximize();
        log.info("Chrome browser launched");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }
    public void closeBrowser(){
        driver.quit();
        log.info("Browser quit");
        Reporter.log("Browser session ended!!", true);
    }
    public static void takeScreenshot() throws IOException {
        TakesScreenshot scr = ((TakesScreenshot)driver);
        File ScrFile = scr.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File("C:\\Users\\ekta.mohite\\IdeaProjects\\BookStoreApplication\\src\\Screenshot\\screenshot"+currentTimeMillis()+".png");
        FileHandler.copy(ScrFile,destinationFile);
    }
}

