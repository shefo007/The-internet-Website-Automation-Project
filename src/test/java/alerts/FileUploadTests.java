package alerts;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    private final String pathOfFile = "C:\\Users\\Sheri\\Desktop\\Selenium grid.txt";
    @Test
    public void testFileUpload() {
        var fileUploadPage = homePage.clickFileUpload();
        fileUploadPage.upLoadFile(pathOfFile);
        fileUploadPage.clickUpload();

        assertEquals(fileUploadPage.UploadedFile(), "Selenium grid.txt");
    }
}
