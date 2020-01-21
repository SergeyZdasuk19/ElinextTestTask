package by.Elinext.pages;

import by.Elinext.asserts.AssertPage;

public class HeritagePage extends BasePage {

    public HeritagePage load() {
        new AssertPage().assertUrl("http://qa.yotec.net/we-are-wabash/our-heritage");
        return this;
    }
}
