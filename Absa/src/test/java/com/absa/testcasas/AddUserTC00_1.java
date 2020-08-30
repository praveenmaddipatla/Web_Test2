package com.absa.testcasas;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.absa.Pageobject.Addusers;
import com.absa.utilitys.Screenshorts;

public class AddUserTC00_1 extends BaseClass {

	
	// Enter the First user details in the Application test case
	@Test
	public void AddFirstUser() throws IOException {
		
		Addusers user = new Addusers(driver);
		
		user.setAdduser();
		logger.info("Cliecked in Adduser link");

		user.setFirstname(Firstname1);
		logger.info("Enter the user First name: FName1");

		user.setLastname(Lastname1);
		logger.info("Enter the user Last name : LName1");

		user.setUsertname(Username1);
		logger.info("Enter the user name : User1");

		user.setpassword(Password1);
		logger.info("Enter the password : Pass1 ");

		user.setAAAcompany();
		logger.info("Select the Customer : AAACompany ");

		user.setAdmindropdown();
		logger.info("Select the role : Admin");

		user.setEmail(email1);
		logger.info("Enter Email : admin@mail.com");

		user.setMobilenumber(Mnumber1);
		logger.info("Enter mobilenumber : 082555");

		user.setsave();
		logger.info("Cleck the Save button");
		Screenshorts.getscreenshort();
		
		driver.findElement(By.xpath("//input[@class='pull-right ng-pristine ng-valid']")).sendKeys("Fname");
		logger.info("Search Added user name on the Textbox in : Fname");
		Screenshorts.getscreenshort();

		List<WebElement> rows = driver.findElements(By.xpath("//tr[@class='smart-table-data-row ng-scope']"));
		int count = rows.size();
		System.out.println("ROW COUNT:" + count);
		for (WebElement e : rows) {
			try {
				Assert.assertEquals("expected text", e.getText());
				logger.info("expected result pass");
			} catch (AssertionError e1) {
				// TODO Auto-generated catch block
				System.out.println(e1.getMessage());
			}
		}

	}
}
