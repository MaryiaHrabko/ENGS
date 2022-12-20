package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HeatAndHealthPage;
import pages.HomePage;

import java.io.IOException;
import java.time.Duration;

import static java.lang.Thread.sleep;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class HeatAndHealthSteps {

    HeatAndHealthPage heatAndHealthPage;
    WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofMillis(30L));
    HomePage homePage;

    @Step
    public void clickOnHeatAndHealthButton() throws InterruptedException {
        homePage.open();
        heatAndHealthPage.heatAndHealthButton.click();
        //sleep(4);
    }

    @Step
    public void userVerifiesCookiesText(){
        Assert.assertTrue("User does not see 'This website uses cookies to enhance the user experience' text on Home Page", heatAndHealthPage.cookiesContentBarTextHeatAndHealth.isVisible());
        System.out.println("Cookies text is visible");
    }

}
