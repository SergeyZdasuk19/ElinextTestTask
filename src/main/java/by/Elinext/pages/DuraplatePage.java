package by.Elinext.pages;

import by.Elinext.asserts.AssertPage;

public class DuraplatePage extends BasePage {

    public DuraplatePage load() {
        new AssertPage().assertUrl("http://qa.yotec.net/our-products/trailers/dry-vans/duraplate-dry-vans");
        return this;
    }
}
