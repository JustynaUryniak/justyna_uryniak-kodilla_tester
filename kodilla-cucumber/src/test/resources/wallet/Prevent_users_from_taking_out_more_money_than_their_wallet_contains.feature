Feature: Prevent users from taking out more money than their wallet contains
  Scenario Outline: User tries to take out more money than their balance
    Given There is $ <amount> in my wallet
    When I withdraw $ <withdraw>
    Then nothing should be dispensed
    And I should be told that I don't have enough money in my wallet for <withdraw>

    Examples:
    | amount | withdraw |
    |   0    |    100   |
    |   50   |    51    |
    |   100  |    200   |

