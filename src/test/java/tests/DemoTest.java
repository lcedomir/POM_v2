package tests;

import org.testng.annotations.*;

public class DemoTest extends BaseTest{
    @BeforeMethod
    public void setup() throws Exception {
        init("CHROME",30);
    }

    @AfterMethod
    public void tearDown(){
        quit();
    }

    @Test
    public void detailedSearch() {
            //TestNG test
    }

}
