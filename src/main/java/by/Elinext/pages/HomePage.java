package by.Elinext.pages;

import by.Elinext.asserts.AssertPage;

public class HomePage extends AbstractPage {

    @Override
    public HomePage load() {
        new AssertPage()
                .assertLoad("Home")
                .assertUrl("http://qa.yotec.net/");
        return this;
    }


}
