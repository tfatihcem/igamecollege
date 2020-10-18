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
