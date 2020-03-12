package com.revature.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.revature.pages.Homepage;
import com.revature.runners.Runner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class DriverSteps {
	public static WebDriver driver = Runner.driver;
	public static Homepage homepage = Runner.homepage;

	@Given("The driver is on the homepage")
	public void the_driver_is_on_the_homepage() {
	    driver.get("http://localhost:4200/");
	}
	
	@When("The driver clicks on the login button")
	public void the_driver_clicks_on_the_login_button() {
	     homepage.loginBtn.click();
	}

	@When("The driver types in the login username")
	public void the_driver_types_in_the_login_username() {
	   homepage.usernameInput.sendKeys("SLob");
	}

	@When("The driver types in the login password")
	public void the_driver_types_in_the_login_password() {
	     homepage.passwordInput.sendKeys("slobster");
	}

	@When("The driver clicks log in")
	public void the_driver_clicks_log_in() {
	 driver.manage().timeouts().implicitlyWait( 500, TimeUnit.MILLISECONDS);

		homepage.usernameInput.click();
	}

	@Then("The driver should be on the Profile page")
	public void the_driver_should_be_on_the_Profile_page() {
	  Assert.assertEquals(driver.getTitle(), "Profile Page - RideShare");
	}

	@Given("The driver is on the Profile page")
	public void the_driver_is_on_the_Profile_page() {
	  //this is already checked in the above
	}

	@When("The driver types in the first name")
	public void the_driver_types_in_the_first_name() {
	    homepage.contactFNameInput.sendKeys("Yogi");
	}

	@When("The driver types in the last name")
	public void the_driver_types_in_the_last_name() {
	   homepage.contactLNameInput.sendKeys("Bear");
	}

	@When("The driver types in the email")
	public void the_driver_types_in_the_email() {
	   homepage.contactEmailInput.sendKeys("jellystone@gmail.com");
	}

	@When("The driver types in the phone number")
	public void the_driver_types_in_the_phone_number() {
	    homepage.contactPhoneInput.sendKeys("302-321-9876");
	}

	@When("The driver types in the new username")
	public void the_driver_types_in_the_new_username() {
	    homepage.contactUserInput.sendKeys("booboo");
	}

	@When("The driver types in the new password")
	public void the_driver_types_in_the_new_password() {
	    homepage.contactPassInput.sendKeys("isBestBoi");
	}

	@When("The driver clicks the driver checkbox")
	public void the_driver_clicks_the_driver_checkbox() {
	    homepage.driverCheckBox.click();
	}

	@When("The driver clicks the active checkbox")
	public void the_driver_clicks_the_active_checkbox() {
	   homepage.activeCheckBox.click();
	}

	@When("The driver clicks the save button")
	public void the_driver_clicks_the_save_button() {
	     driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		homepage.contactSaveBtn.click();
	}


	@When("The driver clicks the location button")
	public void the_driver_clicks_the_location_button() {
		homepage.locationEditBtn.click();
	}

	@When("The driver types in the street")
	public void the_driver_types_in_the_street() {
	    homepage.locationStreetInput.sendKeys("1 Palm Dr");
	}


	@When("The driver types in the city")
	public void the_driver_types_in_the_city() {
	   homepage.locationCityInput.sendKeys("New Orleans");
	}

	@When("The driver clicks on the state dropdown button")
	public void the_driver_clicks_on_the_state_dropdown_button() {
	    homepage.locationStateSelect.click();
	}

	@When("The driver clicks on a state")
	public void the_driver_clicks_on_a_state() {
	     homepage.locationStateOption.click();
	}

	@When("The driver types in the zipcode")
	public void the_driver_types_in_the_zipcode() {
	    homepage.locationZipInput.sendKeys("70124");
	}

	@When("The driver clicks the address update button")
	public void the_driver_clicks_the_address_update_button() {
	    homepage.locationUpdateBtn.click();
	    driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	}

	@When("The driver clicks on the city dropdown button")
	public void the_driver_clicks_on_the_city_dropdown_button() {
	    homepage.locationOfficeCitySelect.click();
	}

	@When("The driver clicks on the city")
	public void the_driver_clicks_on_the_city() {
	    homepage.locationOfficeCityOption.click();
	}

	@When("The driver clicks on the office dropdown button")
	public void the_driver_clicks_on_the_office_dropdown_button() {
	    homepage.locationOfficeSelect.click();
	}

	@When("The driver clicks on an office")
	public void the_driver_clicks_on_an_office() {
	    homepage.locationOfficeOption.click();
	}

	@When("The driver clicks on the offices update button")
	public void the_driver_clicks_on_the_offices_update_button() {
	    driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		homepage.locationOfficeUpdateBtn.click();
	}

	@When("The driver clicks on the car button")
	public void the_driver_clicks_on_the_car_button() {
	     homepage.carEditBtn.click();
	}

	@When("The driver types in the make")
	public void the_driver_types_in_the_make() {
	    homepage.carMakeInput.sendKeys("Volkswagen");
	}

	@When("The driver types in the model")
	public void the_driver_types_in_the_model() {
	    homepage.carModelInput.sendKeys("Beetle");
	}

	@When("The driver types in the year")
	public void the_driver_types_in_the_year() {
	     homepage.carYearInput.sendKeys("1958");
	}

	@When("The driver types in the color")
	public void the_driver_types_in_the_color() {
	    homepage.carColourInput.sendKeys("Blue");
	}

	@When("The driver clicks on the seats dropdown button")
	public void the_driver_clicks_on_the_seats_dropdown_button() {
	    homepage.seatSelect.click();
	}

	@When("The driver clicks on the number of seats")
	public void the_driver_clicks_on_the_number_of_seats() {
	    homepage.seatOption.click();
	}

	@When("The driver clicks on the car update button")
	public void the_driver_clicks_on_the_car_update_button() {
	    driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		homepage.carUpdateBtn.click();
	}

	@When("The driver clicks on the profile picture")
	public void the_driver_clicks_on_the_profile_picture() {
	     homepage.userDropDownBtn.click();
	}

	@When("The driver clicks the logout button")
	public void the_driver_clicks_the_logout_button() {
	    driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		homepage.profileBtn.click();
	}

	@Then("The driver should be on the Home page")
	public void the_driver_should_be_on_the_Home_page() {
	    Assert.assertEquals(driver.getTitle(), "Home - RideShare");
	    driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	}

}
