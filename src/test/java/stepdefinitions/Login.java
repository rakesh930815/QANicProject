package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;

public class Login {

	WebDriver driver= DriverFactory.getDriver();;
	LoginPage loginPage = new LoginPage(driver);
	private AccountPage accountPage;
	@Given("User navigates to login page")
	public void user_navigates_to_login_page() {
		HomePage homepage = new HomePage(driver);
		homepage.selectLoginOption();
	}
	
	@When("^User enters valid email address (.+) into email field$")
	public void User_enters_valid_email_address_into_email_field(String emailText) {
		
		loginPage.enterEmailAddress(emailText);
		
	}
	
	@And("^User enters valid password (.+) into password field$")
	public void user_enters_valid_password_into_password_field(String passwordText) {
	    
		loginPage.enterPassword(passwordText);
		
	}
	
	@And("^User enters valid captcha (.+) into captcha field$")
	public void user_enters_valid_captcha_into_captcha_field(String captchaText) {
	    
		loginPage.enterCaptcha(captchaText);
		
	}

	@And("User clicks on Login button")
	public void user_clicks_on_login_button() {
	    
		loginPage.clickOnLoginButton();
		
	}

	@Then("User should get successfully logged in")
	public void user_should_get_successfully_logged_in() {
		System.out.println("aa");
		//driver.findElement(By.xpath("//em[@mattooltip=\"User Profile\"]")).click();
		Assert.assertTrue(accountPage.displayStatusOfEditYourAccountInformationOption());
		//Assert.assertTrue(loginPage.getWarningMessageText().contains("rakesh  Admin"));
		//Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'rakesh')]")).isDisplayed());
	    
	}


}
