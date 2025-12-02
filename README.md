# 🛡️ Insurance UI + API Automation Framework

This project is a hybrid automation framework combining Selenium UI tests and REST API tests using RestAssured, built with Java, TestNG, Cucumber, Allure Reports, and GitHub Actions CI.

It demonstrates real world insurance application testing with end-to-end UI flows and API CRUD validation.

### ⚙️ Tech Stack

🟦 Java 17

🧭 Selenium WebDriver — UI automation

🔧 RestAssured — API automation

🧪 TestNG — test runner

🧩 Cucumber (BDD) — Gherkin + step definitions

📊 Allure Reports — reporting

🔄 GitHub Actions — CI pipeline

### 🚀 How to Run Tests

▶️ 1. Run all tests

mvn clean test

🎯 2. Run only UI or API tests (using tags)

UI tests:

mvn test -Dcucumber.filter.tags="@ui"


API tests:

mvn test -Dcucumber.filter.tags="@api"

### 📸 3. Generate Allure Report

allure serve allure-results


⚠️ Make sure Allure CLI is installed

macOS: brew install allure

Windows/Linux: https://docs.qameta.io/allure/#_installing_a_commandline

### 🧪 Test Coverage

🖥️ UI Tests

Login page authentication

Dashboard validation

Navigation & UI element checks

🌐 API Tests (JSONPlaceholder mock service)

✅ POST — Create Policy

🔄 PUT — Update Policy

❌ DELETE — Delete Policy

📸 Reporting (Allure)

Allure provides:

test steps

screenshots (UI)

request/response logs (API)

attachments

failure analysis

Generate locally:

allure serve allure-results

🔄 CI/CD: GitHub Actions

Each push triggers:

UI + API test execution

Allure results generation

CI workflow validation

Workflow file:

.github/workflows/maven.yml

### 📁 Project Structure
```
insurance-ui-api-tests/
│
├── src/
│   ├── test/
│   │   ├── java/
│   │   │   ├── pages/
│   │   │   ├── steps/
│   │   │   └── TestRunner.java
│   │   │
│   │   └── resources/
│   │       └── features/
│
├── pom.xml
│
└── .github/
    └── workflows/
        └── maven.yml
```

### 👩‍💻 Author

Darya Ramirez

QA Automation Engineer

🔗 LinkedIn: https://www.linkedin.com/in/daryaramirez7

💻 GitHub: https://github.com/DaryaRamirez
