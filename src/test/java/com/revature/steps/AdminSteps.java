package com.revature.steps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.revature.pages.Homepage;
import com.revature.runners.Runner;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminSteps {
	
	public static WebDriver driver = Runner.driver;
	public static Homepage homepage = Runner.homepage;
	
	

@Given("^The user is on the HomePage$")
public void the_user_is_on_the_HomePage() throws Throwable {
	driver.get("http://localhost:4200/home");
}



// login as Admin
@When("^The user clicks on the LoginBtn$")
public void the_user_clicks_on_the_LoginBtn() throws Throwable {
	homepage.loginBtn.click();
}

@When("^The user types in the Username$")
public void the_user_types_in_the_Username() throws Throwable {
	homepage.usernameInput.sendKeys("aford");
}

@When("^The user types in the Password$")
public void the_user_types_in_the_Password() throws Throwable {
	 homepage.passwordInput.sendKeys("apassword");
}


@When("^The user clicks on the SubmitBtn$")
public void the_user_clicks_on_the_SubmitBtn() throws Throwable {
	homepage.submitBtn.click();

}

@Then("The user should be on the Profile Page")
public void the_user_should_be_on_the_Profile_Page() throws InterruptedException {
	Thread.sleep(1000);
	System.out.println(driver.getTitle());
	Assert.assertEquals(driver.getTitle(), "Profile Page - RideShare");
}


// Editing contact
@Given("The user is on the Profile Page")
public void the_user_is_on_the_Profile_Page() {
	//already checked above
}


@When("The user types in the phone number")
public void the_user_types_in_the_phone_number() {
  
	homepage.contactPhoneInput.clear();
   	homepage.contactPhoneInput.sendKeys("333-333-3333");
}

@When("^The user clicks on save$")
public void the_user_clicks_on_save() throws Throwable {
	driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	homepage.contactSaveBtn.click();
}


// Deleting a user

@When("The user clicks on the Edit Employee button")
public void the_user_clicks_on_the_Edit_Employee_button() {
	homepage.editEmployeeBtn.click();
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
}

@When("^The user clicks on the Delete button$")
public void the_user_clicks_on_the_Delete_button() throws Throwable {
	Thread.sleep(1000);
	homepage.page4Employees.click();
	homepage.employeeDeleteBtn.click();
	Thread.sleep(1000);
}


// Promoting a user 
@When("^The user clicks on the Promote button$")
public void the_user_clicks_on_the_Promote_button() throws Throwable {
	Thread.sleep(1000);

	homepage.employeepromoteBtn.click();
    driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
}


@Then("The user should be on the Edit employee page")
public void the_user_should_be_on_the_Edit_employee_page() throws InterruptedException {
	Thread.sleep(1000);
	Assert.assertEquals(driver.getTitle(), "Profile Page - RideShare");
}

@When("^The user clicks on the profile button$")
public void the_user_clicks_on_the_profile_button() throws Throwable {
    homepage.userDropDownBtn.click();

}

@When("^The user clicks on the logout button$")
public void the_user_clicks_on_the_logout_button() throws Throwable {
	driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
	homepage.logoutBtn.click();
}

@Then("The user should be on the Home Page")
public void the_user_should_be_on_the_Home_Page() throws InterruptedException {
	Thread.sleep(1000);
	System.out.println(driver.getTitle());
    Assert.assertEquals(driver.getTitle(), "Home - RideShare");
}


	
	

}