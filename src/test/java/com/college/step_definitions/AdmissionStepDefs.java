package com.college.step_definitions;

import com.college.pages.AdmissionPage;
import com.college.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

public class AdmissionStepDefs {


    @When("the user enters the following Parents Guardian credentials")
    public void the_user_enters_the_following_Parents_Guardian_credentials(Map<String,String> dataTable) {
        AdmissionPage ad=new AdmissionPage();
        ad.newApplication.click();
        BrowserUtils.waitFor(3);
        Select suffixList= new Select(ad.suffix);
        suffixList.selectByIndex(7);
        List<WebElement> options = suffixList.getOptions();
        System.out.println(options.get(7).getText());
        Assert.assertEquals("None",options.get(7).getText());
        BrowserUtils.waitFor(2);
    Select relationship= new Select(ad.relationship);
    relationship.selectByIndex(1);
        List<WebElement> optionsrelation = relationship.getOptions();
        System.out.println(optionsrelation.get(1).getText());
        Assert.assertEquals("Father",optionsrelation.get(1).getText());
BrowserUtils.waitFor(2);
        ad.firsName.sendKeys(dataTable.get("firstname"));
        BrowserUtils.waitFor(1);
        ad.lastName.sendKeys(dataTable.get("lastname"));
        BrowserUtils.waitFor(1);
        ad.email.sendKeys(dataTable.get("email"));
        Assert.assertTrue("It is not a valid email address",dataTable.get("email").contains("@"));
        BrowserUtils.waitFor(1);
        ad.phone.sendKeys(dataTable.get("phone"));
        BrowserUtils.waitFor(1);
        ad.Birthdate.clear();
        ad.Birthdate.sendKeys(dataTable.get("birthdate"));
        ad.Birthdate.sendKeys(Keys.ENTER);

        BrowserUtils.waitFor(1);
        ad.UsCitizenResident.click();
        BrowserUtils.waitFor(1);
        Select optionsNation= new Select(ad.nationCitizen);
        optionsNation.selectByIndex(84);
        BrowserUtils.waitFor(1);
        List<WebElement> NationList = optionsNation.getOptions();
        System.out.println(NationList.get(84).getText());
        Assert.assertEquals("Germany",NationList.get(84).getText());
        ad.usReside.click();
        BrowserUtils.waitFor(1);
        Select optionsCountry= new Select(ad.Country);
        optionsCountry.selectByIndex(84);
        BrowserUtils.waitFor(1);
        ad.Address.sendKeys(dataTable.get("address"));
        BrowserUtils.waitFor(1);
        ad.city.sendKeys(dataTable.get("city"));
        BrowserUtils.waitFor(1);
        ad.state.sendKeys(dataTable.get("state"));
        BrowserUtils.waitFor(1);
        ad.zipCode.sendKeys(dataTable.get("zipcode"));
        BrowserUtils.waitFor(1);







    }



    @Then("the user continue")
    public void the_user_continue() {
        AdmissionPage button= new AdmissionPage();
        button.continueButton.click();
        BrowserUtils.waitFor(3);
    }

    @When("the user enters the following Applicant Information credentials")
    public void the_user_enters_the_following_Applicant_Information_credentials(Map<String,String> ApplicantDataTable) {
        AdmissionPage ad=new AdmissionPage();
        ad.applicantFirstName.sendKeys(ApplicantDataTable.get("firstname"));
        BrowserUtils.waitFor(1);
        ad.applicantLastName.sendKeys(ApplicantDataTable.get("lastname"));
        BrowserUtils.waitFor(1);
        Select suffixApplicantList= new Select(ad.applicantSuffix);
        suffixApplicantList.selectByIndex(5);
        List<WebElement> options = suffixApplicantList.getOptions();
        System.out.println(options.get(5).getText());
        Assert.assertEquals("Jr.",options.get(5).getText());
        BrowserUtils.waitFor(2);
        ad.applicantGenderFemale.click();
        BrowserUtils.waitFor(1);
        ad.applicantBirthDate.clear();
        ad.applicantBirthDate.sendKeys(ApplicantDataTable.get("birthdate"));
        ad.applicantBirthDate.sendKeys(Keys.ENTER);
        BrowserUtils.waitFor(1);
        ad.applicantEmail.sendKeys(ApplicantDataTable.get("email"));
        BrowserUtils.waitFor(1);
        ad.applicantUScitizenResident.click();
        BrowserUtils.waitFor(1);
        Select optionsNation= new Select(ad.applicantNationOfCitizenship);
        optionsNation.selectByIndex(84);
        BrowserUtils.waitFor(1);
        List<WebElement> NationList = optionsNation.getOptions();
        System.out.println(NationList.get(84).getText());
        BrowserUtils.waitFor(2);
        ad.applicantAttendedSchool.click();
        BrowserUtils.waitFor(1);



    }

    @Then("the user goes to Application Fee")
    public void the_user_goes_to_Application_Fee() {
        AdmissionPage ad=new AdmissionPage();
        ad.applicantNextButton.click();
        Assert.assertTrue("Our website is in costruction, thank you for your patience",ad.applicantNextButton.isEnabled());
    }



}
