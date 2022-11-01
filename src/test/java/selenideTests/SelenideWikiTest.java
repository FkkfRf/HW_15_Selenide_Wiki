package selenideTests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;

public class SelenideWikiTest extends BaseTest{

    @Test
    void searchSelenideInGitHub(){
        open(baseUrl);
        $("[data-test-selector=nav-search-input]").setValue("selenide").pressEnter();
        $$(".repo-list li").first().$("a").click();
    }

}
