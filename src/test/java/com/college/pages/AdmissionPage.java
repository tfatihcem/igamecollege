package com.college.pages;

import com.college.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdmissionPage extends BasePage{

    public AdmissionPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath="/html/body/div[1]/div/div[2]/div[1]/p")
    public WebElement applicationForm;

    @FindBy(xpath="//a[text()='Start New Application']")
    public WebElement newApplication;

    @FindBy(xpath="//*[@id=\"parent_form\"]/div[2]/div/div[1]/div[1]/select")
    public WebElement suffix;

    @FindBy(css="#parent_form > div.parent_list > div > div:nth-child(3) > div:nth-child(2) > select")
    public WebElement relationship;

    @FindBy(xpath="//*[@id=\"parent_form\"]/div[2]/div/div[2]/div[1]/input")
    public WebElement firsName;

    @FindBy(xpath="//*[@id=\"parent_form\"]/div[2]/div/div[2]/div[3]/input")
    public WebElement lastName;

    @FindBy(xpath="//*[@id=\"parent_form\"]/div[2]/div/div[3]/div[1]/input")
    public WebElement email;

    @FindBy(xpath="//*[@id=\"parent_form\"]/div[2]/div/div[3]/div[2]/input")
    public WebElement phone;

    @FindBy(xpath="//*[@id=\"parent_form\"]/div[2]/div/div[4]/div[1]/input")
    public WebElement Birthdate;

    @FindBy(xpath="//*[@id=\"parent_form\"]/div[2]/div/div[5]/div[1]/div[2]/label")
    public WebElement UsCitizenResident;

    @FindBy(xpath="//*[@id=\"parent_form\"]/div[2]/div/div[5]/div[2]/select")
    public WebElement nationCitizen;

    @FindBy(xpath="//*[@id=\"parent_form\"]/div[4]/div[2]/div/div[1]/div[1]/div[2]/label/input")
    public WebElement usReside;


    @FindBy(xpath="//*[@id=\"parent_form\"]/div[2]/div/div[5]/div[2]/select")
    public WebElement Country;

    @FindBy(xpath="//*[@id=\"parent_form\"]/div[4]/div[2]/div/div[2]/div/input")
    public WebElement Address;

    @FindBy(xpath="//*[@id=\"parent_form\"]/div[4]/div[2]/div/div[3]/div[1]/input")
    public WebElement city;

    @FindBy(xpath="//*[@id=\"parent_form\"]/div[4]/div[2]/div/div[3]/div[2]/input")
    public WebElement state;

    @FindBy(xpath="//*[@id=\"parent_form\"]/div[4]/div[2]/div/div[3]/div[3]/input")
    public WebElement zipCode;

    @FindBy(css="#parentsFormButton")
    public WebElement continueButton;

    @FindBy(xpath="//*[@id=\"applicant_form\"]/div/div/div/div[1]/div[1]/input")
    public WebElement applicantFirstName;

    @FindBy(xpath="//*[@id=\"applicant_form\"]/div/div/div/div[1]/div[3]/input")
    public WebElement applicantLastName;

    @FindBy(xpath="//*[@id=\"applicant_form\"]/div/div/div/div[2]/div[1]/select")
    public WebElement applicantSuffix;

    @FindBy(xpath="//*[@id=\"applicant_form\"]/div/div/div/div[2]/div[2]/div[2]/label/input")
    public WebElement applicantGenderFemale;

    @FindBy(xpath="//*[@id=\"applicant_form\"]/div/div/div/div[3]/div[1]/input")
    public WebElement applicantBirthDate;

    @FindBy(xpath="//*[@id=\"applicant_form\"]/div/div/div/div[3]/div[2]/input")
    public WebElement applicantEmail;

    @FindBy(xpath="//*[@id=\"applicant_form\"]/div/div/div/div[4]/div[1]/div[2]/label/input")
    public WebElement applicantUScitizenResident;

    @FindBy(xpath="//*[@id=\"applicant_form\"]/div/div/div/div[4]/div[2]/select")
    public WebElement applicantNationOfCitizenship;

    @FindBy(xpath="//*[@id=\"applicant_radios\"]/div[2]/label")
    public WebElement applicantAttendedSchool;

    @FindBy(xpath="//*[@id=\"applicantFormButton\"]")
    public WebElement applicantNextButton;

}
