package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class addRemoveElementPage {

    private WebDriver driver;
    private By  addElement = By.xpath("//*[@id=\"content\"]/div/button");
    private By deleteElement = By.xpath("//*[@id=\"elements\"]/button");

    public addRemoveElementPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAddElement(){
        driver.findElement(addElement).click();
    }

    public void clickDelete(){
        driver.findElement(deleteElement).click();
    }







}
