package by.Elinext.pages;

import by.Elinext.asserts.AssertPage;

public class EnvironmentalPage extends AbstractPage {

    @Override
    public EnvironmentalPage load() {
        new AssertPage()
                .assertLoad("Environmental, Health & Safety Policy")
                .assertUrl("http://qa.yotec.net/we-are-wabash/corporate-responsibility" +
                        "/environmental-health-safety-policy");
        return this;
    }
}
