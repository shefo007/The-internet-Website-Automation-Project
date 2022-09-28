package abTesting;

import Base.BaseTests;
import org.testng.annotations.Test;
import pages.abTestingPage;

import static org.testng.Assert.assertEquals;

public class abTestingPageTest extends BaseTests {

    @Test
    public void verifyPageName(){
        abTestingPage ab = homePage.clickABTesting();
        String headerText = ab.getHeaderText();
        assertEquals(headerText, "A/B Test Variation 1");
    }
}
