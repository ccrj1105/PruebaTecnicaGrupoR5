package com.pruebatecnicagrupor5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Actions {

    RemoteWebDriver driver;

    protected Actions(RemoteWebDriver driver) {
        this.driver = driver;
    }

    protected void write(By by, String text) {
        searchElement(by).sendKeys(text);
    }

    protected void click(By by) {
        searchElement(by).click();
    }

    protected WebElement searchElement(By by) {
        return driver.findElement(by);
    }

    protected void clearElement(By by) {
        searchElement(by).clear();
    }

    protected RemoteWebDriver driver() {
        return this.driver;
    }

    protected void waitForElement(By element, long timeOutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver(), timeOutInSeconds);
        wait.until(ExpectedConditions.or(ExpectedConditions.elementToBeClickable(element),
                ExpectedConditions.presenceOfElementLocated(element), ExpectedConditions.elementToBeSelected(element)));
    }

    protected void clickEnterElement(By by) {
        searchElement(by).sendKeys(org.openqa.selenium.Keys.ENTER);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
