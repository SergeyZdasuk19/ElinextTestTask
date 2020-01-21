package by.Elinext.elementsPage;

import by.Elinext.driver.DriverSingleton;
import by.Elinext.entity.HelpForm;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import static by.Elinext.service.WaitEl.$visibility;

public class Footer {
    private static final String FOOTER = "div[id*='Footer']";
    private static final String CHOICE = "select[id*='dropDown']";
    private static final String COUNTRY = "select[id*='dropDownCountry']";
    private static final String NAME = "input[placeholder='Name']";
    private static final String COMPANY = "input[placeholder='Company']";
    private static final String EMAIL = "input[placeholder='Email']";
    private static final String PHONE = "input[placeholder='Phone']";
    private static final String COMMENTS = "textarea[placeholder='Comments']";
    private static final String SUBMIT = "input[value='Submit']";
    private static final String MESSAGE = "div[id*='success']";

    public Footer moveToFooter() {
        new Actions(DriverSingleton.getDriver())
                .moveToElement($visibility(FOOTER))
                .build()
                .perform();
        return this;
    }

    public Footer selectChoice(HelpForm helpForm) {
        new Select($visibility(CHOICE)).selectByVisibleText(helpForm.getChoise());
        return this;
    }

    public Footer selectCountry(HelpForm helpForm) {
        new Select($visibility(COUNTRY)).selectByVisibleText(helpForm.getCountry());
        return this;
    }

    public Footer inputName(HelpForm helpForm) {
        $visibility(NAME).sendKeys(helpForm.getName());
        return this;
    }

    public Footer inputCompany(HelpForm helpForm) {
        $visibility(COMPANY).sendKeys(helpForm.getCompany());
        return this;
    }

    public Footer inputEmail(HelpForm helpForm) {
        $visibility(EMAIL).sendKeys(helpForm.getEmail());
        return this;
    }

    public Footer inputPhone(HelpForm helpForm) {
        $visibility(PHONE).sendKeys(helpForm.getPhone());
        return this;
    }

    public Footer inputComments(HelpForm helpForm) {
        $visibility(COMMENTS).sendKeys(helpForm.getComments());
        return this;
    }

    public Footer submit() {
        $visibility(SUBMIT).click();
        return this;
    }

    public String getMessage() {
        return $visibility(MESSAGE).getText();
    }
}
