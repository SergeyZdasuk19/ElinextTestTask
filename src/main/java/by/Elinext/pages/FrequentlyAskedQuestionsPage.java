package by.Elinext.pages;

import by.Elinext.asserts.AssertPage;

public class FrequentlyAskedQuestionsPage extends BasePage {

    public FrequentlyAskedQuestionsPage load() {
        new AssertPage().assertUrl("http://qa.yotec.net/we-are-wabash/support/frequently-asked-questions");
        return this;
    }
}
