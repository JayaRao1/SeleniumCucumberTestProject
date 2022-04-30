Feature: Complete the Test form feature

  Scenario Outline: Next page of login scenario
    Given user is already on login page
    When title of login page is Test Project
    And user enters "<username>" and "<password>"
    Then user clicks on login button
    And user enters into home page
    And selects "<country>" from the text box
    And enters users "<address>", "<email>" and "<phone>"
    Then save the details and  clicks on logout button
    Then user quits browser

    Examples: 
      | username             | password | country | address  | email                        | phone      |
      | Jaya Bharathi        |    12345 | India   | Guwahati | saketijayabharathi@gmail.com | 7989612087 |
      | Parameshwar Rao      |    12345 | India   | Andra    | eswarsesu21@gmail.com        | 9502678176 |
      | Sivank Jagannath Rao |    12345 | India   | gajuwaka | saketijayabharathi@gmail.com | 0123456789 |
