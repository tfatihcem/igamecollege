package com.college.step_definitions;

import com.college.pages.AdmissionPage;
import com.college.pages.HomePage;
import com.college.utilities.BrowserUtils;
import com.college.utilities.ConfigurationReader;
import com.college.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class PreRegistrationStepDefs {
    @Given("the user is on the home page")
    public void the_user_is_on_the_home_page() {
        System.out.println("Opening International Game College Page");
        String uri= ConfigurationReader.get("url");
        Driver.get().get(uri);
        HomePage home= new HomePage();
        home.cookie.click();
    }

    @When("the user enters Pre Registration Button")
    public void the_user_enters_Pre_Registration_Button() {

        BrowserUtils.waitFor(3);
        HomePage home= new HomePage();
        JavascriptExecutor js = (JavascriptExecutor)Driver.get();
        js.executeScript("arguments[0].click();",home.registration);
        Driver.closeDriver();


        //home.waitUntilRegistrationClickable();

        //home.registration.click();

    }

    @When("the user clicks on Apply Now Button")
    public void the_user_clicks_on_Apply_Now_Button() {

BrowserUtils.waitFor(3);
    Driver.get().get(ConfigurationReader.get("url1"));
        //HomePage home= new HomePage();

        //JavascriptExecutor js = (JavascriptExecutor)Driver.get();
        //js.executeScript("arguments[0].click();",home.apply);
    }

    @Then("the page is Application form for candidates")
    public void the_page_is_Application_form_for_candidates() {
        BrowserUtils.waitFor(3);
        AdmissionPage form = new AdmissionPage();
        String actual= form.applicationForm.getText();
        String expected="Application form for candidates";
        Assert.assertEquals(expected,actual);

    }

}
