package steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import java.time.Duration;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class HomeSteps {

    HomePage homePage;
    WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofMillis(30L));

    @Step
    public void userVerifiesCookiesText() {
        getDriver().manage().window().maximize();
        homePage.open();
        Assert.assertTrue("User does not see 'This website uses cookies to enhance the user experience' text on Home Page", homePage.cookiesContentBarText.isVisible());
        System.out.println("Cookies text is visible");
    }

    @Step
    public void userVerifiesCookiesDeclineButton(){
        Assert.assertTrue("User does not see 'Decline' button on Cookies Content bar on Home Page", homePage.cookiesDeclineButton.isVisible());
        System.out.println("Cookies Decline button is visible");
    }

    @Step
    public void userVerifiesCookiesConfirmButton(){
        Assert.assertTrue("User does not see 'Confirm' button on Cookies Content bar on Home Page", homePage.cookiesConfirmButton.isVisible());
        System.out.println("Cookies Confirm button is visible");
    }

    @Step
    public void clickOnDeclineButton(){
        homePage.open();
        homePage.cookiesDeclineButton.click();
    }

    @Step
    public void userVerifiesCookiesContentBarIsHiddenAfterAcceptngOrDecliningCookies(){
        Assert.assertFalse("User sees 'This website uses cookies to enhance the user experience' text on Home Page", homePage.cookiesContentBarText.isVisible());
        System.out.println("Cookies Content bar is not visible");
    }

    @Step
    public void clickOnConfirmButton(){
        homePage.open();
        homePage.cookiesConfirmButton.click();
    }

}
