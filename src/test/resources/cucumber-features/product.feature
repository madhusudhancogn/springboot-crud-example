Feature: Get Products

  Scenario: Verify Get Products API
    Given the application getproducts url
    When the user makes get request
    Then verify response code is success
    And verify expected response data
