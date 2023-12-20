Feature: Jobfindsearch

  @test
  Scenario Outline: Verify Job search result using different data set

    Given I am on homepage
    And I accept iFrame
    And I enter "<job title>","<location>","<distance>"
    And I click on more search option
    And I enter "<min salary>","<max salary>","<salary type>","<job type>"
    And I click on find job button
    Then I should able to see the search result "<search result>"

    Examples:
      | job title        | location             | distance       | min salary | max salary | salary type | job type  | search result                             |
      | Tester           | Harrow               | up to 5 miles  | 30000      | 500000     | Per annum   | Permanent | Permanent Tester jobs in Harrow           |
      | Developer        | Brent,Greater London | up to 10 miles | 40000      | 50000      | Per annum   | Contract  | Contract Developer jobs in London         |
      | Quality Manger   | London               | up to 5 miles  | 40000      | 45000      | Per annum   | Temporary | Temporary Quality Manager jobs in London  |
      | Beauty Therapist | Harlow, Essex        | up to 7 miles  | 2000       | 3000       | Per Month   | Part time | Part Time Beauty Therapist jobs in Harlow |

