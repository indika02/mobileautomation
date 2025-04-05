# Facebook Android App Automation

## Project Overview
This project automates different functionalities of the Facebook Android application using Appium. It includes a mobile test automation framework built with Java, TestNG, Cucumber, and Allure reporting to ensure effective test execution and reporting.

## Technologies Used
- **Appium** - For mobile app automation.
- **Java** - Programming language for automation scripts.
- **TestNG** - Test execution framework.
- **Cucumber** - For behavior-driven development (BDD) test scenarios.
- **Allure Reporting** - For generating detailed test execution reports.

## Project Structure
```
📂 mobileautomation
├── 📂 apps                  # APK files for testing
│   ├── Facebook Lite.apk
│   ├── instagram.apk
│   ├── testapk1.apk
├── 📂 Config
│   ├── Config.properties    # Configuration settings
├── 📂 Features
│   ├── dashboard.feature    # Cucumber feature file for dashboard
│   ├── Login.feature        # Cucumber feature file for login
├── 📂 src
│   ├── 📂 main              # Main source code
│   ├── 📂 test              # Test source code
│   │   ├── 📂 java
│   │   │   ├── 📂 Common
│   │   │   │   ├── actionCommands
│   │   │   │   ├── appSetup
│   │   │   │   ├── configDataProvider
│   │   │   ├── 📂 Pages
│   │   │   ├── 📂 Stepdefinitions
│   │   │   │   ├── dashboardPageSteps
│   │   │   │   ├── loginPageSteps
│   │   │   ├── 📂 testRunner
│   │   │   │   ├── testRunner
├── 📂 target                # Compiled test results
├── 📂 allure-report         # Allure reports folder
├── 📂 allure-results        # Allure test results
├── 📜 .gitignore            # Git ignore file
├── 📜 README.md             # Project documentation
```

## Prerequisites
Before running the tests, ensure you have the following installed:
- **Java JDK 11 or later**
- **Maven**
- **Node.js & Appium Server**
- **Android SDK** (Ensure `adb` is configured in the system path)
- **Facebook Android app installed on the emulator or device**
- **Android studio**
- **Appium inspector**

## Setup Instructions
### 1. Clone the Repository
```sh
git clone https://github.com/yourusername/facebook-app-automation.git
cd mobileautomation
```
### 2. Install Dependencies
```sh
mvn clean install
```
### 3. Start Appium Server
```sh
appium --base-path /wd/hub
```
### 4. Run the Tests
#### Running specific Cucumber feature:
```sh
1. Go to the testrunner class
2. Change the specific feature file name and tags
3. Run the testrunner file
```
## Reporting
The test results are generated using Allure. To view the report:
```sh
allure serve allure-results
```

## Contributing
Feel free to contribute by submitting pull requests or reporting issues.

## License
This project is licensed under the MIT License.

