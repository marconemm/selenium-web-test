#language: en
#encoding: utf-8

Feature: Login
	
	Scenario: Invalid Credentials
	When I inform the user "Ad"
	And inform the password "asd"
	And click on the login button
	Then the sistem shows the invalid credentials user message
  
  @successLogin
  Scenario: Valid Credentials
	When I inform the user "Admin"
	And inform the password "admin123"
	And click on the login button
	Then the system changes to the dashborad page
	Then welcomes the user "Paul"
