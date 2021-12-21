Feature: user is on the adactin hotel app

  Scenario: Verifying facebook  login with valid credentials
    Given user is on the facebook page
    When user should login
      | username | password |
      | surendar | h@123    |
      | bala     |    52352 |
      | gopi     | sdsadsa  |
    Then verify user page
