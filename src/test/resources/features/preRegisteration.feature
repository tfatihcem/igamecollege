@smoke
Feature: Pre-Registration

  Scenario: Verify Pre-registration and reaching out the form
    Given the user is on the home page
    When the user enters Pre Registration Button
    And the user clicks on Apply Now Button
    Then the page is Application form for candidates


    Scenario: The user fills out the Parents / Guardians form
      Given the user clicks on Apply Now Button
      When the user enters the following Parents Guardian credentials
        |firstname |John                     |
        |lastname  |Smith                    |
        |email     |wwww.google.com  |
        |phone     |12343454567              |
        |birthdate |1970/09/28               |
        |address   |Frankfurter Strasse      |
        |city      |Frankfurt                |
        |state     |Hessen                   |
        |zipcode   |60528                    |

      Then the user continue


    When the user enters the following Applicant Information credentials
      |firstname |Jessica              |
      |lastname  |Anna                 |
      |email     |test@test.com        |
      |birthdate |2005/09/28           |


    Then the user goes to Application Fee