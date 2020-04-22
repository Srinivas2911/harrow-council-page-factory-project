package uk.harrow.gov.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.harrow.gov.utility.Utility;

public class HomePage extends Utility {

    //Log the webelements and methods into Log4j reports
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

//Using selenium @Findby and initElement methods
// using _ help separate from variable

//    By iconDisplay = By.xpath("//span[@class='icon icon-logo identity__logo-desktop']");
//    By loginLink = By.xpath("//span[@class='icon-fallback']");
//    By servicesLink = By.xpath("//span[@class='button__text'][contains(text(),'Services')]");

    @FindBy(xpath = "//span[@class='icon icon-logo identity__logo-desktop']")
    WebElement _iconDisplay;

    @FindBy(xpath = "//span[@class='icon-fallback']")
    WebElement _loginLink;

    @FindBy(xpath = "//span[@class='button__text'][contains(text(),'Services')]")
    WebElement _servicesLink;

    public void iconIsDisplayed() {
        Reporter.log("Displaying The Icon " + _iconDisplay.toString() + "<br>");
        verifyThatElementIsDisplayed(_iconDisplay);
        log.info("Displaying The Icon : " + _iconDisplay.toString());
    }

    public void loginLinkDisplayed() {
        Reporter.log("Displaying The Login Link " + _loginLink.toString() + "<br>");
        verifyThatElementIsDisplayed(_loginLink);
        log.info("Displaying Login Link : " + _loginLink.toString());
    }

    public void servicesLinkDisplayed() {
        Reporter.log("Displaying Services Link " + _servicesLink.toString() + "<br>");
        verifyThatElementIsDisplayed(_servicesLink);
        log.info("Displaying Services Link : " + _servicesLink.toString());
    }

    public void clickOnLoginLink() {
        Reporter.log("Clicking on Login link : " + _loginLink.toString() + "<br>");
        clickOnElement(_loginLink);
        log.info("Clicking on Login link : " + _loginLink.toString());
    }

    public void clickOnServicesLink() {
        Reporter.log("Clicking on Services link : " + _servicesLink.toString() + "<br>");
        clickOnElement(_servicesLink);
        log.info("Clicking on Services link : " + _servicesLink.toString());

    }
}
