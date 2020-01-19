package by.Elinext.pages;

import by.Elinext.driver.DriverSingleton;
import lombok.Data;

@Data
public abstract class AbstractPage {

    public abstract AbstractPage load();

    public static String getUrl() {
        return DriverSingleton.getDriver().getCurrentUrl();
    }


}
