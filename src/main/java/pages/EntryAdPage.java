package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EntryAdPage {

    private final WebDriver driver;
    private final By modalTitle = By.xpath("//*[@class=\"modal-title\"]/h3");
    private final By closeButton = By.xpath("//*[@class=\"modal-footer\"]/p");
    public EntryAdPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getModalTitle() {

        return driver.findElement(modalTitle).getText();
    }

    public void clickClose() {
        driver.findElement(closeButton).click();
    }



}
