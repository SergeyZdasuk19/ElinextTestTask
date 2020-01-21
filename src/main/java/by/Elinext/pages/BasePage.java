package by.Elinext.pages;

import by.Elinext.driver.DriverSingleton;
import by.Elinext.entity.BreadCrumb;
import by.Elinext.exceptions.RecordException;
import by.Elinext.factory.BreadCrumbFactory;

import static by.Elinext.service.WaitEl.$visibility;

public abstract class BasePage {

    private static final String BREADCRUMBS = "ul[class*='rsmFlow']";

    public abstract BasePage load();

    public static BreadCrumb getBreadCrumbs() {
        try {
            return BreadCrumbFactory.build($visibility(BREADCRUMBS));
        } catch (RuntimeException e) {
            throw new RecordException("Not found any breadcrumbs");
        }
    }

    public static String getUrl() {
        return DriverSingleton.getDriver().getCurrentUrl();
    }


}
