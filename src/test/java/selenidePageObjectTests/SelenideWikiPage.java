package selenidePageObjectTests;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.partialText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SelenideWikiPage {
    public static SelenideElement
    searchField = $("[data-test-selector=nav-search-input]"),
    repoList = (SelenideElement) $$(".repo-list li").first().$("a"),
    containerHeader = $("#repository-container-header"),
    tabWiki = $("#wiki-tab"),
    morePagesOnWiki = $(".wiki-more-pages-link button"),
    rightBarOnWiki = $(".wiki-rightbar"),
    markDownBody = $(".markdown-body");
    public SelenideWikiPage setSearch(String value) {
        searchField.setValue(value).pressEnter();
        return this;
    }
    public SelenideWikiPage clickSearch() {
        repoList.click();
        return this;
    }
    public SelenideWikiPage shouldHaveText(String value) {
        containerHeader.shouldHave(text(value));
        return this;
    }
    public SelenideWikiPage clickSelectTab(){
        tabWiki.click();
        return this;
    }
    public SelenideWikiPage clickMorePageButton(){
        morePagesOnWiki.click();
        return this;
    }
    public SelenideWikiPage shouldHaveTextRBar(String value){
        rightBarOnWiki.shouldHave(text(value));
        return this;
    }
    public SelenideWikiPage clickTextRBar(String value){
        rightBarOnWiki.$(byText(value)).click();
        return this;
    }
    public SelenideWikiPage shouldHaveTextOnPage(String value){
        morePagesOnWiki.shouldHave(partialText(value));
        return this;
    }
    public SelenideWikiPage shouldHaveTextJU(String value){
        markDownBody.shouldHave(partialText(value));
        return this;
    }

}
