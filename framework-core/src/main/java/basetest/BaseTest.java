package basetest;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.After;
import org.junit.Before;

public class BaseTest {

    @Before
    public void setUp() throws Exception {
        Configuration.browser = "chrome";
    }

    @After
    public void tearDown() throws Exception {
        Selenide.closeWebDriver();
    }

}
