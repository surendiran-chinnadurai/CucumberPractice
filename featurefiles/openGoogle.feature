Feature: open google and search	
Scenario: open google.co.in and enter text hit search should get results
	Given when user in google.co.in page 
	When enter "java" in search field 
	And hit search button
	Then user get search results of java
