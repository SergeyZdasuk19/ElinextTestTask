package by.Elinext.tests;

import by.Elinext.asserts.AssertPage;
import by.Elinext.dataProviders.DealerDataProvider;
import by.Elinext.dataProviders.FormDataProvider;
import by.Elinext.dataProviders.NavigationDataProvider;
import by.Elinext.elementsPage.Footer;
import by.Elinext.elementsPage.Header;
import by.Elinext.entity.BreadCrumb;
import by.Elinext.entity.Dealer;
import by.Elinext.entity.HelpForm;
import by.Elinext.pages.BasePage;
import by.Elinext.pages.DealerPage;
import org.testng.annotations.Test;

public class ElinextTest extends Common {

    @Test(
            dataProviderClass = NavigationDataProvider.class,
            dataProvider = "TestCaseNavigation")
    public void navigateToDropDownElement(BasePage basePage,
                                          BreadCrumb breadCrumb) {
        new Header().openSpecialMenu(breadCrumb);
        basePage.load();
        new AssertPage().assertBreadCrumb(breadCrumb);
    }

    @Test(
            dataProviderClass = DealerDataProvider.class,
            dataProvider = "TestCaseDealer")
    public void getInfoAboutDealer(BreadCrumb breadCrumb,
                                   Dealer dealer) {
        new Header().openSpecialMenu(breadCrumb);
        new DealerPage()
                .load()
                .clearAllFilters()
                .setRadius(dealer)
                .pressCheckbox(dealer.getLocationType())
                .inputSearch(dealer);
        new AssertPage()
                .assertLocationType(dealer)
                .assertTitle(dealer)
                .assertRadius(dealer);

    }

    @Test(
            dataProviderClass = FormDataProvider.class,
            dataProvider = "TestCaseForm")
    public void sendActiveForm(BreadCrumb breadCrumb,
                               HelpForm helpForm) {
        new Header().openSpecialMenu(breadCrumb);
        new Footer()
                .moveToFooter()
                .selectChoice(helpForm)
                .selectCountry(helpForm)
                .inputName(helpForm)
                .inputCompany(helpForm)
                .inputEmail(helpForm)
                .inputPhone(helpForm)
                .inputComments(helpForm)
                .submit()
                .moveToFooter();
        new AssertPage().assertFooterMessage(helpForm);
    }
}
