package com.cvlibrary.pages;


import com.cvlibrary.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class);

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "keywords")
    WebElement jobTitleField;
    @CacheLookup
    @FindBy(id = "location")
    WebElement locationField;
    @CacheLookup
    @FindBy(xpath = "//div[@class='hps-distance hps-transition']/select")
    WebElement distanceDropDownField;
    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionsLink;
    @CacheLookup
    @FindBy(xpath = "//div[@class='hps-sal-min']/input")
    WebElement salaryMin;
    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMax;
    @CacheLookup
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeDropDown;
    @CacheLookup
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobTypeDropDown;
    @CacheLookup
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobsBtn;
    public void switchToIframe() {
        driver.switchTo().frame("gdpr-consent-notice");
        clickOnElement(By.xpath("//div[@class='action-buttons top-bottom right-column ng-star-inserted']/button[2]"));
        driver.switchTo().defaultContent();
    }

    public void enterJobTitle(String jobTitle) {
        sendTextToElement(jobTitleField,jobTitle);
    }
    public void enterLocation(String location) {
        sendTextToElement(locationField,location);
    }
    public void selectDistance(String distance) {
        sendTextToElement(distanceDropDownField,distance);
    }
    public void clickOnMoreSearchOptionLink(){
        clickOnElement(moreSearchOptionsLink);
    }
    public void enterMinSalary(String minSalary) {
        sendTextToElement(salaryMin, minSalary);
    }
    public void enterMaxSalary(String maxSalary) {
        sendTextToElement(salaryMax,maxSalary);
    }
    public void selectSalaryType(String salaryType){
        sendTextToElement(salaryTypeDropDown,salaryType);
    }
    public void selectJobType(String jobType){
        sendTextToElement(jobTypeDropDown,jobType);
    }
    public void clickOnFindJobsButton(){
        clickOnElement(findJobsBtn);
    }
}
