@login @front-end
Feature: Login Test 
	
	Background: Open browser and navigate to login page
	Given User is on login page 
	
	Scenario: Check login with invalid credentials 
		When User enters invalid username or invalid password 
			|username		|password		|
			|standard_user	|12345			|
			|standard_user  |pass123  		|
			|userName1		|password123	|
			
		And Clicks on login button 
		Then Should be visible message for incorrect credentials 
		
	Scenario: valid login
		When User enter a valid credentials 
		And Clicks on login button 
		Then User should login successfully and get access to inventory page