package by.Elinext.tests;


import by.Elinext.driver.DriverSingleton;
import by.Elinext.pages.HomePage;
import lombok.extern.log4j.Log4j;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

@Log4j
public abstract class Common {
    @BeforeClass()
    public void setUp() {
        new HomePage().load();
    }

    @AfterClass()
    public void closeDriver() {
        DriverSingleton.closeDriver();
    }

}
