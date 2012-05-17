Feature: As a developer I would like to view the production logs


  Scenario: Simple log
    Given the application logs a failure
    When I retrieve the logs
    Then I should see the failure