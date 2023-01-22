package steps;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import tests.BaseTest;

public class BaseSteps extends BaseTest {

    @Before
    public void setup() throws Exception {
        init("CHROME",30);
    }

    @After
    public void tearDown(){
        quit();
    }

    @Given("I navigate to google.com")
    public void iNavigateToGoogleCom() {
        driver.get("https://www.google.com/");
    }

}
