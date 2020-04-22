package uk.harrow.gov.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import uk.harrow.gov.pages.HomePage;
import uk.harrow.gov.pages.LoginPage;
import uk.harrow.gov.testbase.TestBase;

public class LoginTest extends TestBase {
    HomePage homePage;
    LoginPage loginPage;
    SoftAssert sa = new SoftAssert();

    @BeforeMethod(groups = {"smoke", "sanity", "regression"})
    public void setUPMethod () {
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @Test(priority = 0, groups = {"smoke", "regression"})
    public void verifyUserIsAbleToNavigatetoLoginPage() {
        homePage.clickOnLoginLink();
        loginPage.setWelcomeGuestText();
        sa.assertTrue(loginPage.getWelcomeGuestText().contains("Welcome Guest!"));
        sa.assertAll();
    }
}
