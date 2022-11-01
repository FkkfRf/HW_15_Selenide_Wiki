package selenideTest;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.partialText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideWikiTest extends BaseTest {
    @Test
    void searchSelenideInGitHub(){
        open(baseUrl);
        $("[data-test-selector=nav-search-input]").setValue("selenide").pressEnter();
        $$(".repo-list li").first().$("a").click();
        $("#repository-container-header").shouldHave(text("selenide\n/\nselenide\n"));
        $("#wiki-tab").click();
        $(".wiki-more-pages-link button").click();
        $(".wiki-rightbar").shouldHave(text("SoftAssertions"));
        $(".wiki-rightbar").$(byText("SoftAssertions")).click();
        $(".markdown-body").shouldHave(partialText("Using JUnit5"));
    }

}

