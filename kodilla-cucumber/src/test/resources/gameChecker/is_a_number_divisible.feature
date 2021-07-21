Feature: Is a number divisible?
  "Fizz" returned when a number is divisible by 3
  "Buzz" returned when a number is divisible by 5
  "FizzBuzz" is returned when a number is divisible by 3 and 5
  In all other cases, return "None"


  Scenario Outline: Number is divisible or not
    Given The number is <number>
    When I divide them
    Then I expect the result to be <result>

  Examples:
    | number | result |
    | three      | "Fizz" |
    | fifteen     | "FizzBuzz" |
    | sixteen      | "None"     |
    | twenty-one     | "Fizz"     |
    | thirty     | "FizzBuzz" |
    | fifty     | "Buzz"     |
    | fifty-one     | "Fizz"     |
    | sixty     | "FizzBuzz" |
    | sixty-five     | "Buzz"     |
    | ninety     | "FizzBuzz" |

