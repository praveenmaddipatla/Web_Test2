package com.absa.Pageobject;

import java.util.jar.Attributes.Name;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

// Way2Autoamtion AddUser name Page

public class Addusers {
	WebDriver driver;

	public Addusers(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Webelement locators

	@FindBy(xpath = "//button[@class='btn btn-link pull-right']")
	WebElement AddUser;
	@FindBy(name = "FirstName")
	WebElement Firstname;
	@FindBy(name = "LastName")
	WebElement Lastname;
	@FindBy(name = "UserName")
	WebElement username;
	@FindBy(name = "Password")
	WebElement password;
	@FindBy(name = "optionsRadios")
	WebElement AAAbutton;
	@FindBy(name = "optionsRadios")
	WebElement BBBbutton;
	@FindBy(xpath = "//select[@name='RoleId']")
	WebElement droupdown;
	@FindBy(name = "Email")
	WebElement email;
	@FindBy(name = "Mobilephone")
	WebElement mobilenumber;
	@FindBy(xpath = "//button[text()='Save']")
	WebElement save;

	public void setAdduser() {
		AddUser.click();
	}

	public void setFirstname(String firstname) {
		Firstname.sendKeys(firstname);
	}

	public void setLastname(String lastname) {
		Lastname.sendKeys(lastname);
	}

	public void setUsertname(String Username) {
		username.sendKeys(Username);
	}

	public void setpassword(String passwrd) {
		password.sendKeys(passwrd);
	}

	public void setAAAcompany() {
		AAAbutton.click();
	}

	public void setBBBcomany() {

		BBBbutton.click();
	}

	public void setAdmindropdown() {
		Select select = new Select(droupdown);
		select.selectByValue("2");

	}

	public void setCustomerdropdown() {
		Select select = new Select(droupdown);
		select.selectByValue("1");

	}

	public void setEmail(String Email) {
		email.sendKeys(Email);

	}

	public void setMobilenumber(String number) {
		mobilenumber.sendKeys(number);

	}

	public void setsave() {

		save.click();
	}
}
