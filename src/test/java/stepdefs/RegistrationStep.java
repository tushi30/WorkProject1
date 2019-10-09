package stepdefs;

import Hooks.StepBase;
import PageObjects.RegistrationPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class RegistrationStep {
    private WebDriver driver = StepBase.driver;

    RegistrationPage registrationPage;
    {
        registrationPage = new RegistrationPage(driver);;
    }
    @Given("^I navigate to Giftrete website$")
    public void iNavigateToGiftreteWebsite() {

        String url = ("http://qa.giftrete.com/");
        driver.get(url);
        driver.manage().window().maximize();
    }

    @When("^I click on create account$")
    public void iClickOnCreateAccount() {

        registrationPage.ClickOnCreateAccount();
    }


    @And("^I enter first name  in the name textbox$")
    public void iEnterFirstNameInTheNameTextbox() {

        registrationPage.EnterFirstName();
    }

    @And("^I enter last name in the last name field$")
    public void iEnterLastNameInTheLastNameField() {

        registrationPage.EnterLastName();
    }

    @And("^I enter email$")
    public void iEnterEmail() {
        registrationPage.EnterEmail();
    }

    @And("^I enter mobile number \"([^\"]*)\"$")
    public void iEnterMobileNumber(String arg0) throws Throwable {
     registrationPage.EnterMobile();
    }

    @And("^I enter password$")
    public void iEnterPassword() {

        registrationPage.EnterPassword();
    }

    @And("^I confirm password$")
    public void iConfirmPassword() {

        registrationPage.EnterConfirmPassword();
    }

    @Then("^User clicks on the register link button$")
    public void userClicksOnTheRegisterLinkButton() {

        registrationPage.ClickOnRegister();
    }

    @And("^error message is displayed$")
    public void errorMessageIsDisplayed() throws InterruptedException {
        //Assert.assertTrue(registrationPage.ErrorMessage());
        Thread.sleep(3000);
        registrationPage.Errormessage();
    }
}