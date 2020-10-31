package com.college.pages;

import com.college.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public abstract class BasePage {

    @FindBy(css="#cn-accept-cookie")
    public WebElement cookie;

    @FindBy(xpath="//h2[text()='Pre Registration']")
    public WebElement registration;

    @FindBy(xpath="//h2[@class='vc_custom_heading vc_custom_1568628358948']")
    public WebElement apply;

    @FindBy(xpath="//*[text()='Application form for candidates']")
    public WebElement applicationForm;

    @FindBy(xpath="/html/body/div[3]/div/div[2]/div[1]/div/div/div/div[1]/div/div/div/div/h6[1]/a")
    public WebElement programs;


    @FindBy(xpath="/html/body/div[5]/div/div[1]/div[2]/div/div/div/h1")
    public WebElement programsHeading;

    @FindBy(xpath="/html/body/div[3]/div/div[2]/div[1]/div/div/div/div[2]/div/div/div/div/h6[1]/a")
    public WebElement onlineEd;

    @FindBy(xpath="/html/body/div[5]/div/div[1]/div[2]/div/div/div/h1")
    public WebElement onlineEdHeading;

    @FindBy(xpath="/html/body/div[3]/div/div[2]/div[1]/div/div/div/div[3]/div/div/h6[1]/a")
    public WebElement languageEd;

    @FindBy(xpath="/html/body/div[5]/div/div[1]/div[2]/div/div/div/h1")
    public WebElement languageEdHeading;

    @FindBy(xpath="(//a[@title='Grants'])[1]")
    public WebElement grants;

    @FindBy(xpath="/html/body/div[5]/div/div[1]/div[2]/div[1]/div/div/h1")
    public WebElement grantsHeading;

    @FindBy(xpath="/html/body/div[5]/div/div[1]/div[5]/div[2]/div/div/div/h2")
    public WebElement OurScholarshipButton;

    @FindBy(xpath="/html/body/div[5]/div/div[1]/div[5]/div[3]/div/div/div/h2")
    public WebElement ApplyForScholarButton;

    @FindBy(xpath="/html/body/div[3]/div/div[4]/div[2]/div/div/div[3]/a")
    public WebElement socialLifeInCollege;

    @FindBy(xpath="/html/body/div[5]/div/div[1]/div[2]/div/div/div/div/div/h2/strong/b")
    public WebElement socialLifeInCollegeHeading;

    @FindBy(xpath="/html/body/div[3]/div/div[4]/div[2]/div/div/div[5]/a")
    public WebElement careerDevelopment;

    @FindBy(xpath="/html/body/div[5]/div/div[1]/div[2]/div/div/div/h1")
    public WebElement careerDevelopmentHeading;

    @FindBy(xpath="//a[@title='Admission']")
    public WebElement preRegistrationForm;

    @FindBy(xpath="/html/body/div[5]/div/div[1]/div[2]/div/div/div/div[3]/div[2]/div/div/div/a")
    public WebElement preRegistration_ApplyNowButton;

    @FindBy(xpath="/html/body/div[3]/div/div[4]/div[2]/div/div/div[9]/a")
    public WebElement activities;

    @FindBy(xpath="/html/body/div[5]/div/div[1]/div[2]/div/div/div/div/div/h2/strong")
    public WebElement activitiesHeading;

    @FindBy(xpath="/html/body/div[3]/div/div[4]/div[2]/div/div/div[11]/a")
    public WebElement frequentlyAsked;

    @FindBy(xpath="/html/body/div[5]/div/div[1]/div[2]/div/div/div/h2")
    public WebElement frequentlyAskedHeading;

    @FindBy(xpath="/html/body/div[3]/div/div[4]/div[2]/div/div/h5/a")
    public WebElement requestInfo;

    @FindBy(xpath="/html/body/div[5]/div/div/div[1]/div[2]/div/div/h2[1]")
    public WebElement welcomeToOurSchool;

    @FindBy(xpath="//*[@id=\"wpcf7-f7-p266-o1\"]/form/p[1]/label/span/input")
    public WebElement ContactNameInput;

    @FindBy(xpath="//*[@id=\"wpcf7-f7-p266-o1\"]/form/p[2]/label/span/input")
    public WebElement ContactMailInput;

    @FindBy(xpath="//*[@id=\"wpcf7-f7-p266-o1\"]/form/p[3]/label/span/input")
    public WebElement ContactSubjectInput;

    @FindBy(xpath="//*[@id=\"wpcf7-f7-p266-o1\"]/form/p[4]/label/span/textarea")
    public WebElement ContactMessageInput;

    @FindBy(xpath="//*[@id=\"wpcf7-f7-p266-o1\"]/form/p[5]/input")
    public WebElement ContactSubmit;

    @FindBy(xpath="(//div[@role='alert'])[2]")
    public WebElement ContactSubmitThanksMessage;

    @FindBy(xpath="(//div[@role='alert'])[2]")
    public WebElement ContactSubmitErrorMessage;

    @FindBy(xpath="//*[@id=\"latest-news\"]/div[2]/div/div/h2")
    public WebElement announcementHeading;

    @FindBy(xpath="/html/body/div[3]/div/div[13]/div/div/div/h2")
    public WebElement instagramHeading;

    @FindBy(xpath="/html/body/div[3]/div/div[14]/div/div/div")
    public WebElement instagramNegativMessage;







    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }


    public void waitUntilRegistrationClickable() {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.get(), 5);
            wait.until(ExpectedConditions.elementToBeClickable(registration));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
