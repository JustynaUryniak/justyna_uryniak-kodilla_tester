package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.List;


public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/justynauryniak/Dokumenty/Development/Kodilla/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl");
        driver.switchTo().frame(0);
        driver.navigate().to("http://www.allegro.pl");
        driver.findElement(By.xpath("//*[contains(@class, \"_15pc6 \")]/div[2]/button[1]")).click();

         WebElement filter = driver.findElement(By.cssSelector("div > div > div > form > input"));
         filter.sendKeys("Mavic mini");
         filter = driver.findElement(By.tagName("select"));
         Select categorySelect = new Select(filter);
         categorySelect = new Select(filter);
         categorySelect.selectByIndex(1);
         categorySelect.selectByIndex(3);
         filter.submit();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("section > article")));

        List<WebElement> cards = driver.findElements(By.cssSelector("div[class*= opbox-listing] > div > section > article"));
        System.out.println(cards.size());
        System.out.println(cards.get(6).getText());









    }
}
