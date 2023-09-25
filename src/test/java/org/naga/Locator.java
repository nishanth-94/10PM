package org.naga;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locator extends BaseClass {
	public Locator() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "username")
	public WebElement username;

	@FindBy(id = "password")
	public WebElement password;

	@FindBy(xpath = "//input[@type='Submit']")
	public WebElement login;

	@FindBy(xpath = "//a[@href='BookedItinerary.php']")
	private WebElement bookHistory;

	@FindBy(name = "cancelall")
	private WebElement cancel;

	public WebElement getCancel() {
		return cancel;
	}

	public WebElement getBookHistory() {
		return bookHistory;
	}

	public WebElement getLogin() {
		return login;
	}

	@FindBy(xpath = "//select[@name='location']")
	public WebElement location;

	@FindBy(xpath = "//select[@name='hotels']")
	public WebElement hotel;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRoomNo() {
		return roomNo;
	}

	public WebElement getChckindate() {
		return chckindate;
	}

	public WebElement getChckoutdate() {
		return chckoutdate;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getContinues() {
		return continues;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardnumber() {
		return cardnumber;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getMonthselect() {
		return monthselect;
	}

	public WebElement getSelectyear() {
		return selectyear;
	}

	public WebElement getCcv() {
		return ccv;
	}

	public WebElement getBooknow() {
		return booknow;
	}

	public WebElement getOrdernumber() {
		return ordernumber;
	}

	@FindBy(xpath = "//select[@name='room_type']")
	public WebElement roomType;

	@FindBy(xpath = "//select[@name='room_nos']")
	public WebElement roomNo;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	public WebElement chckindate;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	public WebElement chckoutdate;

	@FindBy(xpath = "//select[@id='adult_room']")
	public WebElement adult;

	@FindBy(xpath = "//select[@id='child_room']")
	public WebElement child;

	@FindBy(id = "Submit")
	public WebElement search;

	@FindBy(xpath = "//input[@type='radio']")
	public WebElement radio;

	@FindBy(id = "continue")
	public WebElement continues;

	@FindBy(xpath = "(//input[@type='text'])[11]")
	public WebElement firstname;

	@FindBy(xpath = "(//input[@type='text'])[12]")
	public WebElement lastname;

	@FindBy(id = "address")
	public WebElement address;

	@FindBy(xpath = "(//input[@type='text'])[13]")
	public WebElement cardnumber;

	@FindBy(xpath = "//select[@name='cc_type']")
	public WebElement cardtype;

	@FindBy(xpath = "//select[@name='cc_exp_month']")
	public WebElement monthselect;

	@FindBy(xpath = "//select[@name='cc_exp_year']")
	public WebElement selectyear;

	@FindBy(xpath = "(//input[@type='text'])[14]")
	public WebElement ccv;

	@FindBy(xpath = "(//input[@type='button'])[1]")
	public WebElement booknow;

	@FindBy(xpath = "(//input[@type='text'])[16]")
	public WebElement ordernumber;

}
