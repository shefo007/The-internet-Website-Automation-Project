package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.EventReporter;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Collections;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver(getChromeOptions());
        WebDriverListener listener = new EventReporter();
        //With EventFiringDecorator we listen to what going on the browser in more details.
        driver = new EventFiringDecorator(listener).decorate(chrome);
        driver.manage().window().maximize();

    }

    @BeforeMethod
    public void setHomePage(){
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);
        setCookie();
    }

    @AfterMethod
    public void recordFailure(ITestResult result){
        if (ITestResult.FAILURE == result.getStatus()) {
            var camera = ((TakesScreenshot) driver);
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenshot.toPath(), new File("resources/screenshots/" + result.getName() + ".png").toPath());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    public WindowManager getWindowManager() {
        return new WindowManager(driver);
    }

    private ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        //here open the browser without the info bar
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        options.setExperimentalOption("useAutomationExtension", false);
        //setHeadless() method is used to run tests without opening the browser
//        options.setHeadless(true);
        return options;
    }

    private void setCookie() {
        Cookie cookie = new Cookie.Builder("TAU", "123")
                .domain("the-internet.herokuapp.com").build();
        driver.manage().addCookie(cookie);
    }
}
