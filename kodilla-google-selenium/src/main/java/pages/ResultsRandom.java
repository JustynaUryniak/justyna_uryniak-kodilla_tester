package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultsRandom extends AbstractPage{

    @FindBy(css = "div[class='g']")
        WebElement result;


    public ResultsRandom(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
}
