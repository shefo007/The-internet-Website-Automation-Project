package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class abTestingPage {

    private WebDriver driver;
    private By headerText = By.tagName("h3");

    public abTestingPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHeaderText(){
        return driver.findElement(headerText).getText();
    }
}
