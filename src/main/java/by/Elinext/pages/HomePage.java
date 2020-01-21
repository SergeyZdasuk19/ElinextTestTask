package by.Elinext.pages;

import by.Elinext.asserts.AssertPage;
import by.Elinext.driver.DriverSingleton;

public class HomePage extends BasePage {

    public HomePage load() {
        DriverSingleton.getDriver().get("http://qa.yotec.net/");
        new AssertPage().assertUrl("http://qa.yotec.net/");
        return this;
    }


}
