Feature: Demo

  Background:
    Given Admin enter the client name


  @demo
  Scenario Outline: Complete the demo
    And Admin enter the client age <age>
    And Admin select matrices evaluation
    #And Admin tap on evaluate button------->  version 1.0
    #And Client tap on evaluate button------>  version 1.0
    Given Admin tap on Begin demo button
    #And Client select the correct option for demo------>  version 1.0
    Then The application show the practice module

    Examples:
      | age |
      | 12  |