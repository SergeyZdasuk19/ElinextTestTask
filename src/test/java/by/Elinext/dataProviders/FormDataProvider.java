package by.Elinext.dataProviders;

import by.Elinext.entity.BreadCrumb;
import by.Elinext.entity.HelpForm;
import org.testng.annotations.DataProvider;

public class FormDataProvider {

    @DataProvider(name = "TestCaseForm")
    public static Object[][] sendMoreInformation() {
        return new Object[][]{
                {
                        new BreadCrumb("Home > We Are Wabash > Our Heritage"),
                        new HelpForm("Second Choice", "Afghanistan", "Sergey", "Wabash",
                                "Sergey.zdasuk@tut.by", "+375447789453", "Test comment",
                                "Success! Thanks for filling out our form!")
                }
        };
    }
}
