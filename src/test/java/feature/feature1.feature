Scenario: User can successfully register
Given the user accesses the registration page
When the user fills out the registration form with the following information:
| First Name | Last Name | Email                | Password     |
| John       | Doe       | john.doe@email.com   | password123  |
And the user submits the form
Then the user should be redirected to the login page
And a confirmation message should be displayed