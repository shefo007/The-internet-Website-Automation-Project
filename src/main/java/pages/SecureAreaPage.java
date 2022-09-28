package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {

    private final WebDriver driver;
    private final By logoutButton = By.cssSelector("#content a");
    private final By statusAlert = By.id("flash");

    public SecureAreaPage(WebDriver driver) {
        this.driver = driver;
    }

    public String statusAlertText() {
        return driver.findElement(statusAlert).getText();
    }

    public LoginPage clickLogout() {
        driver.findElement(logoutButton).click();
        return new LoginPage(driver);
    }

}
