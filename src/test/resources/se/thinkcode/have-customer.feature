Feature: The store have people

  Scenario: Store should have people
    Given that the store ZiStore exist
    When store is opened
    Then store should have at least 1 person