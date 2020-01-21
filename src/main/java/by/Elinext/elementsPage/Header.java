package by.Elinext.elementsPage;

import by.Elinext.driver.DriverSingleton;
import by.Elinext.entity.BreadCrumb;
import by.Elinext.exceptions.RecordException;
import by.Elinext.pages.BasePage;
import org.openqa.selenium.interactions.Actions;

import java.util.Arrays;
import java.util.LinkedList;

import static by.Elinext.service.WaitEl.$menu;

public class Header {

    public Header openSpecialMenu(BreadCrumb breadCrumb) {
        LinkedList<String> list = new LinkedList<>(
                Arrays.asList(
                        breadCrumb
                                .getBreadCrumb()
                                .split(">")));
        list.removeFirst();
        list
                .stream()
                .forEach(n -> {
                            try {
                                new Actions(DriverSingleton.getDriver())
                                        .moveToElement($menu(n))
                                        .perform();
                            } catch (RuntimeException e) {
                                throw new RecordException("Not found record for navigation");
                            }
                        }
                );
        $menu(list.getLast()).click();
        return this;
    }
}
