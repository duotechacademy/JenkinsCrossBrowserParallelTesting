package io.duotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.duotech.utilities.Driver;

public class LoginPage {
	
	public LoginPage () {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (id = "email")
	public WebElement emailInputBox;
	
	@FindBy (id = "passwd")
	public WebElement passwordInputBox;
	
	@FindBy (id = "SubmitLogin")
	public WebElement signInButton;
	
	@FindBy (id = "email_create")
	public WebElement createAccountEmail;
	
	@FindBy (id = "SubmitCreate")
	public WebElement createAccountButton;

	@FindBy (xpath = "//a[@title='Addresses']")
	public WebElement  myAddress;

}
