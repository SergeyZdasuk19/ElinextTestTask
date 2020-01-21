package by.Elinext.pages;

import by.Elinext.asserts.AssertPage;

public class DryPage extends BasePage {

    public DryPage load() {
        new AssertPage().assertUrl("http://qa.yotec.net/our-products/truck-bodies/dry");
        return this;
    }
}
