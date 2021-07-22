Feature: Cash Withdrawal
  Scenario: Successful withdrawal from a wallet in credit
    Given I have deposit $200 in my wallet
    When I request $30
    Then $30 should be dispensed

   Scenario: Incorrect withdrawal from a wallet
   Given I have deposit $200
   When I request $201
   Then Cash should not be withdrawn

  Scenario: Successful withdrawal resets a wallet
    Given I have deposit $202
    When I request $202
    Then $202 should be dispensed

  Scenario: Zero withdrawal from a wallet in credit
    Given I have deposit $201
    When I request $0
    Then $0 should be dispensed

  Scenario:Incorrect withdrawal not enough money in the wallet
    Given I have deposit -$200
    When I request $10
    Then $0 should be dispensed.

