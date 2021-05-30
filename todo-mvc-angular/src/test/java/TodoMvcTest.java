import basetest.BaseTest;
import com.codeborne.selenide.Selenide;
import org.junit.Test;

public class TodoMvcTest extends BaseTest {

    @Test
    public void todoTest() {
        Selenide.open("https://todomvc.com/examples/angularjs/#/");
    }
}
