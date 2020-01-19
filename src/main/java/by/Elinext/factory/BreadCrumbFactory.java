package by.Elinext.factory;

import by.Elinext.entity.BreadCrumb;
import org.openqa.selenium.WebElement;

public class BreadCrumbFactory {
    public static BreadCrumb build(WebElement ul) {
        return new BreadCrumb(getRefactoringBreadCrumbs(ul));
    }

    public static String getRefactoringBreadCrumbs(WebElement ul) {
        return ul
                .getText()
                .replace("\n", "")
                .replace(">", " > ");
    }
}
