# komentarze są haszem

Feature: Google search feature
  As a user I want to search "stuff" and see results

  Background:
    Given Google page opened
    When I click Accept all button in the popup window

#  Scenario: Search in google
#    And I search for "Nocny Kochanek" in the search bar
#    Then I get search results

    #Poniższy powtórzy na kilka wyszukiwań
    Scenario Outline: Search for somethiong in google (ScenOutline)
      And I search for "<searchPhrase>" in the search bar
      Then I get search results
      Examples:
        | searchPhrase |
        | Google       |
        | Cucumber     |
        | Selenium     |
        | Nocny Kochanek|

  Scenario: Search in google
    And I left search bar empty
    Then I do not see any search results