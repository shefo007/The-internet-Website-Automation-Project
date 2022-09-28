package utils;

import org.openqa.selenium.WebDriver;

public class WindowManager {

    private final WebDriver driver;
    private final WebDriver.Navigation navigation;

    public WindowManager(WebDriver driver) {
        this.driver = driver;
        navigation = driver.navigate();
    }

    public void goBack() {
        navigation.back();
    }

    public void goForward() {
        navigation.forward();
    }

    public void refreshPage() {
        navigation.refresh();
    }

    public void goTo(String url){
        navigation.to(url);
    }

    public void switchToTap(String tapTitle) {
        var windows = driver.getWindowHandles();

        System.out.println("Number of taps: " + windows.size());

        System.out.println("Window handles:");
        windows.forEach(System.out::println);

        for (String window : windows) {

            System.out.println("Switching to window: " + window);

            driver.switchTo().window(window);

            System.out.println("Current window title: " + driver.getTitle());

            if (tapTitle.equals(driver.getTitle())){
                break;
            }
        }
    }
}
