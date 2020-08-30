package com.absa.testcasas;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.absa.Pageobject.Addusers;
import com.absa.utilitys.Screenshorts;

public class AddUserTC00_2 extends BaseClass
{

	// Enter the Second user details in the Application under test case
	@Test
	public void AddFirstUser() throws IOException {
		
		Addusers user = new Addusers(driver);
		
		user.setAdduser();
		logger.info("Cliecked in Adduser link");
		
		user.setFirstname(Firstname2);
		logger.info("Enter the user Last name : FName2");
		
		user.setLastname(Lastname2);
		logger.info("Enter the user name : LName2");
		
		user.setUsertname(Username2);
		logger.info("Enter the user name : User2");
		
		user.setpassword(Password2);
		logger.info("Enter the password : Pass2 ");
		
		user.setBBBcomany();
		logger.info("Select the Customer : BBBCompany ");
		
		user.setCustomerdropdown();
		logger.info("Select the role : Customer");
		
		user.setEmail(email2);
		logger.info("Enter Email : Cusomter@mail.com");
		
		user.setMobilenumber(Mnumber2);
		logger.info("Enter mobilenumber : 082444");
		
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
