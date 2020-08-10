Feature: Test online calculator scenarios
Scenario Outline: Test Addition, Subtraction, Multiplication, Division and CE functionalities
Given Open chrome browser and start application
When I enter following values and press CE button
			|value1 | <1>|
			|value2 | <6>|
			|operator | +|			
Then I should be able to see
			|	expected |<expected>|
Examples:
		| value1  		| value2 		| operator			| expected	|
    	| 	2 			|   2			|		/			| 1			|