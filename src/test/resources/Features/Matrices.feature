Feature: Matrices

  Background:
    Given Admin enter the client name
    #And Admin tap on evaluate button------->  version 1.0
    #And Client tap on evaluate button------>  version 1.0
    #And Client select the correct option for demo------>  version 1.0


  @try
  Scenario Outline: Complete the matrices test for section A
    And Admin enter the client age <age>
    And Admin select matrices evaluation
    Given Admin tap on Begin demo button
    And Admin tap on begin practice button
    And Client select the correct option for practice
    And Admin tap on begin item button
    And Client select the correct option for item 1
    And Client select the correct option for item 2
    And Client select the correct option for item 3
    And Client select the correct option for item 4
    And Client select the correct option for item 5
    And Client select the correct option for item 6
    And Client select the correct option for item 7
    And Client select the correct option for item 8
    And Client select the correct option for item 9
    And Client select the correct option for item 10
    And Client select the correct option for item 11
    And Client select the correct option for item 12
    And Client select the correct option for item 13
    And Client select the correct option for item 14
    And Client select the correct option for item 15
    And Client select the correct option for item 16
    And Client select the correct option for item 17
    And Client select the correct option for item 18
    And Client select the correct option for item 19
    And Client select the correct option for item 20
    And Client select the correct option for item 21
    And Client select the correct option for item 22
    And Client select the correct option for item 23
    And Client select the correct option for item 24
    And Client select the correct option for item 25
    And Client select the correct option for item 26
    And Client select the correct option for item 27
    And Client select the correct option for item 28
    And Client select the correct option for item 29
    And Client select the correct option for item 30
    Then The application show the section B
    Examples:
      | age |
      | 12  |

  @try
  Scenario Outline: Complete the matrices test for section B
    And Admin enter the client age <age>
    And Admin select matrices evaluation
    Given Admin tap on Begin demo button
    And Admin tap on begin practice button
    And Client select the correct option for practice
    And Admin tap on begin item button
    And Client select the correct option for item 1
    And Client select the correct option for item 2
    And Client select the correct option for item 3
    And Client select the correct option for item 4
    And Client select the correct option for item 5
    And Client select the correct option for item 6
    And Client select the correct option for item 7
    And Client select the correct option for item 8
    And Client select the correct option for item 9
    And Client select the correct option for item 10
    And Client select the correct option for item 11
    And Client select the correct option for item 12
    And Client select the correct option for item 13
    And Client select the correct option for item 14
    And Client select the correct option for item 15
    And Client select the correct option for item 16
    And Client select the correct option for item 17
    And Client select the correct option for item 18
    And Client select the correct option for item 19
    And Client select the correct option for item 20
    And Client select the correct option for item 21
    And Client select the correct option for item 22
    And Client select the correct option for item 23
    And Client select the correct option for item 24
    And Client select the correct option for item 25
    And Client select the correct option for item 26
    And Client select the correct option for item 27
    And Client select the correct option for item 28
    And Client select the correct option for item 29
    And Client select the correct option for item 30
    Then The application show the section B
    And Admin tap on Begin demo button for section B
    And Admin tap on begin practice button for section B
    And Client select the correct option for practice section B
    And Admin tap on begin item button for section B
    And Client select the correct option for item on section B 1
    And Client select the correct option for item on section B 2
    And Client select the correct option for item on section B 3
    And Client select the correct option for item on section B 4
    And Client select the correct option for item on section B 5
    And Client select the correct option for item on section B 6
    And Client select the correct option for item on section B 7
    And Client select the correct option for item on section B 8
    And Client select the correct option for item on section B 9
    And Client select the correct option for item on section B 10
    And Client select the correct option for item on section B 11
    And Client select the correct option for item on section B 12
    And Client select the correct option for item on section B 13
    And Client select the correct option for item on section B 14
    And Client select the correct option for item on section B 15
    And Client select the correct option for item on section B 16
    And Client select the correct option for item on section B 17
    And Client select the correct option for item on section B 18
    And Client select the correct option for item on section B 19
    And Client select the correct option for item on section B 20
    And Client select the correct option for item on section B 21
    And Client select the correct option for item on section B 22
    And Client select the correct option for item on section B 23
    And Client select the correct option for item on section B 24
    And Client select the correct option for item on section B 25
    And Client select the correct option for item on section B 26
    And Client select the correct option for item on section B 27
    And Client select the correct option for item on section B 28
    And Client select the correct option for item on section B 29
    And Client select the correct option for item on section B 30
    And The application show the part2
    Examples:
      | age |
      | 12  |

  @matrices
  Scenario Outline: Complete the matrices test
    And Admin enter the client age <age>
    And Admin select matrices evaluation
    And Admin tap on start audio
    Given Admin tap on Begin demo button
    And Admin tap on start audio
    And Admin tap on begin practice button
    And Client select the correct option for practice
    And Admin tap on start audio
    And Admin tap on begin item button
    And Client select the correct option for item 1
    And Client select the correct option for item 2
    And Client select the correct option for item 3
    And Client select the correct option for item 4
    And Client select the correct option for item 5
    And Client select the correct option for item 6
    And Client select the correct option for item 7
    And Client select the correct option for item 8
    And Client select the correct option for item 9
    And Client select the correct option for item 10
    And Client select the correct option for item 11
    And Client select the correct option for item 12
    And Client select the correct option for item 13
    And Client select the correct option for item 14
    And Client select the correct option for item 15
    And Client select the correct option for item 16
    And Client select the correct option for item 17
    And Client select the correct option for item 18
    And Client select the correct option for item 19
    And Client select the correct option for item 20
    And Client select the correct option for item 21
    And Admin tap on start audio
    And Admin tap on Begin demo button for section B
    And Admin tap on start audio
    And Admin tap on begin practice button for section B
    And Client select the correct option for practice section B
    And Admin tap on start audio
    And Admin tap on begin item button for section B
    And Client select the correct option for item on section B 1
    And Client select the correct option for item on section B 2
    And Client select the correct option for item on section B 3
    And Client select the correct option for item on section B 4
    And Client select the correct option for item on section B 5
    And Client select the correct option for item on section B 6
    And Client select the correct option for item on section B 7
    And Client select the correct option for item on section B 8
    And Client select the correct option for item on section B 9
    And Client select the correct option for item on section B 10
    And Client select the correct option for item on section B 11
    And Client select the correct option for item on section B 12
    And Client select the correct option for item on section B 13
    And Client select the correct option for item on section B 14
    And Client select the correct option for item on section B 15
    And Client select the correct option for item on section B 16
    And Client select the correct option for item on section B 17
    And Client select the correct option for item on section B 18
    And Client select the correct option for item on section B 19
    And Client select the correct option for item on section B 20
    And Client select the correct option for item on section B 21
    And Admin tap on start audio
    And Admin tap on begin practice button for part2
    And Client select the correct option for practice part2
    And Client select the second correct option for practice part2
    And Client select the third correct option for practice part2
    And Admin tap on start audio
    And Admin tap on begin item button for part2
    And Client select the correct option for item on second part 11
    And Client select the correct option for item on second part 12
    And Client select the correct option for item on second part 13
    And Client select the correct option for item on second part 14
    And Client select the correct option for item on second part 15
    And Client select the correct option for item on second part 16
    And Client select the correct option for item on second part 17
    And Client select the correct option for item on second part 18
    And Client select the correct option for item on second part 19
    And Client select the correct option for item on second part 20
    And Client select the correct option for item on second part 21
    And Client select the correct option for item on second part 22
    And Client select the correct option for item on second part 23
    And Client select the correct option for item on second part 24
    And Client select the correct option for item on second part 25
    And Client select the correct option for item on second part 26
    And Client select the correct option for item on second part 27
    And Client select the correct option for item on second part 28
    And Client select the correct option for item on second part 29
    And Client select the correct option for item on second part 30
    And Client select the correct option for item on second part 31
    And Client select the correct option for item on second part 32
    And Client select the correct option for item on second part 33
    And Client select the correct option for item on second part 34
    And Client select the correct option for item on second part 35
    And Client select the correct option for item on second part 36
    And Client select the correct option for item on second part 37
    And Client select the correct option for item on second part 38
    And Client select the correct option for item on second part 39
    And Client select the correct option for item on second part 40
    And Client select the correct option for item on second part 41
    And Client select the correct option for item on second part 42
    And Client select the correct option for item on second part 43
    And Client select the correct option for item on second part 44
    And Client select the correct option for item on second part 45
    And Client select the correct option for item on second part 46
    And Client select the correct option for item on second part 47
    And Client select the correct option for item on second part 48
    And Client select the correct option for item on second part 49
    And Admin tap on complete button

    Examples:
      | age |
      | 12  |
