package by.Elinext.pages;

import by.Elinext.asserts.AssertPage;

public class FuelEconomyPage extends BasePage {

    public FuelEconomyPage load() {
        new AssertPage().assertUrl("http://qa.yotec.net/we-are-wabash/corporate-responsibility" +
                "/sustainability/fuel-economy");
        return this;
    }
}
