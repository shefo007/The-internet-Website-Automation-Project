package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {

    private final WebDriver driver;
    private final By inputField = By.id("file-upload");
    private final By uploadButton = By.id("file-submit");
    private final By uploadedFileField = By.id("uploaded-files");
    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void upLoadFile(String absolutePathOfFile) {
        driver.findElement(inputField).sendKeys(absolutePathOfFile);
    }

    public void clickUpload() {
        driver.findElement(uploadButton).click();
    }

    public String UploadedFile() {
        return driver.findElement(uploadedFileField).getText();
    }



}
