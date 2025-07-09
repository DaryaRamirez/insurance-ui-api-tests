🛡️ Insurance UI + API Automation Framework
✅ Overview
This is a test automation framework for an insurance application. It covers both UI testing (Selenium + Page Object Model) and API testing (REST-assured with CRUD operations).

Framework supports:

✅ UI tests for login functionality

✅ API tests for creating, updating, and deleting policies

✅ Cucumber BDD integration

✅ Allure reporting

✅ GitHub Actions CI pipeline

🔧 Tech Stack
Layer	Tools
UI Testing	Selenium WebDriver, Page Object
API Testing	REST-assured
Test Runner	TestNG
BDD Framework	Cucumber
Reporting	Allure Reports
CI/CD	GitHub Actions
Language	Java 17
Build Tool	Maven

📂 Project Structure
bash
Copy
Edit
src
├── main
│   └── java
│       └── pages                  # Page Object classes
├── test
│   └── java
│       └── steps                  # Step definitions for UI & API
│   └── resources
│       └── features               # Cucumber feature files
🚀 How to Run
bash
Copy
Edit
# Run all tests
mvn clean test

# Generate Allure Report
allure serve target/allure-results
🧪 Sample Feature
gherkin
Copy
Edit
Feature: Insurance Login and Policy API

  Scenario: User logs in successfully
    Given user is on login page
    When user enters valid credentials and logs in
    Then dashboard should be displayed

  Scenario: Create new policy
    When user creates a policy
    Then policy is created with status code 201
✅ GitHub Actions CI
CI is configured to:

Run tests on each push

Generate Allure Report artifacts

Validate Maven build

