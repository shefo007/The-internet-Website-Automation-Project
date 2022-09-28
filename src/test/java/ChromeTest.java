import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

class ChromeTest {

    WebDriver driver;

    @BeforeClass
    public void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void setupTest() {
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }

    @Test
    public void test() {
        // Exercise
        driver.get("https://www.google.com/");
        String title = driver.getTitle();

        // Verify
        assertEquals(title,"Google");
    }

    public static void main(String[] args) {
        String name = "Sherif";
        String fullName = name + "Tawap";
        System.out.println(fullName);
    }


}