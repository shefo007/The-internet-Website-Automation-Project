package key;

import Base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class KeysTests extends BaseTests {

    @Test
    public void testBackSpace() {
        var keyPage = homePage.clickKeyPresses();
        keyPage.enterText(Keys.chord(Keys.BACK_SPACE));
        assertTrue(keyPage.getResult().contains("BACK_SPACE"));
    }
}
