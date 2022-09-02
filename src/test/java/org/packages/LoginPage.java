package org.packages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	

	@FindBy(id="username")
	 private WebElement txtusername;
	@FindBy(id="password")
	private WebElement txtpassword;
	@FindBy(id="login")
	private WebElement login;
	

public WebElement getTxtusername() {
		return txtusername;
	}
	public WebElement getTxtpassword() {
		return txtpassword;
	}
	public WebElement getLogin() {
		return login;
	
	}
	public void loginPa(String username, String password) {
		sendValues(getTxtusername(), username);
		sendValues(getTxtpassword(), password);
		elementClick(getLogin());

	}
	
	
}
