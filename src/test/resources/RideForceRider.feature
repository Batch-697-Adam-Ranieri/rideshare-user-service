Feature: Rider logs in and uses rider services
	
		Scenario: Rider registering
			Given The new rider is on the homepage
			When  The rider clicks on the register button
			When The rider types in the first name
			When The rider types in the last name
			When The rider types in the email
			When The rider types in the phone number
			When The rider types in the username
			When The rider types in the password
			When  The rider types in the address
			When The rider types in the city
			When The rider chooses a state
			When The rider types in the zip code
			When The rider clicks the submit button
			Then The registered rider should be on the homepage

		Scenario: Rider logging in
			Given The registered rider is on the homepage
			When  The rider clicks on the login button
			And The rider types in their username
			And The rider types in their password
			And The rider clicks log in
			Then The rider should be on the Driver List page
		
#		Scenario: Rider chooses a driver

#		Scenario: Rider edits profile