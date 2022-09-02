package org.packages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingHotel  extends BaseClass{
	public BookingHotel() {
		PageFactory.initElements(driver,this);

	}
	
	private  WebElement FirstName ;
	@FindBy(id="last_name")
	private  WebElement LastName ;
	@FindBy(id="address")
	private  WebElement Address ;
	@FindBy(id="cc_num")
	private  WebElement CerditCardType ;
	@FindBy(id="cc_type")
	private  WebElement CardType;
	@FindBy(id="cc_exp_month")
	private  WebElement ExipreMonth ;
	@FindBy(id="cc_exp_year")
	private  WebElement ExpireYear ;
	@FindBy(id="cc_cvv")
	private  WebElement CvvNum ;
	@FindBy(id="book_now")
	private  WebElement BookNum ;
	
	public WebElement getFirstName() {
		return FirstName;
	}
	public WebElement getLastName() {
		return LastName;
	}
	public WebElement getAddress() {
		return Address;
	}
	public WebElement getCerditCardType() {
		return CerditCardType;
	}
	public WebElement getCardType() {
		return CardType;
	}
	public WebElement getExipreMonth() {
		return ExipreMonth;
	}
	public WebElement getExpireYear() {
		return ExpireYear;
	}
	public WebElement getCvvNum() {
		return CvvNum;
	}
	public WebElement getBookNum() {
		return BookNum;
	}
	public void bookAHotels(String firstname,String lastname,String address,
			String creditcardtype,String cardType,String expiremonth,String expireyear,String Cvvnum ) {
		sendValues(getFirstName(),firstname);
		sendValues(getLastName(),lastname);
		sendValues(getAddress(),address);
		sendValues(getCerditCardType(),creditcardtype);
		selectOptbyIndex(getCardType(),5);
		selectOptbyIndex(getExipreMonth(),9);
		selectOptbyIndex(getExpireYear(),2022);		
		sendValues(getCvvNum(),Cvvnum);
		elementClick(getBookNum());
	}
	
}
