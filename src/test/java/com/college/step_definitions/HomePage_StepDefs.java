package com.college.step_definitions;

import com.college.pages.HomePage;
import com.college.utilities.BrowserUtils;
import com.college.utilities.ConfigurationReader;
import com.college.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;


public class HomePage_StepDefs {
    @When("the user clicks on Programs")
    public void the_user_clicks_on_Programs() {
        BrowserUtils.waitFor(2);
        HomePage program= new HomePage();
        program.programs.click();

    }

    @Then("the user goes programs page")
    public void the_user_goes_programs_page() {
        BrowserUtils.waitFor(2);
        HomePage prog= new HomePage();
        assertEquals("PROGRAMS", prog.programsHeading.getText());
        System.out.println(prog.programsHeading.getText());
        Driver.get().navigate().back();
        BrowserUtils.waitFor(2);
    }

    @Then("when the user clicks on Online Ed")
    public void when_the_user_clicks_on_Online_Ed() {

        HomePage home= new HomePage();
        home.onlineEd.click();
        BrowserUtils.waitFor(2);
    }

    @Then("the user goes Online Ed page")
    public void the_user_goes_Online_Ed_page() {
        HomePage home= new HomePage();
        assertEquals("ONLINE ED", home.onlineEdHeading.getText());
        System.out.println(home.onlineEdHeading.getText());
        Driver.get().navigate().back();
        BrowserUtils.waitFor(2);
    }

    @When("the user clicks on Language Ed")
    public void the_user_clicks_on_Language_Ed() {
        HomePage home= new HomePage();
        home.languageEd.click();
        BrowserUtils.waitFor(2);
    }

    @Then("the user goes Language Ed page")
    public void the_user_goes_Language_Ed_page() {
        HomePage home= new HomePage();
        assertEquals("LANGUAGE ED", home.languageEdHeading.getText());
        System.out.println(home.languageEdHeading.getText());
        Driver.get().navigate().back();
        BrowserUtils.waitFor(3);
}

    @Then("when the user clicks on Grants")
    public void when_the_user_clicks_on_Grants() {
        HomePage home= new HomePage();
        home.grants.click();
        BrowserUtils.waitFor(2);
    }

    @Then("the user has the access to Scholarship Program and Apply For Scholarship")
    public void the_user_has_the_access_to_Scholarship_Program_and_Apply_For_Scholarship() {
        HomePage home= new HomePage();
        assertEquals("Grants", home.grants.getText());
        System.out.println(home.grants.getText());
        if (home.OurScholarshipButton.isEnabled()){
            System.out.println("Our Scholarship Program Button is active but not clickable");


        }else{

            System.out.println("Our Scholarship Program Button is inactive");
        }
        if(home.ApplyForScholarButton.isEnabled()){
            System.out.println("Apply for a Scholarship button is active but not clickable");


        }else{

            System.out.println("Apply for a Scholarship button is inactive");
        }


        Driver.get().navigate().back();
        BrowserUtils.waitFor(2);
    }

    @Then("when the user clicks on Social Life in College")
    public void when_the_user_clicks_on_Social_Life_in_College() {
        HomePage home= new HomePage();
        home.socialLifeInCollege.click();
        BrowserUtils.waitFor(2);
    }

    @Then("the user has access to the social life page")
    public void the_user_has_access_to_the_social_life_page() {
        HomePage home= new HomePage();
        assertEquals(ConfigurationReader.get("url_sociallife"), Driver.get().getCurrentUrl());
        System.out.println(Driver.get().getCurrentUrl());
        Driver.get().navigate().back();
        BrowserUtils.waitFor(2);
    }

    @Then("the user has the access to the Carreer development page")
    public void the_user_has_the_access_to_the_Carreer_development_page() {
        HomePage home= new HomePage();
        home.careerDevelopment.click();
        BrowserUtils.waitFor(2);
        assertEquals(ConfigurationReader.get("url_careerdev"), Driver.get().getCurrentUrl());
        System.out.println(Driver.get().getCurrentUrl());
        Driver.get().navigate().back();
        BrowserUtils.waitFor(2);
    }

    @When("the user clicks on to the pre registration Form")
    public void the_user_clicks_on_to_the_pre_registration_Form() {
        HomePage home= new HomePage();
        home.preRegistrationForm.click();
        BrowserUtils.waitFor(2);
    }

    @Then("the user enters Apply For button")
    public void the_user_enters_Apply_For_button() {
        HomePage home= new HomePage();
        home.preRegistration_ApplyNowButton.click();
        BrowserUtils.waitFor(2);
        Driver.get().navigate().back();
        assertEquals(ConfigurationReader.get("url_preregistration"), Driver.get().getCurrentUrl());
        Driver.get().navigate().back();
        BrowserUtils.waitFor(2);
    }

    @Then("when the user clicks on Activities")
    public void when_the_user_clicks_on_Activities() {
        HomePage home= new HomePage();
        home.activities.click();
        BrowserUtils.waitFor(2);
    }

    @Then("the user goes Activities page")
    public void the_user_goes_Activities_page() {
        assertEquals(ConfigurationReader.get("url_activities"), Driver.get().getCurrentUrl());
        Driver.get().navigate().back();
        BrowserUtils.waitFor(2);
    }

    @Then("when the user clicks on Frequently Asked Questions")
    public void when_the_user_clicks_on_Frequently_Asked_Questions() {
        HomePage home= new HomePage();
        home.frequentlyAsked.click();
        BrowserUtils.waitFor(2);
    }

    @Then("the user sees the questions")
    public void the_user_sees_the_questions() {
        assertEquals(ConfigurationReader.get("url_faq"), Driver.get().getCurrentUrl());
        Driver.get().navigate().back();
        BrowserUtils.waitFor(2);
    }

    @When("the user Request Information")
    public void the_user_Request_Information() {
        HomePage home= new HomePage();
        home.requestInfo.click();
        BrowserUtils.waitFor(2);
    }

    @Then("the user fill out and submit the Contact Form")
    public void the_user_fill_out_and_submit_the_Contact_Form() {
        HomePage home= new HomePage();
        home.ContactNameInput.sendKeys("Jessica Doe");
        home.ContactMailInput.sendKeys("test@test.com");
        home.ContactSubjectInput.sendKeys("Test");
        home.ContactMessageInput.sendKeys("This is a test!!!");
        home.ContactSubmit.click();
        BrowserUtils.waitFor(1);
        assertEquals(home.ContactSubmitThanksMessage.getText(), ConfigurationReader.get("contactFormSuccess"));
        Driver.get().navigate().refresh();
        home.ContactNameInput.sendKeys("Jessica Doe");
        home.ContactMailInput.sendKeys("test");
        home.ContactSubjectInput.sendKeys("Test");
        home.ContactMessageInput.sendKeys("This is a test!!!");
        home.ContactSubmit.click();
        BrowserUtils.waitFor(1);
        assertEquals(home.ContactSubmitErrorMessage.getText(),ConfigurationReader.get("contactFormError"));
        Driver.get().navigate().back();
        BrowserUtils.waitFor(2);
    }

    @Then("the user sees Announcement on the HomePage")
    public void the_user_sees_Announcement_on_the_HomePage() {
        HomePage home= new HomePage();
        System.out.println(home.announcementHeading.getText());
        assertEquals("Announcements",home.announcementHeading.getText());
    }

    @Then("the user sees Instagram on the HomePage")
    public void the_user_sees_Instagram_on_the_HomePage() {
        HomePage home= new HomePage();
        System.out.println(home.instagramHeading.getText());
        System.out.println(home.instagramNegativMessage.getText());
    }



}
