package pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageObject {

    @FindBy(xpath = "//*[@id=\"__next\"]/div[4]")
    public WebElementFacade cookiesContentBarText;

    @FindBy(xpath = "//*[@id=\"rcc-decline-button\"]")
    public WebElementFacade cookiesDeclineButton;

    @FindBy(xpath = "//*[@id=\"rcc-confirm-button\"]")
    public WebElementFacade cookiesConfirmButton;



}
