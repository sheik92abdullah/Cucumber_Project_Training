@googleSearch
Feature: This is to search for Sheik Abdullah and arun kumar
@searchSheik
Scenario: Google Search Senerio
Given user is entering Google.com
When user is typing the search term "Sheik Abdullah"
And press the enterkey
Then user should see the search result "sheik"

@searchArun
Scenario: Google Search Senerio
Given user is entering Google.com
When user is typing the search term "Arun Kumar"
And press the enterkey
Then user should see the search result "arun"