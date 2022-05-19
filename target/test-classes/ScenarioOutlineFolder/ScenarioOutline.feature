Feature: Facebook functionality testing

  Scenario Outline: Facebook login creadientials testing
    Given User is on the facebook login page
    When User should enter the "<username>" and "<password>"
    And User should click the create new account button
    Then User should verify the success message

    Examples: 
      | username           | password   |
      | Pradeep            | Pradeep123 |
      | Guna               | Guna123    |
      | Create New Account | click      |

      
      