package pages;

import helpers.CommonActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class DemoPage extends CommonActions {

    WebDriver driver;

    public DemoPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
