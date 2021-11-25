package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[@id=\"spanMessage\"]")
	private WebElement usernamecannotbeempty;
	@FindBy(xpath = "//input[@id=\"txtUsername\"]")
	private WebElement username;
	@FindBy(xpath = "//input[@id=\"txtPassword\"]")
	private WebElement password;
	@FindBy(xpath = "//input[@id=\"btnLogin\"]")
	private WebElement loginbutton;
	public WebElement getUsername() {
		return username;
	}
	public void setUsername(String val) {
		this.username.sendKeys(val);
	}
	public WebElement getPassword() {
		return password;
	}
	public void setPassword(String val) {
		this.password.sendKeys(val);
	}
	public WebElement getLoginbutton() {
		return loginbutton;
	}
	public WebElement getUsernamecannotbeempty() {
		return usernamecannotbeempty;
	}
	

}
