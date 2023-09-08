import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestSelenideN2 {
    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://github.com";
        Configuration.holdBrowserOpen = true;
    }
    @Test
    void enterpriseHoveTest() {
        open("/");
        $(byText("Solutions")).hover().parent().$("div.HeaderMenu-dropdown").$(byText("Enterprise")).click();
        $("div.enterprise-hero").$("h1").shouldHave(text("Build like the best"));
    }
}
