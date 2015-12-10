package org.config.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestSuite  {
	WebDriver driver;
	
	@BeforeClass
	public void configTest(){
		driver=new FirefoxDriver();
		
	}
	
	@Test
	public void runTest(){
		AbstractPage navTolandingPage=new AbstractPage(driver);
		LandingPage onLandingPage=navTolandingPage.naviagetoLandingPage();
		LoginPage onloginPage=onLandingPage.clickLogin();
		HomePage onHomePage=onloginPage.userLogin();
	}
	
}
