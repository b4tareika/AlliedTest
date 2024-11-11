package demoqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormaPage {
    public static WebDriver driver;

    @FindBy(id="firstName")
    private WebElement firstNameElement;
    @FindBy(id="lastName")
    private WebElement lastNameElement;
    @FindBy(id="userEmail")
    private WebElement userEmailElement;
    @FindBy(id = "userNumber")
    private WebElement numberElement;
    @FindBy(id = "gender-radio-1")
    private WebElement genderElement;


    public FormaPage(WebDriver driver) {
        FormaPage.driver = driver;
        PageFactory.initElements(FormaPage.driver, this);
    }

    public String setFirstNameElement(String FirstNamePar) {
        firstNameElement.sendKeys(FirstNamePar);
        return FirstNamePar;
    }
    public String setLastNameElement(String LastNamePar) {
        lastNameElement.sendKeys(LastNamePar);
        return LastNamePar;
    }
    public String setEmailElement(String EmailPar) {
        userEmailElement.sendKeys(EmailPar);
        return EmailPar;
    }
    public String setNumberElement(String NumberPar) {
        numberElement.sendKeys(NumberPar);
        return NumberPar;
    }
    public void setMailGender(){
        genderElement.sendKeys(" ");
    }

}


