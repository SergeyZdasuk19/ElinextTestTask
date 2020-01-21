package by.Elinext.factory;

import by.Elinext.entity.Dealer;
import by.Elinext.enums.LocationType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DealerFactory {

    public static Dealer build(WebElement div) {
        return new Dealer(
                getTitleFromDiv(div).getText(),
                getAmountMilesFromDiv(getMilesFromDiv(div).getText()),
                LocationType.getLocationType(getLocationTypeFromDiv(div).getText()));
    }

    public static WebElement getMilesFromDiv(WebElement div) {
        return div.findElement(By.cssSelector(" div[class*='distance'] div"));
    }

    public static Integer getAmountMilesFromDiv(String miles) {
        return (int) Double.parseDouble(miles.replaceAll("\\w+$", "").trim());
    }

    public static WebElement getTitleFromDiv(WebElement div) {
        return div.findElement(By.cssSelector(" div[class='adress'] h2"));
    }

    public static WebElement getLocationTypeFromDiv(WebElement div) {
        return div.findElement(By.cssSelector(" div[class='service'] strong"));
    }
}
