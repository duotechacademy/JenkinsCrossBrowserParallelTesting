package io.duotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.duotech.utilities.Driver;

public class ShoppingCartSummaryPage {
	
	
	public ShoppingCartSummaryPage () {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (xpath = "//td[@class='cart_description']//p[@class='product-name']//a")
	public WebElement productName;
	
	
	@FindBy (id = "product_price_1_1_0")
	public WebElement unitPrice;
	
	@FindBy (name = "quantity_1_1_0_0")
	public WebElement quantity;
	
	@FindBy (id = "total_product_price_1_1_0")
	public WebElement totalBefore;
	
	@FindBy (id = "total_price")
	public WebElement totalAfter;


}
