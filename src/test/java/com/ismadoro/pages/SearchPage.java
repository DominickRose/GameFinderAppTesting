package com.ismadoro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

    private WebDriver driver;

    public SearchPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="player-result-row-1")
    public WebElement playerResult1;

    @FindBy(id="event-result-row-1")
    public WebElement eventResultRow1;

    @FindBy(id="num-search-results")
    public WebElement numSearchResults;

    @FindBy(id="InputState")
    public WebElement inputState;

    @FindBy(id="filter-results-button")
    public WebElement filterResultsButton;

    @FindBy(id="InputType")
    public WebElement inputType;

    @FindBy(id="InputSkill")
    public WebElement inputSkill;

    @FindBy(id="InputWhen")
    public WebElement inputWhen;

}
