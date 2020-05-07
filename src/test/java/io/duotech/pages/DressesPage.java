package io.duotech.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.duotech.utilities.Driver;

public class DressesPage {
	
	public DressesPage () {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	@FindBy (xpath = "//div[@id='subcategories']//a[.='Casual Dresses']")
	public WebElement casualDresses;
	
	public WebElement getSubcategory(String dress) {
		String customXpath = "//div[@id='subcategories']//a[.='"+dress+"']" ;
		return Driver.getDriver().findElement(By.xpath(customXpath));
	}
	
	public WebElement getColorElement(String color) {
		String customXpath = "//ul[@id='ul_layered_id_attribute_group_3']//a[contains(text(), '" + color + "')]";
		return Driver.getDriver().findElement(By.xpath(customXpath));
	}
	

}
