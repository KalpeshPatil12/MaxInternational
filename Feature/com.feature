Feature: Facebook login feature


Scenario: Facebook login test Scenario

Given user is already on login page
When title of login page is Facebook
Then  user enter "8530515733" and "Kalpesh@123"
Then user click on login button
Then user is on home page
Then user close the browser
