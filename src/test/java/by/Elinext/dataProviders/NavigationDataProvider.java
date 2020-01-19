package by.Elinext.dataProviders;

import by.Elinext.entity.BreadCrumb;
import by.Elinext.pages.HeritagePage;
import by.Elinext.pages.HomePage;
import org.testng.annotations.DataProvider;

public class NavigationDataProvider {
    @DataProvider(name = "TestCaseNavigation")
    public static Object[][] getOperationReception() {
        return new Object[][]{
                {
                        new HomePage(),
                        new BreadCrumb("Home > We Are1 Wabash > Our Heritage")
                },
                {
                        new HeritagePage(),
                        new BreadCrumb("Home > We Are Wabash > Corporate Responsibility > Environmental, Health & Safety Policy")
                }
        };
    }
}
