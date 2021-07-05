package com.ismadoro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewEventPage {

    private Actions action;
    private WebDriver driver;

    public NewEventPage(WebDriver driver, Actions action){
        this.driver = driver;
        this.action = action;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="InputName")
    public WebElement inputName;

    @FindBy(id="Input#Players")
    public WebElement inputPlayers;

    @FindBy(id="InputCity")
    public WebElement inputCity;

    @FindBy(id="InputState")
    public WebElement inputState;

    @FindBy(id="InputWhen")
    public WebElement inputWhen;

    @FindBy(id="InputType")
    public WebElement inputType;

    @FindBy(id="InputSkill")
    public WebElement inputSkill;

    @FindBy(id="floatingTextarea")
    public WebElement floatingTextArea;

    @FindBy(id="button-submit")
    public WebElement buttonSubmit;

    @FindBy(id="button-cancel")
    public WebElement buttonCancel;

    @FindBy(id="new-event-error")
    public WebElement newEventError;

}
