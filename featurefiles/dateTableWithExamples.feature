@passitive
Feature: loginwithdataexamples feature of orange HRM
Scenario: this is login senario of HRM
Given you are on the login page 
When your enters the valid user name and password
| username	| password 	|
| Admin		 	| admin123 	|  
And  you click on the login button
Then you should be navigate to the home page

