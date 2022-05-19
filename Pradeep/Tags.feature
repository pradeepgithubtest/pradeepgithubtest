Feature: Facebook functionality testing

		@Reg
  Scenario: Facebook login creadientials testing
    Given User is on the facebook login pageone
    When User should enter the usernameone and password
    And User should click the create new account buttonone
    
   	@Smoke
  Scenario: Facebook login creadientials testing
    Given User is on the facebook login pagetwo
    When User should enter the usernametwo and password
    And User should click the create new account buttontwo
    
   	@Sanity
  Scenario: Facebook login creadientials testing
    Given User is on the facebook login pagethree
    When User should enter the usernamethree and password
    And User should click the create new account buttonthree
    
   	@Smoke
  Scenario: Facebook login creadientials testing
    Given User is on the facebook login pagefour
    When User should enter the usernamefour and password
    And User should click the create new account buttonfour
