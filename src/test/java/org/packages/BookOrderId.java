package org.packages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookOrderId extends BaseClass {
	public BookOrderId() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="order_no")
	private  WebElement orderid ;
	@FindBy(id="order_no")
	private  WebElement printConsole ;

	public WebElement getPrintConsole() {
		return printConsole;
	}

	public WebElement getOrderid() {
		return orderid;
	}
	public void orderIdGen() {
		getElementTextbygteAttribute( getPrintConsole());
		getElementText(getOrderid());
	}
	
}
