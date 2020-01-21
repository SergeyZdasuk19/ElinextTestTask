package by.Elinext.pages;

import by.Elinext.asserts.AssertPage;

public class EnvironmentalPage extends BasePage {

    public EnvironmentalPage load() {
        new AssertPage().assertUrl("http://qa.yotec.net/we-are-wabash/corporate-responsibility" +
                        "/environmental-health-safety-policy");
        return this;
    }
}
