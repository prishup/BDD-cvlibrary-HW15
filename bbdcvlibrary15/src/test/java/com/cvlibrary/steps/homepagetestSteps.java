package com.cvlibrary.steps;

import com.cvlibrary.pages.HomePage;
import com.cvlibrary.pages.ResultPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class homepagetestSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @And("^I accept iFrame$")
    public void iAcceptIFrame() {
        new HomePage().switchToIframe();
    }

    @And("^I enter \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void iEnter(String jobTitle, String location, String distance) {
        new HomePage().enterJobTitle(jobTitle);
        new HomePage().enterLocation(location);
        new HomePage().selectDistance(distance);
    }

    @And("^I click on more search option$")
    public void iClickOnMoreSearchOption() {
        new HomePage().clickOnMoreSearchOptionLink();
    }

    @And("^I enter \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void iEnter(String minSalary, String maxSalary, String salaryType, String jobType) {
        new HomePage().enterMinSalary(minSalary);
        new HomePage().enterMaxSalary(maxSalary);
        new HomePage().selectSalaryType(salaryType);
        new HomePage().selectJobType(jobType);

    }

    @And("^I click on find job button$")
    public void iClickOnFindJobButton() {
        new HomePage().clickOnFindJobsButton();
    }

    @Then("^I should able to see the search result \"([^\"]*)\"$")
    public void iShouldAbleToSeeTheSearchResult(String result)  {
        Assert.assertEquals(new ResultPage().verifyTheResults(),result,"Validating text");
    }
}
