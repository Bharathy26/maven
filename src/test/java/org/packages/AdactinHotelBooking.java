package org.packages;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class AdactinHotelBooking extends BaseClass{
	
@BeforeClass
public static void beforeClass() {
	browserLanuch1();
	enterUrl("https://adactinhotelapp.com/");
	maxmizeWindow1();
}
@Test
public void bookingsPage() throws IOException {
	
	//1.login
	LoginPage li=new LoginPage();
	li.loginPa(getCellValue("adactin1", 1, 0),getCellValue("adactin1",1,1));

//2.searchHotelpage
SearchHotel s= new SearchHotel();
s.searchingHotel(getCellValue("adactin1", 1, 2),getCellValue("adactin1", 1, 3),
		getCellValue("adactin1", 1, 4),getCellValue("adactin1", 1, 5),getCellValue("adactin1", 1, 6),getCellValue("adactin1", 1, 7),getCellValue("adactin1", 1, 8),getCellValue("adactin1", 1, 9));


//3.Searching Hotels 
 SearchHotels s1=new SearchHotels();
 s1.searchingHotels();

//4.bookinghotels
BookingHotel B=new BookingHotel();
B.bookAHotels(getCellValue("adactin1", 1, 10),getCellValue("adactin1", 1, 11),getCellValue("adactin1", 1, 12),getCellValue("adactin1", 1, 13),getCellValue("adactin1", 1, 14),getCellValue("adactin1", 1, 15),getCellValue("adactin1", 1, 16),getCellValue("adactin1", 1, 17));

//5.bookorderid
BookOrderId b1=new BookOrderId();
b1.orderIdGen();

//6.order cancel
OrderCancel c=new OrderCancel();
c.orderCanel(getCellValue("adactin1", 1, 18));



}
	@AfterClass
public static void Afterclass() {
		
		closeAllWindow();
	}
	
}

