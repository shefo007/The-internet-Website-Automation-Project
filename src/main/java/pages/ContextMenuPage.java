package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

    private final WebDriver driver;
    private final By box = By.id("hot-spot");


    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void rightClickBox() {
        WebElement boxWebElement = driver.findElement(box);
        Actions actions = new Actions(driver);

        actions.contextClick(boxWebElement).perform();
    }

    public String alert_getText() {
        return driver.switchTo().alert().getText();
    }

    public void alert_ClickToAccept() {
        driver.switchTo().alert().accept();
    }
}
