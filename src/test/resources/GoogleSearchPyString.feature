@Search @GoogleNewSearch
Feature: Testing Google Search
	As a Google User
	I want to search for words Assurity
	So that I can verify Googe search displays Correct Results
	
Scenario: Search for Assurity in Google Search
	Given Google is open in Firefox
	When I type 'Assurity' in search field
	And I click the search button
	Then I see the results for 'Assurity'
	And I can see the following text in the Google Search results Page snippet for 'Assurity':
	"""
	Assurity is a leading software testing consultancy in New Zealand, 
	with offices in Wellington, Auckland and Christchurch. 
	Our software consultants improve
	"""

	