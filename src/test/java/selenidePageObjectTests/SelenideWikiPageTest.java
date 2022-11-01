package selenidePageObjectTests;

import base.BaseTest;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;

public class SelenideWikiPageTest extends BaseTest {
    SelenideWikiPage selenideWikiPage = new SelenideWikiPage();

    @Test
    void searchSelenideInGitHub() {
        open(baseUrl);
        selenideWikiPage.setSearch("selenide");
        selenideWikiPage.clickSearch();
        selenideWikiPage.shouldHaveText("selenide\n/\nselenide\n");
        selenideWikiPage.clickSelectTab();
        selenideWikiPage.clickMorePageButton();
        selenideWikiPage.shouldHaveTextRBar("SoftAssertions");
        selenideWikiPage.clickTextRBar("SoftAssertions");
        selenideWikiPage.shouldHaveTextJU("Using JUnit5");
    }

}
