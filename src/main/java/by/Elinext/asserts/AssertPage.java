package by.Elinext.asserts;

import by.Elinext.elements.Content;
import by.Elinext.entity.BreadCrumb;
import by.Elinext.pages.AbstractPage;
import org.testng.Assert;

import static by.Elinext.service.WaitEl.*;

public class AssertPage {

    public AssertPage assertLoad(String title) {
        Assert.assertTrue($title(title), "Страница " + title + " не была загружена");
        return this;
    }

    public AssertPage assertUrl(String expectedUrl) {
        Assert.assertEquals(AbstractPage.getUrl(), expectedUrl,
                "Ожидаемый url не совпадает с актуальным");
        return this;
    }

    public AssertPage assertBreadCrumb(BreadCrumb breadCrumb) {
        Assert.assertEquals(Content.getBreadCrumbs(), breadCrumb,
                "Ожидаемый breadcrumb не совпадает с актуальным");
        return this;
    }
}
