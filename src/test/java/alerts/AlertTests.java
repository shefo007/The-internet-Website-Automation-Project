package alerts;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {

    @Test
    public void testAcceptAlert() {
        var alertPage = homePage.clickJavaScriptAlerts();
        alertPage.clickJSAlert();
        alertPage.alert_clickToAccept();
        assertEquals(alertPage.getResult(), "You successfully clicked an alert");
    }

    @Test
    public void testAlert_getText(){
        var alertPage = homePage.clickJavaScriptAlerts();
        alertPage.clickJSConfirm();
        String alertText = alertPage.alert_getText();
        alertPage.alert_clickToCancel();

        assertEquals(alertText, "I am a JS Confirm", "Alert text incorrect");
    }

    @Test
    public void testSetInputInAlert() {
        var alertPage = homePage.clickJavaScriptAlerts();
        alertPage.clickJSPrompt();

        String input = "John Smith";

        alertPage.alert_setInput(input);
        alertPage.alert_clickToAccept();

        assertEquals(alertPage.getResult(),"You entered: " + input, "Result text incorrect");
    }
}
