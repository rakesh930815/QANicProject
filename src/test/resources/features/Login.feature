Feature: Login functionality

Scenario Outline: Login with valid credentials
Given User navigates to login page
When User enters valid email address <username> into email field
And User enters valid password <password> into password field
And User enters valid captcha <captcha> into captcha field
And User clicks on Login button
Then User should get successfully logged in
Examples:
|username	  |password	  |captcha |
|rakesh_123	|Aeo@1234		|123456  |