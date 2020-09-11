Feature: Is it Friday yet?
  Everybody wants to know when it's Friday

  Scenario: 2020-01-01 isn't Friday
    Given today is Year 2020, Month 1, Day 1
    When I ask whether it's Friday yet
    Then I should be told "Nope"

  Scenario: 2020-01-03 is Friday
    Given today is Year 2020, Month 1, Day 3
    When I ask whether it's Friday yet
    Then I should be told "TGIF"

  Scenario Outline: Today is or is not Friday
    Given today is Year <year>, Month <month>, Day <day>
    When I ask whether it's Friday yet
    Then I should be told "<answer>"

    Examples:
      | year | month | day | answer |
      | 2020 | 1     | 1   | Nope   |
      | 2020 | 1     | 3   | TGIF   |
      | 2019 | 9     | 6   | TGIF   |
      | 2019 | 9     | 7   | Nope   |