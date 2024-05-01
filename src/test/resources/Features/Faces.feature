Feature: Faces

  Background:

    Given Admin enter the client name


  @faces
  Scenario Outline: Complete the faces test
    And Admin enter the client age <age>
    And Admin select faces evaluation
    And Admin tap on start audio
    And Admin tap on begin practice button for faces
    And Client select the correct option for faces practice
    And Admin tap on start audio
    And Admin tap on begin item button for faces
    And Client select faces the correct option for item 1
    And Client select faces the correct option for item 2
    And Client select faces the correct option for item 3
    And Client select faces the correct option for item 4
    And Client select faces the correct option for item 5
    And Client select faces the correct option for item 6
    And Client select faces the correct option for item 7
    And Client select faces the correct option for item 8
    And Client select faces the correct option for item 9
    And Client select faces the correct option for item 10
    And Client select faces the correct option for item 11
    And Client select faces the correct option for item 12
    And Client select faces the correct option for item 13
    And Client select faces the correct option for item 14
    And Client select faces the correct option for item 15
    And Client select faces the correct option for item 16
    And Client select faces the correct option for item 17
    And Client select faces the correct option for item 18
    And Admin tap on start audio
    And Admin tap on begin practice button for second part of the faces
    And Client select the correct option for faces practice second part
    And Admin tap on start audio
    And Admin tap on begin item button for faces second part
    And Client select faces the correct second part option for item 1
    And Client select faces the correct second part option for item 2
    And Client select faces the correct second part option for item 3
    And Client select faces the correct second part option for item 4
    And Client select faces the correct second part option for item 5
    And Client select faces the correct second part option for item 6
    And Client select faces the correct second part option for item 7
    And Client select faces the correct second part option for item 8
    And Client select faces the correct second part option for item 9
    And Client select faces the correct second part option for item 10
    And Client select faces the correct second part option for item 11
    And Client select faces the correct second part option for item 12
    And Client select faces the correct second part option for item 13
    And Client select faces the correct second part option for item 14
    And Client select faces the correct second part option for item 15
    And Client select faces the correct second part option for item 16
    And Client select faces the correct second part option for item 17
    And Client select faces the correct second part option for item 18
    And Client select faces the correct second part option for item 19
    And Client select faces the correct second part option for item 20
    And Admin tap on start audio
    And Admin tap on begin practice button for memory faces
    And Client select the correct option for memory faces
    And Admin tap on start audio
    And Admin tap on begin item button for memory faces
    And Client select memory faces the correct option for item 1
    And Client select memory faces the correct option for item 2
    And Client select memory faces the correct option for item 3
    And Client select memory faces the correct option for item 4
    And Client select memory faces the correct option for item 5
    And Client select memory faces the correct option for item 6
    And Client select memory faces the correct option for item 7
    And Client select memory faces the correct option for item 8
    And Client select memory faces the correct option for item 9
    And Client select memory faces the correct option for item 10
    And Admin tap on start audio
    And Admin tap on begin demo button for memory faces second part
    And Admin tap on start audio
    And Admin tap on begin practice button for memory faces second part
    And Client select the correct option for practice memory faces second part
    And Admin tap on start audio
    And Admin tap on begin items button for memory faces second part
    And Client select memory faces second part the correct option for item 1
    And Client select memory faces second part the correct option for item 2
    And Client select memory faces second part the correct option for item 3
    And Client select memory faces second part the correct option for item 4
    And Client select memory faces second part the correct option for item 5
    And Client select memory faces second part the correct option for item 6
    And Client select memory faces second part the correct option for item 7
    And Client select memory faces second part the correct option for item 8
    And Client select memory faces second part the correct option for item 9
    And Client select memory faces second part the correct option for item 10
    And Admin tap on complete button for faces

    Examples:
      | age |
      | 12  |
