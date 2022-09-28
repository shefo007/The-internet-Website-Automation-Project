package alerts;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class EntryAdTests extends BaseTests {

    @Test
    public void testModalTitle() {
        var entryAdPage = homePage.clickEntryAd();
        String text = entryAdPage.getModalTitle();
        entryAdPage.clickClose();

        assertEquals(text, "This is a modal window");

    }
}
