package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {

    private final WebDriver driver;
    private final By topFrame = By.xpath("//*[@name=\"frame-top\"]");
    private final By bottomFrame = By.xpath("//*[@name=\"frame-bottom\"]");
    private final By leftFrame = By.xpath("//*[@name=\"frame-left\"]");
    private final By body = By.tagName("body");
    public NestedFramesPage(WebDriver driver) {
        this.driver = driver;
    }

    private void switchToTopFrame() {
        driver.switchTo().frame(driver.findElement(topFrame));
    }

    private void switchToBottomFrame() {
        driver.switchTo().frame(driver.findElement(bottomFrame));
    }

    private void switchToLeftFrame(){
        driver.switchTo().frame(driver.findElement(leftFrame));
    }

    private void switchToMainFrame() {
        driver.switchTo().parentFrame();
    }

    public String get_TextLeftFrame(){
        switchToTopFrame();
        switchToLeftFrame();

        String text = driver.findElement(body).getText();

        switchToMainFrame();
        switchToMainFrame();

        return text;
    }

    public String get_TextBottomFrame() {
        switchToBottomFrame();

        String text = driver.findElement(body).getText();

        switchToMainFrame();

        return text;
    }



}
