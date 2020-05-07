package io.duotech.pages;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import io.duotech.utilities.Driver;

public class CreateAccountPage {
	
	
	public CreateAccountPage () {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (id = "customer_firstname")
    public WebElement firstName;
    
    @FindBy (id = "customer_lastname")
    public WebElement lastName;
    
    @FindBy (id = "passwd")
    public WebElement password;
    
    @FindBy (id = "address1")
    public WebElement address;
    
    @FindBy (id = "days")
    public WebElement days;
    
    @FindBy (id = "months")
    public WebElement months;
    
    @FindBy (id = "years")
    public WebElement years;
    
    public void selectDOB() {
        Select s = new Select(days);
        s.selectByValue((new Random().nextInt(30)+1)+"");
        
        s = new Select(months);
        s.selectByValue((new Random().nextInt(12)+1)+"");
        
        s = new Select(years);
        s.selectByValue((new Random().nextInt(120)+1900)+"");
    }
    
    @FindBy (id = "city")
    public WebElement city;
    
    @FindBy (id = "id_state")
    public WebElement stateElement;
    
    public void selectState() {
        Select s = new Select(stateElement);
        s.selectByValue((new Random().nextInt(50)+1+""));
    }
    
    @FindBy (id = "postcode")
    public WebElement zip;
    
    @FindBy (id = "phone_mobile")
    public WebElement phoneNo;
    
    
    @FindBy (id = "submitAccount")
    public WebElement registerButton;
	

}
