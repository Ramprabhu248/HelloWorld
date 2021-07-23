package org.test;

import org.test.BaseClass;

import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInCodes {
	static BaseClass class2;

	@BeforeClass
	public static void beforeClass() {
		class2 = new BaseClass();
		WebDriver drive = class2.getDrive();
		class2.lunchUrl(drive, "https://adactinhotelapp.com/");
	}

	@Before
	public void beforeMethod() {

		Date d = new Date();
		System.out.println(d);
	}

	@Test
	public void tc0() throws IOException {

		LogIn login = new LogIn();

		String dataFromExcel0 = class2.getDataFromExcel(
				"C:\\Users\\hp\\eclipse\\New folder\\Junitt\\Excel Sheet\\HotelBooking.xlsx", "Sheet1", 1, 0);
		WebElement txtUserName = login.getTxtUserName();
		class2.sendKeys(txtUserName, dataFromExcel0);
		String dataFromExcel1 = class2.getDataFromExcel(
				"C:\\Users\\hp\\eclipse\\New folder\\Junitt\\Excel Sheet\\HotelBooking.xlsx", "Sheet1", 1, 1);
		WebElement txtPassWord = login.getTxtPassWord();
		class2.sendKeys(txtPassWord, dataFromExcel1);
		WebElement btnLogIn = login.getBtnLogIn();
		class2.btnClick(btnLogIn);
	}

	@Test
	public void tc1() throws IOException {

		SearchHotel search = new SearchHotel();

		String dataFromExcel2 = class2.getDataFromExcel(
				"C:\\Users\\hp\\eclipse\\New folder\\Junitt\\Excel Sheet\\HotelBooking.xlsx", "Sheet1", 1, 2);
		WebElement txtLocation = search.getTxtLocation();
		class2.dropDown(txtLocation, dataFromExcel2);
		String dataFromExcel3 = class2.getDataFromExcel(
				"C:\\Users\\hp\\eclipse\\New folder\\Junitt\\Excel Sheet\\HotelBooking.xlsx", "Sheet1", 1, 3);
		WebElement txtHotel = search.getTxtHotel();
		class2.dropDown(txtHotel, dataFromExcel3);
		String dataFromExcel4 = class2.getDataFromExcel(
				"C:\\Users\\hp\\eclipse\\New folder\\Junitt\\Excel Sheet\\HotelBooking.xlsx", "Sheet1", 1, 4);
		WebElement txtRoomType = search.getTxtRoomType();
		class2.dropDown(txtRoomType, dataFromExcel4);
		String dataFromExcel5 = class2.getDataFromExcel(
				"C:\\Users\\hp\\eclipse\\New folder\\Junitt\\Excel Sheet\\HotelBooking.xlsx", "Sheet1", 1, 5);
		WebElement txtNoOfRoom = search.getTxtNoOfRoom();
		class2.dropDown(txtNoOfRoom, dataFromExcel5);
		String dataFromExcel6 = class2.getDataFromExcel(
				"C:\\Users\\hp\\eclipse\\New folder\\Junitt\\Excel Sheet\\HotelBooking.xlsx", "Sheet1", 1, 6);
		WebElement txtInDate = search.getTxtInDate();
		class2.sendKeys(txtInDate, dataFromExcel6);
		String dataFromExcel07 = class2.getDataFromExcel(
				"C:\\Users\\hp\\eclipse\\New folder\\Junitt\\Excel Sheet\\HotelBooking.xlsx", "Sheet1", 1, 7);
		WebElement txtOutDate = search.getTxtOutDate();
		class2.sendKeys(txtOutDate, dataFromExcel07);
		String dataFromExcel8 = class2.getDataFromExcel(
				"C:\\Users\\hp\\eclipse\\New folder\\Junitt\\Excel Sheet\\HotelBooking.xlsx", "Sheet1", 1, 8);
		WebElement txtAdultPerRoom = search.getTxtAdultPerRoom();
		class2.dropDown(txtAdultPerRoom, dataFromExcel8);
		String dataFromExcel9 = class2.getDataFromExcel(
				"C:\\Users\\hp\\eclipse\\New folder\\Junitt\\Excel Sheet\\HotelBooking.xlsx", "Sheet1", 1, 9);
		WebElement txtChildrensPerRoom = search.getTxtChildrensPerRoom();
		class2.dropDown(txtChildrensPerRoom, dataFromExcel9);
		WebElement txtSearch = search.getTxtSearch();
		class2.btnClick(txtSearch);
	}

	@Test
	public void tc2() {
		ConfirmHotel hotel = new ConfirmHotel();

		WebElement textRadioBtn = hotel.getTextRadioBtn();
		class2.btnClick(textRadioBtn);
		WebElement continueClick = hotel.getContinueClick();
		class2.btnClick(continueClick);
	}

	@Test
	public void tc3() throws IOException {
		BookHotel bkHotel = new BookHotel();
		String dataFromExcel10 = class2.getDataFromExcel(
				"C:\\Users\\hp\\eclipse\\New folder\\Junitt\\Excel Sheet\\HotelBooking.xlsx", "Sheet1", 1, 10);

		WebElement firstName = bkHotel.getFirstName();
		class2.sendKeys(firstName, dataFromExcel10);
		String dataFromExcel11 = class2.getDataFromExcel(
				"C:\\Users\\hp\\eclipse\\New folder\\Junitt\\Excel Sheet\\HotelBooking.xlsx", "Sheet1", 1, 11);
		WebElement lastName = bkHotel.getLastName();
		class2.sendKeys(lastName, dataFromExcel11);
		String dataFromExcel12 = class2.getDataFromExcel(
				"C:\\Users\\hp\\eclipse\\New folder\\Junitt\\Excel Sheet\\HotelBooking.xlsx", "Sheet1", 1, 12);
		WebElement adress = bkHotel.getAdress();
		class2.sendKeys(adress, dataFromExcel12);
		String dataFromExcel13 = class2.getDataFromExcel(
				"C:\\Users\\hp\\eclipse\\New folder\\Junitt\\Excel Sheet\\HotelBooking.xlsx", "Sheet1", 1, 13);
		WebElement creditCard = bkHotel.getCreditCard();
		class2.sendKeys(creditCard, dataFromExcel13);
		
		WebElement cardType = bkHotel.getCardType();
		class2.dropDown(cardType, "VISA");
		WebElement expiryMonth = bkHotel.getExpiryMonth();
		class2.dropDown(expiryMonth, "6");
		WebElement expiryYear = bkHotel.getExpiryYear();
		class2.dropDown(expiryYear, "2021");
		String dataFromExcel14= class2.getDataFromExcel(
				"C:\\Users\\hp\\eclipse\\New folder\\Junitt\\Excel Sheet\\HotelBooking.xlsx", "Sheet1", 1, 14);
		WebElement ccvNumber = bkHotel.getCcvNumber();
		class2.sendKeys(ccvNumber, dataFromExcel14);
		WebElement bookNow = bkHotel.getBookNow();
		class2.btnClick(bookNow);
	}

	@After
	public void afterMethod() {
		Date d = new Date();
		System.out.println(d);
	}

	@AfterClass
	public static void afterClassMethod() {

		System.out.println("Project Completed");
	}

}
