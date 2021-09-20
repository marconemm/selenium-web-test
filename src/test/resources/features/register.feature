#language: en
#encoding: utf-8
@registerUser
Feature: Register User

  Scenario: If the user does not exists
    Given click on admin menu
    And click on add button
    Then inform the employername "John Smith"
    And inform the username "test-test34"
    And inform the new user password "12345678"
    And confirm the new user password "12345678"
    When click on save button
    Then The system shows the username "test-test34" into System Users list
