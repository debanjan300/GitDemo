Feature: Application Login

Scenario: Home page default login
Given User is on NetBAnking landing page
When User login into application with "abc" and "123"
Then Home page is populated 
And Cards are diplayed "true"

Scenario: Home page default login
Given User is on NetBAnking landing page
When User login into application with "def" and "321"
Then Home page is populated 
And Cards are diplayed "false"