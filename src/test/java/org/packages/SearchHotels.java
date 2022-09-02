package org.packages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotels extends BaseClass{
	public SearchHotels() {
		PageFactory.initElements(driver,this);

	}
	@FindBy(xpath="//input[@id='radiobutton_0']")
	private  WebElement Selecthotels ;
	@FindBy(id="continue")
	private  WebElement continues ;
	
	public WebElement getContinues() {
		return continues;
	}
	public WebElement getSelecthotels() {
		return Selecthotels;
	}
	public void searchingHotels( ) {
		elementRightClick(getSelecthotels());
		elementClick(getContinues());
	}
}
