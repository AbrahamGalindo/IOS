Feature: WMI

  Background:
    Given Admin enter the client name


  @wmi
  Scenario Outline: Complete the WMI test
    And Admin enter the client age <age>
    And Admin select WMI evaluation
    And Admin tap on start audio
    And Admin tap on begin demo button for WMI
    And Admin tap on practice button for WMI
    And Admin tap on start audio
   # And Client select the correct option for WMI practice
    And Admin tap on begin item button for WMI
    And Client select the correct option for WMI item 1
    And Client select the correct option for WMI item 2
    And Client select the correct option for WMI item 3
    And Client select the correct option for WMI item 4
    And Client select the correct option for WMI item 5
    And Client select the correct option for WMI item 6
    And Client select the correct option for WMI item 7
    And Client select the correct option for WMI item 8
    And Client select the correct option for WMI item 9
    And Client select the correct option for WMI item 10
    And Client select the correct option for WMI item 11
    And Admin tap on start audio
    And Admin tap on begin demo button for WMI second part
    And Admin tap on start audio
    And Admin tap on begin practice button for WMI second part
    And Client select the correct option for WMI practice second part
    And Admin tap on start audio
    And Admin tap on begin item button for WMI second part
    And Client select the correct option for WMI item on second part 1
    And Client select the correct option for WMI item on second part 2
    And Client select the correct option for WMI item on second part 3
    And Client select the correct option for WMI item on second part 4
    And Client select the correct option for WMI item on second part 5
    And Client select the correct option for WMI item on second part 6
    And Client select the correct option for WMI item on second part 7
    And Client select the correct option for WMI item on second part 8
    And Client select the correct option for WMI item on second part 9
    And Client select the correct option for WMI item on second part 10
    And Client select the correct option for WMI item on second part 11
    And Client select the correct option for WMI item on second part 12
    And Client select the correct option for WMI item on second part 13
    And Client select the correct option for WMI item on second part 14
    And Client select the correct option for WMI item on second part 15
    And Client select the correct option for WMI item on second part 16
    And Client select the correct option for WMI item on second part 17
    And Client select the correct option for WMI item on second part 18
    And Client select the correct option for WMI item on second part 19
    And Client select the correct option for WMI item on second part 20
    And Client select the correct option for WMI item on second part 21
    And Client select the correct option for WMI item on second part 22
    And Client select the correct option for WMI item on second part 23
    And Client select the correct option for WMI item on second part 24
    And Client select the correct option for WMI item on second part 25
    And Client select the correct option for WMI item on second part 26
    And Client select the correct option for WMI item on second part 27
    And Client select the correct option for WMI item on second part 28
    And Client select the correct option for WMI item on second part 29
    And Client select the correct option for WMI item on second part 30
    And Admin tap on complete button for WMI

    Examples:
      | age |
      | 12  |