package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private void clickLinkElement(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

    public abTestingPage clickABTesting(){
        clickLinkElement("A/B Testing");
        return new abTestingPage(driver);
    }

    public addRemoveElementPage clickAddRemoveElement(){
        clickLinkElement("Add/Remove Elements");
        return new addRemoveElementPage(driver);
    }

    public LoginPage clickFormAuthentication(){
        clickLinkElement("Form Authentication");
        return new LoginPage(driver);
    }

    public DropDownPage clickDropDown() {
        clickLinkElement("Dropdown");
        return new DropDownPage(driver);
    }

    public ForgetPasswordPage clickForgetPassword() {
        clickLinkElement("Forgot Password");
        return new ForgetPasswordPage(driver);
    }

    public HoversPage clickHovers() {
        clickLinkElement("Hovers");
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPresses() {
        clickLinkElement("Key Presses");
        return new KeyPressesPage(driver);
    }

    public HorizontalSliderPage clickHorizontalSlider() {
        clickLinkElement("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }

    public AlertsPage clickJavaScriptAlerts() {
        clickLinkElement("JavaScript Alerts");
        return new AlertsPage(driver);
    }

    public FileUploadPage clickFileUpload() {
        clickLinkElement("File Upload");
        return new FileUploadPage(driver);
    }

    public EntryAdPage clickEntryAd() {
        clickLinkElement("Entry Ad");
        return new EntryAdPage(driver);
    }

    public ContextMenuPage clickContextMenu() {
        clickLinkElement("Context Menu");
        return new ContextMenuPage(driver);
    }

    public WYSIWYGEditorPage clickWYSIWYGEditor() {
        clickLinkElement("WYSIWYG Editor");
        return new WYSIWYGEditorPage(driver);
    }

    public FramesPage clickFrames() {
        clickLinkElement("Frames");
        return new FramesPage(driver);
    }

    public DynamicLoadingPage clickDynamicLoading() {
        clickLinkElement("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }

    public LargeAndDeepDOMPage clickLargeAndDeepDOM() {
        clickLinkElement("Large & Deep DOM");
        return new LargeAndDeepDOMPage(driver);
    }

    public InfiniteScrollPage clickInfiniteScroll() {
        clickLinkElement("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }

    public MultipleWindowsPage clickMultipleWindows() {
        clickLinkElement("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }


}
