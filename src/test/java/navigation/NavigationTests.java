package navigation;

import Base.BaseTests;
import org.testng.annotations.Test;

public class NavigationTests extends BaseTests {

    @Test
    public void testNavigator() {
        homePage.clickDynamicLoading().clickExample1();
        getWindowManager().goBack();
        getWindowManager().goForward();
        getWindowManager().refreshPage();
        getWindowManager().goTo("https://google.com");
    }

    @Test
    public void testSwitchTap() {
        homePage.clickMultipleWindows().clickHereLink();
        getWindowManager().switchToTap("New Window");
    }
}
