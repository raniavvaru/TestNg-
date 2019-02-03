
package com.testNGbasics;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class testNg{
	
	@BeforeSuite
	
	public void Setup() {
		System.out.println("Setup system properties for chrome");
	}

	@BeforeClass
	public void LaunchBrowser() {
		System.out.println("Launch chrome browser");
		
	}
	
	@BeforeMethod
	public void EnterUrl() {
		System.out.println("Enter url");
	}
	
	@BeforeTest
	public void LoginMethod() {
		System.out.println("Login metod");
		
	}
}