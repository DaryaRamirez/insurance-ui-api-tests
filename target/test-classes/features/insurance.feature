Feature: Insurance Tests

  Scenario: User logs in successfully
    Given user is on login page
    When user enters valid credentials and logs in
    Then dashboard should be displayed

  Scenario: Create new policy
    When user creates a policy
    Then policy is created with status code 201

  Scenario: Update policy
    When user updates the policy
    Then policy should return status 200

  Scenario: Delete policy
    When user deletes the policy
    Then policy should return status 200
