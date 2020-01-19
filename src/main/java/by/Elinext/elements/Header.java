package by.Elinext.elements;

import by.Elinext.driver.DriverSingleton;
import by.Elinext.entity.BreadCrumb;
import by.Elinext.exceptions.RecordException;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.openqa.selenium.interactions.Actions;

import java.util.Arrays;
import java.util.LinkedList;

import static by.Elinext.service.WaitEl.$menu;

@Data
@AllArgsConstructor
public class Header {

    public static void openSpecialMenu(BreadCrumb breadCrumb) {
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
    }
}
