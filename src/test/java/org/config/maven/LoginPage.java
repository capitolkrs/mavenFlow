package org.config.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractPage {
	
	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this );
	}
	
@FindBy(id="user_login")
WebElement usrName;

@FindBy(id="user_pass")
WebElement usrPass;

@FindBy(id="wp-submit")
WebElement usrSubmit;


public HomePage userLogin(){
usrName.sendKeys("seleniumPoi");
usrPass.sendKeys("taduS#098");
usrSubmit.click();
return new HomePage(driver);


}
}
