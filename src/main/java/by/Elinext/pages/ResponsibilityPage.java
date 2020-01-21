package by.Elinext.pages;

import by.Elinext.asserts.AssertPage;

public class ResponsibilityPage extends BasePage {

    public ResponsibilityPage load() {
        new AssertPage().assertUrl("http://qa.yotec.net/tradition-of-innovation/responsibility-to-our-customers");
        return this;
    }
}
