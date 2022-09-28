package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgetPasswordPage {

    private final WebDriver driver;
    private final By emailField = By.id("email");
    private final By retrievePasswordButton = By.id("form_submit");
    private final By retrieveText = By.tagName("h1");

    public ForgetPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void clickRetrievePasswordButton() {
        driver.findElement(retrievePasswordButton).click();
    }

    public String getRetrieveText() {
        return driver.findElement(retrieveText).getText();
    }


}
