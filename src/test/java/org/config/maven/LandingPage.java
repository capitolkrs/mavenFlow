package org.config.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends AbstractPage {
	
	public LandingPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this );
	}
	
	@FindBy(linkText="Log In")
	WebElement loginLink;
	
	public LoginPage clickLogin(){
		loginLink.click();
		return new LoginPage(driver);
		
	}
	
	
	

}
