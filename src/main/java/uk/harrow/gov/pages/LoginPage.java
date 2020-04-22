package uk.harrow.gov.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.harrow.gov.utility.Utility;

public class LoginPage extends Utility {


    //Log the webelements and methods into Log4j reports
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

//Using selenium @Findby and initElement methods
// using _ help separate from variable

//   By welcomeGuestText = By.xpath("//li[@class='navbar-text myprofile_salutation']");

    @FindBy(xpath = "//li[@class='navbar-text myprofile_salutation']")
    WebElement _welcomeGuestText;

    public void setWelcomeGuestText (){
        Reporter.log("Displaying Welcome Guest Text " + _welcomeGuestText.toString() + "<br>");
        verifyThatTextIsDisplayed(_welcomeGuestText, "Welcome Guest!");
        log.info("Displaying Welcome Guest Text : " + _welcomeGuestText.toString());

    }
    public String getWelcomeGuestText (){
        Reporter.log("Getting Welcome Guest Text " + getTextFromElement(_welcomeGuestText)+" "+_welcomeGuestText.toString() + "<br>");
        log.info("Getting Welcome Guest Text : " +getTextFromElement(_welcomeGuestText)+" "+ _welcomeGuestText.toString());
        return getTextFromElement(_welcomeGuestText);
    }
}
