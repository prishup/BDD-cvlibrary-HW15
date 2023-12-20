package com.cvlibrary.pages;

import com.cvlibrary.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage extends Utility {
    private static final Logger log = LogManager.getLogger(ResultPage.class);

    public ResultPage() {
        PageFactory.initElements(driver, this);
    }
@CacheLookup
    @FindBy(xpath ="//div[@class=\"page-main\"]/div[1]/div[1]" )
    WebElement resultText;
    public String verifyTheResults() {
        return getTextFromElement(resultText);
    }
}
