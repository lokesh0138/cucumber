Feature: Login into application
Scenario: Validate whether user able to login successfully
Given Verify whether user landed to "https://www.facebook.com/login/web/"
And Click on login button
When user enter userid and Password 
Then Login should be successful
And navigate to next page