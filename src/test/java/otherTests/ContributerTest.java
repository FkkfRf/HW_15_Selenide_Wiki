package otherTests;

import org.junit.jupiter.api.Test;
import base.BaseTest;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class ContributerTest extends BaseTest {
    @Test
    void searchContributer() {
        open("/selenide/selenide");
        $(".Layout-sidebar").$(byText("Contributors"))
                .ancestor(".BorderGrid-cell").$$("ul li")
                .first().hover();
        $$(".Popover-message").findBy(visible).shouldHave(text("Alexei Vinogradov"));

    }
}