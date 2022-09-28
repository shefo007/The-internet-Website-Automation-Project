package wait;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTests {

    @Test
    public void testWaitUntilHidden() {
        var loadingPage = homePage.clickDynamicLoading().clickExample1();
        loadingPage.clickStart();
        assertEquals(loadingPage.getLoadedText(), "Hello World!", "Incorrect Loaded Text");
    }


    @Test
    public void testWaitUntilVisible() {
        var loadingPage2 = homePage.clickDynamicLoading().clickExample2();

        loadingPage2.clickStart();

        assertEquals(loadingPage2.getLoadedText(), "Hello World!", "Incorrect Loaded Text");
    }
}
