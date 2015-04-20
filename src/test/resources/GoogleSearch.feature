@Search @GoogleNewSearch
Feature: Testing Google Search
	As a Google User
	I want to search for words Assurity, Java and Ruby
	So that I can verify Googe search displays Correct Results

@SearchAssurity
Scenario: Search for Assurity in Google Search
	Given Google is open in Firefox
	When I type 'Assurity' in search field
	And I click the search button
	Then I see the results for 'Assurity'

@SearchJava
Scenario: Search for Assurity in Google Search
	Given Google is open in Firefox
	When I type 'Java' in search field
	And I click the search button
	Then I see the results for 'Java'

@SearchRuby
Scenario: Search for Assurity in Google Search
	Given Google is open in Firefox
	When I type 'Ruby' in search field
	And I click the search button
	Then I see the results for 'Ruby'


#clean test "-Dcucumber.options=--tags @Sum --format json-pretty:target/cucumber-report-myReport.json --format html:target/cucumber-html-report-myReport"