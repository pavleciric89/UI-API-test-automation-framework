@back-end 
Feature: Back-end tests 

Scenario: Api POST login saccessfully 
	Given User perform POST operation for "/login" with body 
		|email 				|password		|
		|eve.holt@reqres.in	|cityslicka		|
		
	Then Status code should be 200 and token: "QpwL5tke4Pnpja7X4" 
	
Scenario: Api GET list of users 
	Given User perform GET method for "/users" 
	Then Should be 6 items per page and first_name "George" 
	
Scenario: Verify DELETE operation user after POST 
	Given Perform POST operation for "/users" with body 
		|name		|job				|
		|Pavle		|developer in tests	|
	And Perform DELETE operation for "/users/2" 
	Then Should be response status code 204 