# 🛡️ Insurance UI + API Automation Framework

This project is a hybrid test automation framework combining **Selenium UI tests** and **REST API tests** using **RestAssured**, with reporting via **Allure** and CI integration via **GitHub Actions**.

---

## 🚀 Tech Stack

- ✅ Java 17  
- ✅ Selenium WebDriver  
- ✅ RestAssured  
- ✅ TestNG + Cucumber  
- ✅ Allure Reports  
- ✅ GitHub Actions (CI)

---

## 🧪 Test Coverage

### UI Tests:
- Login page authentication
- Dashboard validation

### API Tests (using [JSONPlaceholder](https://jsonplaceholder.typicode.com)):
- ✅ Create Policy (POST)
- ✅ Update Policy (PUT)
- ✅ Delete Policy (DELETE)

---

## 📸 Reporting

To view Allure report locally:

```bash
allure serve allure-results
⚙️ CI/CD


Every push runs tests automatically on GitHub Actions with full Allure reporting.

📁 Project Structure
bash
Copy
Edit
.
├── src
│   ├── test
│   │   ├── java
│   │   │   ├── pages
│   │   │   ├── steps
│   │   │   └── TestRunner.java
│   │   └── resources
│   │       └── features
├── pom.xml
├── .github/workflows/maven.yml
└── README.md
Author
Darya Ramirez
