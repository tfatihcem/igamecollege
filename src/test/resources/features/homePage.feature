@igame-wip
Feature: Home page functions

  Scenario: IGC-02 Verify that the ser can access essential links inside "Home Page" under the International Game College opening page
    Given the user is on the home page
    When the user clicks on Programs
    Then the user goes programs page
    And when the user clicks on Online Ed
    Then the user goes Online Ed page
    When the user clicks on Language Ed
    Then the user goes Language Ed page
    And when the user clicks on Grants
    Then the user has the access to Scholarship Program and Apply For Scholarship
    And when the user clicks on Social Life in College
    Then the user has access to the social life page
    And the user has the access to the Carreer development page
    When the user clicks on to the pre registration Form
    Then the user enters Apply For button
    And when the user clicks on Activities
    Then the user goes Activities page
    And when the user clicks on Frequently Asked Questions
    Then the user sees the questions
    When the user Request Information
    Then the user fill out and submit the Contact Form
    And the user sees Announcement on the HomePage
    And the user sees Instagram on the HomePage




