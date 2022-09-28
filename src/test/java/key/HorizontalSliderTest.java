package key;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HorizontalSliderTest extends BaseTests {

    @Test
    public void testSlider() {
        var slider = homePage.clickHorizontalSlider();
        slider.setSliderValue("4");
        assertEquals(slider.getSliderValue(), "4", "Incorrect result");
    }
}
