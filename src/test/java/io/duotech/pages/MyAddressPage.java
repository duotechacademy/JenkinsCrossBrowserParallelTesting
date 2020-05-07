package io.duotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.duotech.utilities.Driver;

public class MyAddressPage {
	
	
		
		public MyAddressPage () {
			PageFactory.initElements(Driver.getDriver(), this);
		}
		
		@FindBy (xpath  = "//div[@class='addresses']//li[2]/span[1]")
		public WebElement firstName;
		
		@FindBy (xpath  = "//div[@class='addresses']//li[2]/span[2]")
		public WebElement lastName;
		
		@FindBy (xpath  = "//div[@class='columns-container']//li[4]")
		public WebElement address;
		
		
		@FindBy (xpath  = "//div[@class='columns-container']//li[5]/span[1]")
		public WebElement city;
		
		@FindBy (xpath  = "//div[@class='columns-container']//li[5]/span[2]")
		public WebElement state;
		
		@FindBy (xpath  = "//div[@class='columns-container']//li[5]//span[3]")
		public WebElement zip;

}
