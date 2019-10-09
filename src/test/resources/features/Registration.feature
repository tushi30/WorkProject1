Feature: Giftrete Registration

  Scenario: Valid Registration
    Given I navigate to Giftrete website
    When I click on create account
    And I enter first name  in the name textbox
     And I enter last name in the last name field
    And I enter email
   And I enter mobile number "+447908845453"
   And I enter password
   And I confirm password
   Then User clicks on the register link button
   And error message is displayed
