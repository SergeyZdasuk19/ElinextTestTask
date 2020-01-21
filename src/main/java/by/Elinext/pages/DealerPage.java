package by.Elinext.pages;

import by.Elinext.asserts.AssertPage;
import by.Elinext.driver.DriverSingleton;
import by.Elinext.entity.Dealer;
import by.Elinext.enums.LocationType;
import by.Elinext.exceptions.RecordException;
import by.Elinext.factory.DealerFactory;
import org.openqa.selenium.interactions.Actions;

import static by.Elinext.service.WaitEl.$visibility;

public class DealerPage extends BasePage {

    private static final String SEARCH = "input[id*='CompanyName']";
    private static final String SLIDER = "div[class*='handle']";
    private static final String BUTTON_CLEAR = "a[class='clear-all']";
    private static final String MILES = "div[class*='handle'] span";
    private static final String DEALER_RESULTS = "div[class*='w__dealer_list'] div";

    public DealerPage load() {
        new AssertPage().assertUrl("http://qa.yotec.net/location-search/dealer");
        return this;
    }

    public DealerPage inputSearch(Dealer dealer) {
        $visibility(SEARCH).sendKeys(dealer.getTypeOfTerm());
        return this;
    }

    public DealerPage clearAllFilters() {
        $visibility(BUTTON_CLEAR).click();
        return this;
    }

    public DealerPage setRadius(Dealer dealer) {
        int maxRadius = getAmountMiles($visibility(MILES).getText());
        int radiusValue = -(maxRadius - dealer.getRadius()) / 4;
        new Actions(DriverSingleton.getDriver())
                .clickAndHold($visibility(SLIDER))
                .moveByOffset(radiusValue, 0)
                .release()
                .build()
                .perform();
        return this;
    }

    public DealerPage pressCheckbox(LocationType locationType) {
        String locator = "button[value*='" + locationType.getText() + "']";
        $visibility(locator).click();
        return this;
    }

    public Dealer createDealer() {
        try {
            return DealerFactory.build($visibility(DEALER_RESULTS));
        } catch (RuntimeException e) {
            throw new RecordException("Not found any dealer results");
        }
    }

    public Integer getAmountMiles(String miles) {
        return new Integer(miles.replaceAll("\\w+$", "").trim());
    }
}
