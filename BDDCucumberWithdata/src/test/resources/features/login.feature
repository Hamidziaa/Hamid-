Feature: Validate a Login Page

Scenario: Validate using valid Credentials 
Given Open browser
Then  Enter url "https://opensource-demo.orangehrmlive.com/"
Then  Enter valid username "Admin" 
Then  enter valid password "admin123"
And   click login