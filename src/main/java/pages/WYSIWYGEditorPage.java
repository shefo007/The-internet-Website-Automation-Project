package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WYSIWYGEditorPage {

    private final WebDriver driver;
    private final String editorIframeId = "mce_0_ifr";
    private final By textArea = By.id("tinymce");
    private final By indentationButton = By.xpath("//*[@title=\"Increase indent\"]");

    public WYSIWYGEditorPage(WebDriver driver) {
        this.driver = driver;
    }

    private void switchToEditArea() {
        driver.switchTo().frame(editorIframeId);
    }

    private void switchToMainArea() {
        driver.switchTo().parentFrame();
    }

    public void clear() {
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }

    public void setText(String text) {
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }

    public void clickRightIndentation(){
        driver.findElement(indentationButton).click();
    }

    public String getText() {
        switchToEditArea();
        String text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }
}
