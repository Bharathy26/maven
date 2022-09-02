package org.packages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderCancel extends BaseClass {
	public OrderCancel() {
		PageFactory.initElements(driver,this);

	}
	@FindBy(id="order_id_text")
	private  WebElement txtSearchOrderId ;
	@FindBy(id="search_hotel_id")
	private  WebElement bntGo ;	
	@FindBy(id="check_all")
	private  WebElement bntCheckAll ;
	@FindBy(name="cancelall")
	private  WebElement bntCancelAll ;
	public WebElement getTxtSearchOrderId() {
		return txtSearchOrderId;
	}
	public WebElement getBntGo() {
		return bntGo;
	}
	public WebElement getBntCheckAll() {
		return bntCheckAll;
	}
	public WebElement getBntCancelAll() {
		return bntCancelAll;
	}
	public void orderCanel(String orderid) {
		sendValues(txtSearchOrderId, orderid);
		elementClick( bntGo);
		elementClick( bntCheckAll);
		elementClick(bntCancelAll);
	}
	
	
	

	}

	

