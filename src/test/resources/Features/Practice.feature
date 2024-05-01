Feature: Practice

  Background:
    Given Admin enter the client name
    #And Admin tap on evaluate button------->  version 1.0
    #And Client tap on evaluate button------>  version 1.0
    #And Client select the correct option for demo------>  version 1.0


  @practice
  Scenario Outline: Complete the practice
    And Admin enter the client age <age>
    And Admin select matrices evaluation
    Given Admin tap on Begin demo button
    And Admin tap on begin practice button
    And Client select the correct option for practice
    Then The application show the matrices module

    Examples:
      | age |
      | 12  |


