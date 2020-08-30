package com.absa.utilitys;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {

	public static final String path="./Config.properties";
	public Properties pro;
	
	public Readconfig()  
	{
		
		File f=new File(path);
		try {
			FileInputStream fis=new FileInputStream(f);
			pro=new Properties();
			pro.load(fis);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception is"+e.getMessage());
		}	
	}
	
	public String getapplication() 
	{
		String url=pro.getProperty("baseurl");
		return url;
	}
	public String getFirstuserFirstname() {
		String fname = pro.getProperty("Firstname");
		return fname;
	}
	public String getFirstuserlastname() {
		String Lname=pro.getProperty("Lastname");
		return Lname;
	}
	public String getFirstuserUsername() {
		String uname=pro.getProperty("username");
		return uname;
	}
	public String getFirstuserpassword() {
		String pass=pro.getProperty("password");
		return pass;
	}
	public String getFirstuseremail() {
		String email=pro.getProperty("Email");
		return email;
	}
	public String getFirstusermobilenumber() {
		String mnumber=pro.getProperty("mobilenumber");
		return mnumber;
	}
	
	public String getseconduserFirstname() {
		String fname = pro.getProperty("Firstname2");
		return fname;
	}
	public String getseconduserlastname() {
		String Lname=pro.getProperty("Lastname2");
		return Lname;
	}
	public String getseconduserUsername() {
		String uname=pro.getProperty("username2");
		return uname;
	}
	public String getseconduserpassword() {
		String pass=pro.getProperty("password2");
		return pass;
	}
	public String getseconduseremail() {
		String email=pro.getProperty("Email2");
		return email;
	}
	public String getsecondusermobilenumber() {
		String mnumber=pro.getProperty("mobilenumber2");
		return mnumber;
	}
}
