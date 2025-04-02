package pages;

import helpMethods.ElementHelper;
import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import pageLocators.AddCustomerLocators;
import pageLocators.BankManagerLocators;

import static pageLocators.AddCustomerLocators.*;

public class AddCustomerPage {
    private WebDriver driver;
    private ElementHelper elementHelper;

    public AddCustomerPage(WebDriver driver) {
        this.driver = driver;
        elementHelper = new ElementHelper(driver);
    }
    public void fillFirstName(String firstNameValue){
        elementHelper.fillLocator(firstNameElement, firstNameValue);
        LoggerUtility.infoTest("The user filled first name filed with value");
    }
    public void fillLastName(String lastNameValue){
        elementHelper.fillLocator(lastNameElement, lastNameValue);
        LoggerUtility.infoTest("The user filled last name filed with value");
    }
    public void fillPstCode(String postCodeValue){
        elementHelper.fillLocator(postCodeElement, postCodeValue);
        LoggerUtility.infoTest("The user filled post code filed with value");
    }
    public void clickAddCustomerButton(){
        elementHelper.clickLocator(AddCustomerLocators.addCustomerButton);
        LoggerUtility.infoTest("The user clicked on add customer button");
    }
}
