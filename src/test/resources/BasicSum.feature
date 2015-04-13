@Sum
Feature: Testing for a basic sum in Google Calculator

Scenario: Basic sum in google calculator
	Given Google Caclculator is open in Firefox
	When I enter '1'
	And I click plus
	And I enter '3' 
	And I calculate the total
	Then I can see '4' in the results