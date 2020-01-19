package by.Elinext.tests;

import by.Elinext.asserts.AssertPage;
import by.Elinext.dataProviders.NavigationDataProvider;
import by.Elinext.elements.Header;
import by.Elinext.entity.BreadCrumb;
import by.Elinext.pages.AbstractPage;
import org.testng.annotations.Test;

public class NavigationTest extends Common {

    @Test(
            dataProviderClass = NavigationDataProvider.class,
            dataProvider = "TestCaseNavigation")
    public void navigateToDropDownElement(AbstractPage page,
                                          BreadCrumb breadCrumb) {
        page.load();
        Header.openSpecialMenu(breadCrumb);
        new AssertPage().assertBreadCrumb(breadCrumb);
    }
}
