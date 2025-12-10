Feature: Customer Policy Management

  Scenario: A user can view the customer policy
    Given the user is on the customer policy page
    When the user clicks on the "View Policy" button
    Then the customer policy details are displayed
