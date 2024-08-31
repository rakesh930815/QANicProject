package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonUtils;
import utils.ElementUtils;

public class LoginPage {

	WebDriver driver;
	private ElementUtils elementUtils;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver,this);
		elementUtils = new ElementUtils(driver);

	}

	@FindBy(xpath="//input[@id='mat-input-0']")
	private WebElement emailField;

	@FindBy(xpath="//input[@id='mat-input-1']")
	private WebElement passwordField;

	@FindBy(xpath="//input[@id='mat-input-2']")
	private WebElement captchaField;

	@FindBy(xpath="//button[contains(text(),'Login')]")
	private WebElement loginButton;
	
	
	@FindBy(xpath="//div[contains(@class,'alert-danger')]")
	private WebElement warningMessage;
	
	@FindBy(linkText=" rakesh  Admin ")
	private WebElement successMessage;

	public void enterEmailAddress(String emailText) {
		elementUtils.typeTextIntoElement(emailField, emailText,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void enterPassword(String passwordText) {
		
		elementUtils.typeTextIntoElement(passwordField, passwordText,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}
	
	public void enterCaptcha(String captchaText) {

		elementUtils.typeTextIntoElement(captchaField, captchaText,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void clickOnLoginButton() {

		elementUtils.clickOnElement(loginButton,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}
	

}
