Feature: Toolbar Case

  Scenario: Toolbar Checked
    Given Navigate to the MobileApp
    Then Toolbar element is checked.

  Scenario: Search Happy Path Control
    Given Navigate to the MobileApp
    Then Search element is checked.
    Then Write "Theme" and searched

  Scenario: More Options Happy Path Control
    Given Navigate to the MobileApp
    Then More Options element is checked.
    Then More Options element is clicked.
    Then Log in to Designer News is checked.
    Then About is checked.

  Scenario: Login To Designer Page Control
    Given Navigate to the MobileApp
    Then More Options element is clicked.
    Then Log in to Designer News is checked.
    Then Log in to Designer News is clicked.

  Scenario: About Page Control
    Given Navigate to the MobileApp
    Then More Options element is clicked.
    Then About is checked.
    Then About is clicked.

  Scenario: Menu Filter Happy Path Control
    Given Navigate to the MobileApp
    Then Menu Filter element is checked.
    Then Menu Filter element is clicked.
    Then Popular Designer News is checked.
    Then Material Design is checked.
    Then Material Design is checked.
    Then Product Hunt is checked.

