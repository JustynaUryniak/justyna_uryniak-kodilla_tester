package com.kodilla.selenium.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/justynauryniak/Dokumenty/Development/Kodilla/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        WebElement inputField = driver.findElement(By.name("q"));
        inputField.sendKeys("Kodilla");
        inputField.submit();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("my_Class")));
    }
}
