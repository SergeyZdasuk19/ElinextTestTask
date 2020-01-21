package by.Elinext.dataProviders;

import by.Elinext.entity.BreadCrumb;
import by.Elinext.entity.Dealer;
import by.Elinext.enums.LocationType;
import org.testng.annotations.DataProvider;

public class DealerDataProvider {

    @DataProvider(name = "TestCaseDealer")
    public static Object[][] getDealerOperation() {
        return new Object[][]{
                {
                        new BreadCrumb("Home > Location Search > Dealer"),
                        new Dealer("Sales", 700, LocationType.SALES)
                }
        };
    }
}
