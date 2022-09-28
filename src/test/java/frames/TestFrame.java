package frames;

import Base.BaseTests;
import org.testng.annotations.Test;

import javax.swing.*;

import static org.testng.Assert.assertEquals;

public class TestFrame extends BaseTests {

    @Test
    public void test_iFrame() {
        var framePage= homePage.clickWYSIWYGEditor();

        framePage.clear();
        framePage.clear();
        framePage.setText("Sherif ");
        framePage.clickRightIndentation();
        framePage.setText("Tawap");
        assertEquals(framePage.getText(), "Sherif Tawap");
    }

    @Test
    public void testNestedFrames() {
        var framesPage = homePage.clickFrames();
        var nestedFramesPage = framesPage.clickNestedFrames();

        String leftFrameText = nestedFramesPage.get_TextLeftFrame();
        String bottomFrameText = nestedFramesPage.get_TextBottomFrame();

        assertEquals(leftFrameText, "LEFT");
        assertEquals(bottomFrameText, "BOTTOM");
    }
}
