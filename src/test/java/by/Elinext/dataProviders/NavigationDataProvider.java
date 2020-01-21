package by.Elinext.dataProviders;

import by.Elinext.entity.BreadCrumb;
import by.Elinext.pages.*;
import org.testng.annotations.DataProvider;

public class NavigationDataProvider {
    @DataProvider(name = "TestCaseNavigation")
    public static Object[][] getNavigationOperations() {
        return new Object[][]{
                {
                        new HeritagePage(),
                        new BreadCrumb("Home > We Are Wabash > Our Heritage")
                },
                {
                        new EnvironmentalPage(),
                        new BreadCrumb("Home > We Are Wabash > Corporate Responsibility >" +
                                " Environmental, Health & Safety Policy")
                },
                {
                        new FuelEconomyPage(),
                        new BreadCrumb("Home > We Are Wabash > Corporate Responsibility > Sustainability > Fuel Economy")
                },
                {
                        new HighwaySafetyPage(),
                        new BreadCrumb("Home > We Are Wabash > Corporate Responsibility > Safety > Highway Safety")
                },
                {
                        new SuppliersPage(),
                        new BreadCrumb("Home > We Are Wabash > Teamwork > Suppliers")
                },
                {
                        new FrequentlyAskedQuestionsPage(),
                        new BreadCrumb("Home > We Are Wabash > Support > Frequently Asked Questions")
                },
                {
                        new ResponsibilityPage(),
                        new BreadCrumb("Home > Tradition of Innovation > Responsibility to Our Customers")
                },
                {
                        new DuraplatePage(),
                        new BreadCrumb("Home > Our Products > Trailers > Dry Vans > DuraPlate® Dry Vans")
                },
                {
                        new DryPage(),
                        new BreadCrumb("Home > Our Products > Truck Bodies > Dry")
                }
        };
    }
}
