package by.Elinext.pages;

import by.Elinext.asserts.AssertPage;

public class SuppliersPage extends BasePage {

    public SuppliersPage load() {
        new AssertPage().assertUrl("http://qa.yotec.net/we-are-wabash/teamwork/suppliers");
        return this;
    }
}
