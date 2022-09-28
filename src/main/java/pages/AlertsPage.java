package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {

    private final WebDriver driver;
    private final By triggerAlertButton = By.xpath("//*[@onclick='jsAlert()']");
    private final By triggerConfirmButton = By.xpath("//*[@onclick='jsConfirm()']");
    private final By triggerPromptButton = By.xpath("//*[@onclick='jsPrompt()']");
    private final By result = By.id("result");

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }


    //To Choose which alert button you want to click in the page.
    public void clickJSAlert() {
        driver.findElement(triggerAlertButton).click();
    }
    public void clickJSConfirm() {
        driver.findElement(triggerConfirmButton).click();
    }

    public void clickJSPrompt() {
        driver.findElement(triggerPromptButton).click();
    }


    //For accepting or canceling alert.
    public void alert_clickToAccept() {
        driver.switchTo().alert().accept();
    }

    public void alert_clickToCancel() {
        driver.switchTo().alert().dismiss();
    }


    //For get any text result to confirm what happened
    public String getResult() {
        return driver.findElement(result).getText();
    }


    //To get the text within the alert itself.
    public String alert_getText() {
        return driver.switchTo().alert().getText();
    }


    //To enter input in the input field of the alert
    public void alert_setInput(String input) {
        driver.switchTo().alert().sendKeys(input);
    }
}
