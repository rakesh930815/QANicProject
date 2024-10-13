Feature: Login functionality

Scenario Outline: Login with valid credentials
Given User navigates to login page
When User enters valid username address <username> into username field
And User enters valid password <password> into password field
And User enters valid captcha <captcha> into captcha field
And User clicks on Login button
Then User should get successfully logged in
Examples:
|username |password |captcha |
|rakesh_123 |Aeo@1234 |123456 |

Scenario: Login with wrong credentials
Given User navigates to login page
When User enters wrong username address "xyzb_123" into username field
And User enters wrong password "Aeo@123456" into password field
And User enters wrong captcha "123457" into captcha field
And User clicks on Login button
Then User should get a proper warning message about credentials mismatch

Scenario: Login with wrong username and valid password and valid captcha
Given User navigates to login page
When User enters wrong username address "rakesh_12345" into username field
And User enters valid password Aeo@1234 into password field
And User enters valid captcha 123457 into captcha field
And User clicks on Login button
Then User should get a proper warning message about credentials mismatch

Scenario: Login with valid username and wrong password and valid captcha
Given User navigates to login page
When User enters valid username address rakesh_123 into username field
And User enters wrong password "Aeo@123445" into password field
And User enters valid captcha 123456 into captcha field
And User clicks on Login button
Then User should get a proper warning message about credentials mismatch

Scenario: Login with valid username and valid password and wrong captcha
Given User navigates to login page
When User enters valid username address rakesh_123 into username field
And User enters valid password Aeo@1234 into password field
And User enters wrong captcha "456789" into captcha field
And User clicks on Login button
Then User should get a proper warning message about credentials mismatch
