package by.Elinext.elements;

import by.Elinext.entity.BreadCrumb;
import by.Elinext.exceptions.RecordException;
import by.Elinext.factory.BreadCrumbFactory;
import lombok.AllArgsConstructor;
import lombok.Data;

import static by.Elinext.service.WaitEl.*;

@Data
@AllArgsConstructor
public class Content {
    private static final String BREADCRUMBS = "ul[class*='rsmFlow']";

    public static BreadCrumb getBreadCrumbs() {
        try {
            return BreadCrumbFactory.build($visibility(BREADCRUMBS));
        } catch (RuntimeException e) {
            throw new RecordException("Not found any breadcrumbs");
        }
    }
}
