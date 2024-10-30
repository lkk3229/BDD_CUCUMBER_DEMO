Feature: OrangeHRM Login
  Scenario: Logo presence on OrangeHRM Home Page
    Given I launch chrome browser
    When I open orange hrm homepage
    Then I verify that the logo present on page
    And  close browser
