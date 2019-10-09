package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class RegistrationPage {

    public WebDriver driver;

    public RegistrationPage(WebDriver driver)

    {
        PageFactory.initElements(driver,this );
    }

    @FindBy(css = ".sb-btn:nth-child(2)")
    private WebElement createaccount;

    public void ClickOnCreateAccount()
    {
        createaccount.click();
    }

    @FindBy(id = "first_name")
    private WebElement firstname;

    public void EnterFirstName()
    {
        firstname.sendKeys("Richard");
    }

    @FindBy(how = How.ID, using = "last_name")
    private WebElement lastname;

    public void EnterLastName()
   {
       lastname.sendKeys("abisonijogbon");
   }
    @FindBy(how = How.CSS, using = "#email")
    private WebElement email;

    public void EnterEmail()
    {
        email.sendKeys("r.ban@consultant.com");
    }

    @FindBy(how = How.CSS, using = "#mobile")
    private WebElement mobile;

    public void EnterMobile()
    {
        mobile.sendKeys("+447908845453");
    }

    @FindBy(how = How.CSS, using = "#password")
    private WebElement password;

    public void EnterPassword()
    {
        password.sendKeys("Richie309");
    }

    @FindBy(how = How.CSS, using = "#confirm_password")
    private WebElement confirmpassword;

    public void EnterConfirmPassword()
    {
        confirmpassword.sendKeys("Richie309");
    }

    @FindBy(how = How.CSS, using = "#btn_register")
    private WebElement register;

    public void ClickOnRegister()
    {
        register.click();
    }
    @FindBy(how = How.CSS, using = "#dng_msg > p")
    private WebElement errormessage;
//    public boolean ErrorMessage()
//    {
//        return errormessage.isDisplayed();
//    }
    public void Errormessage()
    {
        Assert.assertEquals(errormessage.getText(),"The Captcha field is required.");
    }
}
