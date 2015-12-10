package org.config.maven;

import org.openqa.selenium.WebDriver;

public class AbstractPage {
	WebDriver driver;
	public AbstractPage(WebDriver driver){
		this.driver=driver;
	}

	public LandingPage naviagetoLandingPage(){
		driver.get("http://www.wordpress.com");
		return new LandingPage(driver);
	}
	
	
}
