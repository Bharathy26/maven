package org.packages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends BaseClass{
	public SearchHotel() {
		PageFactory.initElements(driver,this);
	}
	
@FindBy(id="location")
private  WebElement location ;
@FindBy(id="hotels")
private WebElement selectHotel;
@FindBy(id="room_type")
private WebElement  SelectRoomType;
@FindBy(id="room_nos")
private WebElement  Rooms  ;
@FindBy(id="datepick_in")
private WebElement checkdate;
@FindBy(id="datepick_out")
private WebElement checkoutDate ;
@FindBy(id="adult_room")
private WebElement adultroom ;
@FindBy(id="child_room")
private WebElement childrenroom ;
@FindBy(id="Submit")
private WebElement search ;
public WebElement getLocation() {
	return location;
}
public WebElement getSelectHotel() {
	return selectHotel;
}
public WebElement getSelectRoomType() {
	return SelectRoomType;
}
public WebElement getRooms() {
	return Rooms;
}
public WebElement getCheckdate() {
	return checkdate;
}
public WebElement getCheckoutDate() {
	return checkoutDate;
}
public WebElement getAdultroom() {
	return adultroom;
}
public WebElement getChildrenroom() {
	return childrenroom;
}
public WebElement getSearch() {
	return search;
}

public void searchingHotel(String string,String string2, String getRooms,String getcheckdate,
                           String getCheckoutDate, String getAdultroom,String childrenroom,String getsearch) {
	selectOptbyIndex( getLocation(),1);
	selectOptbyIndex(getSelectHotel(),2);
	selectOptbyIndex(getSelectRoomType(),2);
	selectOptbyIndex( getRooms(),2);
	sendValues(getCheckdate(),"30/9/2022");
	sendValues(getCheckoutDate(),"31/9/2022");
	selectOptbyIndex(getAdultroom(),2);
	selectOptbyIndex(getChildrenroom(),2);
	elementClick(getSearch());
}


}
