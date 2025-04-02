package tests;

import org.testng.annotations.Test;
import pages.AddCustomerPage;
import pages.BankManagerPage;
import pages.IndexPage;
import pages.OpenAccountPage;
import sharedData.SharedData;

public class BankManagerTest extends SharedData {

    @Test
    public void testMethod() {

        IndexPage indexPage = new IndexPage(driver);
        indexPage.clickManagerLoginMenu();

        BankManagerPage bankManagerPage = new BankManagerPage(driver);
        bankManagerPage.clickAddCustomerElement();

        String firstNameValue = "Pontos";
        String lastNameValue = "Natalia";
        String postCodeValue = "415325";
        String fullNameValue = firstNameValue +" "+ lastNameValue;

        AddCustomerPage addCustomerPage = new AddCustomerPage(driver);
        addCustomerPage.fillFirstName(firstNameValue);
        addCustomerPage.fillLastName(lastNameValue);
        addCustomerPage.fillPstCode(postCodeValue);
        addCustomerPage.clickAddCustomerButton();

        OpenAccountPage openAccountPage = new OpenAccountPage(driver);
        openAccountPage.selectCustomerName(fullNameValue);
    }
}
