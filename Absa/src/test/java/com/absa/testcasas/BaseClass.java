package com.absa.testcasas;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.absa.utilitys.Readconfig;

public class BaseClass {

	Readconfig Readconfig = new Readconfig();
	public String Baseurl = Readconfig.getapplication();
	public String Firstname1 = Readconfig.getFirstuserFirstname();
	public String Lastname1 = Readconfig.getFirstuserlastname();
	public String Username1 = Readconfig.getFirstuserUsername();
	public String Password1 = Readconfig.getFirstuserpassword();
	public String email1 = Readconfig.getFirstuseremail();
	public String Mnumber1 = Readconfig.getFirstusermobilenumber();

	public String Firstname2 = Readconfig.getseconduserFirstname();
	public String Lastname2 = Readconfig.getseconduserlastname();
	public String Username2 = Readconfig.getseconduserUsername();
	public String Password2 = Readconfig.getseconduserpassword();
	public String email2 = Readconfig.getseconduseremail();
	public String Mnumber2 = Readconfig.getsecondusermobilenumber();

	public static WebDriver driver;
	public static Logger logger;

	// launch the Browser and navigate the UrL in BeforeClass annotation in TestNG
	@BeforeClass
	public void setup() {

		
		driver = new FirefoxDriver();
		logger = Logger.getLogger("Absa");
		PropertyConfigurator.configure("log4j.properties");

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get(Baseurl);
	}

	
	@AfterClass
	public void teardoem() {
		driver.quit();
	}
}
