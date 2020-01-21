package by.Elinext.asserts;

import by.Elinext.elementsPage.Footer;
import by.Elinext.entity.BreadCrumb;
import by.Elinext.entity.Dealer;
import by.Elinext.entity.HelpForm;
import by.Elinext.pages.BasePage;
import by.Elinext.pages.DealerPage;
import org.testng.Assert;

public class AssertPage {

    public AssertPage assertUrl(String expectedUrl) {
        Assert.assertEquals(BasePage.getUrl(), expectedUrl,
                "Ожидаемый url не совпадает с актуальным");
        return this;
    }

    public AssertPage assertBreadCrumb(BreadCrumb breadCrumb) {
        Assert.assertEquals(BasePage.getBreadCrumbs(), breadCrumb,
                "Ожидаемый breadcrumb не совпадает с актуальным");
        return this;
    }

    public AssertPage assertRadius(Dealer actual) {
        Dealer expected = new DealerPage().createDealer();
        Assert.assertTrue(actual.getRadius() > expected.getRadius(),
                "Ожидаемый радиус превышает актуальный");
        return this;
    }

    public AssertPage assertTitle(Dealer actual) {
        Dealer expected = new DealerPage().createDealer();
        Assert.assertTrue(
                expected
                        .getTypeOfTerm().toLowerCase()
                        .contains(actual.getTypeOfTerm().toLowerCase()), "В заголовке отсутствует тема поиска");
        return this;
    }

    public AssertPage assertLocationType(Dealer actual) {
        Dealer expected = new DealerPage().createDealer();
        Assert.assertEquals(actual.getLocationType(), expected.getLocationType());
        return this;
    }

    public AssertPage assertFooterMessage(HelpForm helpForm) {
        Assert.assertEquals(helpForm.getMessage(), new Footer().getMessage(),
                "Ожидаемый message не совпадает с актуальным");
        return this;
    }
}
