import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.GoogleSearch;

public class TestGoogle {

    WebDriver driver;

    @Before
    public void testSetup() {
        System.setProperty("webdriver.chrome.driver", "/Users/justynauryniak/IdeaProjects/kodilla-course/kodilla-google-selenium/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://www.google.com");
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"L2AGLb\"]"))).click();
        driver.navigate().to("http://www.google.com");
    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void testGooglePage() {
        GoogleSearch googleSearch = new GoogleSearch(driver);
        googleSearch.searchResults();

    }

    @Test
    public void testGoogleRandomResult() {
        GoogleSearch googleSearch = new GoogleSearch(driver);
        googleSearch.searchResults();
        googleSearch.resultOfTheDraw();

    }
}
