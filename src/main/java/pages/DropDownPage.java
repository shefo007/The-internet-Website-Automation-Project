package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDownPage {

    private final WebDriver driver;
    private final By dropdownList = By.id("dropdown");

    public DropDownPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectFromDropdown(String option) {
        findDropdownList().selectByVisibleText(option);
    }

    public List<String> getSelectedOptions() {
        List<WebElement> selectedElements =
                findDropdownList().getAllSelectedOptions();
        return selectedElements.stream().map(WebElement::getText).collect(Collectors.toList());
    }

    private Select findDropdownList() {

        return new Select(driver.findElement(dropdownList));
    }





}
