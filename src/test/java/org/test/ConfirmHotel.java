package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmHotel extends BaseClass {
	
	public ConfirmHotel() {
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="radiobutton_0")
	private WebElement textRadioBtn;
	
	@FindBy(id="continue")
	private WebElement continueClick;

	public WebElement getContinueClick() {
		return continueClick;
	}

	public WebElement getTextRadioBtn() {
		return textRadioBtn;
	}
	
	
	
	}
	

