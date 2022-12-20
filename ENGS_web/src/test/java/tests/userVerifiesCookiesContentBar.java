package tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import steps.HeatAndHealthSteps;
import steps.HomeSteps;

@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class userVerifiesCookiesContentBar {

    @Managed
    WebDriver driver;

    @Steps
    HomeSteps homeSteps;

    @Steps
    HeatAndHealthSteps heatAndHealthSteps;

    @Test
    public void tc01userVerifiesElementsOnCookiesContentBar(){
    homeSteps.userVerifiesCookiesText();
    homeSteps.userVerifiesCookiesDeclineButton();
    homeSteps.userVerifiesCookiesConfirmButton();
    System.out.println("All elements on Cookies Content Bar are visible");
    }

    @Test
    public void tc02userVerifiesIfCookiesContentBarPresentsWhenProceedingToAnotherTabAndDoNotAcceptOrDeclineCookies () throws InterruptedException {
        heatAndHealthSteps.clickOnHeatAndHealthButton();
        heatAndHealthSteps.userVerifiesCookiesText();
        System.out.println("Cookies Content Bar presents");
    }

    @Test
    public void tc03userDeclinesCookies(){
        homeSteps.clickOnDeclineButton();
        driver.navigate().refresh();
        homeSteps.userVerifiesCookiesContentBarIsHiddenAfterAcceptngOrDecliningCookies();
    }

    @Test
    public void tc04userAcceptsCookies(){
        homeSteps.clickOnConfirmButton();
        driver.navigate().refresh();
        homeSteps.userVerifiesCookiesContentBarIsHiddenAfterAcceptngOrDecliningCookies();
    }

}
