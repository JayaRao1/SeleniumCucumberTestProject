Feature: TestProject login Feature

  Scenario Outline: TestProject login test scenario
    Given user is already on login page
    When title of login page is Test Project
    And user enters "<username>" and "<password>"
    Then user clicks on login button
    And user enters into home page
    Then user quits browser

    Examples: 
      | username             | password |
      | Jaya Bharathi        |    12345 |
      | Parameshwar Rao      |    12345 |
      | Sivank Jagannath Rao |    12345 |
