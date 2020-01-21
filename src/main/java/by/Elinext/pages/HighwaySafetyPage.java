package by.Elinext.pages;

import by.Elinext.asserts.AssertPage;

public class HighwaySafetyPage extends BasePage {

    public HighwaySafetyPage load() {
        new AssertPage().assertUrl("http://qa.yotec.net/we-are-wabash/" +
                "corporate-responsibility/safety/highway-safety");
        return this;
    }
}
