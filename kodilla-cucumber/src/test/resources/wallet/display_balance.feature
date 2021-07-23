Feature: Display balance

  Scenario Outline: User checks the balance of their wallet
    Given there is $ <amount> in my wallet
    When I check the balance of my wallet
    Then I should see that the balance is $ <accountBalance>

    Examples:
    | amount | accountBalance |
    | 100            |    100    |
    | 50             |    50    |
    | 200            |    200    |
