package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/justynauryniak/Dokumenty/Development/Kodilla/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl");
        driver.switchTo().frame(0);
        driver.navigate().to("http://www.allegro.pl");
        driver.findElement(By.xpath("//*[contains(@class, \"_15pc6 \")]/div[2]/button[1]")).click();

        WebElement filter = driver.findElement(By.xpath("//*[contains(@class, \"mp4t_8 mp4t_0\")]/div[1]/div/form/input"));
        filter.sendKeys("Mavic mini");
        filter = driver.findElement(By.xpath("//*[contains(@class, \"mp4t_8 mp4t_0\")]/div[1]/div/form/div[3]/div/select"));
        Select categorySelect = new Select(filter);
        categorySelect = new Select(filter);
        categorySelect.selectByIndex(1);
        categorySelect.selectByIndex(3);
        filter.submit();
    }
}
