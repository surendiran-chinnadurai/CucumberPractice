Feature: loginwithdata feature of orange HRM
Scenario: this is login senario of HRM
Given you are on the login page 
When your enters the valid user name and password 
		| Admin 		|
		| Admin123 	| 
And  you click on the login button
Then you should be navigate to the home page
