package org.test;

import java.sql.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends BaseClass {
 
	public SearchHotel() {
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(id="location")
	private WebElement txtLocation;
	
	@FindBy(id="hotels")
	private WebElement txtHotel;
	
	@FindBy(id="room_type")
	private WebElement txtRoomType;
	
	@FindBy(id="room_nos")
	private WebElement txtNoOfRoom;
	
	@FindBy(id="datepick_in")
	private WebElement txtInDate;
	
	@FindBy(id="datepick_out")
	private WebElement txtOutDate;
	
	@FindBy(id="adult_room")
	private WebElement txtAdultPerRoom;
	
	@FindBy(id="child_room")
	private WebElement txtChildrensPerRoom;
	
	@FindBy(id="Submit")
	private WebElement txtSearch;

	public WebElement getTxtLocation() {
		return txtLocation;
	}

	public WebElement getTxtHotel() {
		return txtHotel;
	}

	public WebElement getTxtRoomType() {
		return txtRoomType;
	}

	public WebElement getTxtNoOfRoom() {
		return txtNoOfRoom;
	}

	public WebElement getTxtInDate() {
		return txtInDate;
	}

	public WebElement getTxtOutDate() {
		return txtOutDate;
	}

	public WebElement getTxtAdultPerRoom() {
		return txtAdultPerRoom;
	}

	public WebElement getTxtChildrensPerRoom() {
		return txtChildrensPerRoom;
	}

	public WebElement getTxtSearch() {
		return txtSearch;
	}

}
