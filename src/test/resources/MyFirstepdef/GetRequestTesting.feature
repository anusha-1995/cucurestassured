Feature: First rest assured test22



Scenario: Test my get method22
Given user start the rest assured test
When user hit the get request
Then user checks the count or size 
Then  user checks at path "MRData.CircuitTable.circuits.circuitId[0]" with the "albert_park" value