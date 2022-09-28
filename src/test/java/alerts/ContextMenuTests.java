package alerts;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {

    @Test
    public void testContextMenu() {
        var contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.rightClickBox();
        String text = contextMenuPage.alert_getText();
        contextMenuPage.alert_ClickToAccept();

        assertEquals(text, "You selected a context menu", "Incorrect result");
    }
}
