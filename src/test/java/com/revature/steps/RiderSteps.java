package com.revature.steps;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.revature.pages.Homepage;
import com.revature.runners.Runner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RiderSteps {
	public static WebDriver driver = Runner.driver;
	public static Homepage homepage = Runner.homepage;

	@Given("The new rider is on the homepage")
	public void the_new_rider_is_on_the_homepage() {
		driver.get("http://localhost:4200/");
		
	}

	@When("The rider clicks on the register button")
	public void the_rider_clicks_on_the_register_button() throws InterruptedException {
		homepage.signupBtn.click();
	}

	@When("The rider types in the first name")
	public void the_rider_types_in_the_first_name() throws InterruptedException {
		homepage.registerFNameInput.sendKeys("Speed");
		System.out.println("sent keys");
	}

	@When("The rider types in the last name")
	public void the_rider_types_in_the_last_name() {
	    homepage.registerLastNameInput.sendKeys("Racer");
	}

	@When("The rider types in the email")
	public void the_rider_types_in_the_email() {
	    homepage.registerEmailInput.sendKeys("sr@speed.com");
	}

	@When("The rider types in the phone number")
	public void the_rider_types_in_the_phone_number() {
	    homepage.registerPhoneInput.sendKeys("5554443333");
	}

	@When("The rider types in the username")
	public void the_rider_types_in_the_username() {
	   homepage.registerUsernameInput.sendKeys("SpeedRacer");
//		   homepage.registerUsernameInput.sendKeys("SpeedRacer2");

	}

	@When("The rider types in the password")
	public void the_rider_types_in_the_password() {
	    homepage.registerPassInput.sendKeys("herehegoes");
	}

	@When("The rider types in the address")
	public void the_rider_types_in_the_address() {
	    homepage.registerAddressInput.sendKeys("1751 Gentilly Blvd");
	}

	@When("The rider types in the city")
	public void the_rider_types_in_the_city() {
	   homepage.registerCityInput.sendKeys("New Orleans");
	}

	@When("The rider chooses a state")
	public void the_rider_chooses_a_state() {
	     homepage.registerStateSelect.click();
	    homepage.registerStateOption.click();
	}

	@When("The rider types in the zip code")
	public void the_rider_types_in_the_zip_code() {
	    homepage.registerZipInput.sendKeys("70119");
	}

	@When("The rider clicks the submit button")
	public void the_rider_clicks_the_submit_button() {
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		homepage.registerSubmitBtn.click();
	}

	@Then("The registered rider should be on the homepage")
	public void the_registered_rider_should_be_on_the_homepage() throws InterruptedException {
	    Thread.sleep(1000);
		Assert.assertEquals(driver.getTitle(), "Home - RideShare");
	}

	//logging in portion
	
	@Given("The registered rider is on the homepage")
	public void the_registered_rider_is_on_the_homepage() {
		//already checked in the above method
	}

	@When("The rider clicks on the login button")
	public void the_rider_clicks_on_the_login_button() throws InterruptedException {
		Thread.sleep(2000);
		homepage.loginBtn.click();
	}

	@When("The rider types in their username")
	public void the_rider_types_in_their_username() {
	    homepage.usernameInput.sendKeys("SpeedRacer");
	    }

	@When("The rider types in their password")
	public void the_rider_types_in_their_password() {
	    homepage.passwordInput.sendKeys("herehegoes");
	}

	@When("The rider clicks log in")
	public void the_rider_clicks_log_in() {
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		homepage.submitBtn.click();
	}

	@Then("The rider should be on the Driver List page")
	public void the_rider_should_be_on_the_Driver_List_page() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertEquals(driver.getTitle(), "Driver List - RideShare");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}
}
