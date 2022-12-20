package pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class HeatAndHealthPage extends PageObject {
    @FindBy(xpath = "//*[@id=\"mainNav\"]/li[2]/a")
    public WebElementFacade heatAndHealthButton;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[1]/div/div[1]/div[2]")
    public WebElementFacade heatAndHealthBanner;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[4]/div[1]")
    public WebElementFacade cookiesContentBarTextHeatAndHealth;
}
