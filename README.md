# **Project Orange Website Automation**
## Project Overview:
**This project automates the login process and navigation to the "My Info" section of the [OrangeHRM](https://opensource-demo.orangehrmlive.com/) Demo website. It uses Selenium WebDriver for browser automation, TestNG for test execution, and Maven for dependency management and build automation.**

## Prerequisites
* Java Development Kit (JDK) 21 or later.
* Maven 3.6+ installed and configured.
* An IDE such as IntelliJ IDEA or Eclipse.
* Google Chrome browser installed.
* ChromeDriver compatible with the installed Chrome version.
## Project Setup
1.Clone or download the repository to your local machine.

2.Open the project in your preferred IDE.

3.Ensure Maven dependencies are resolved by updating the project:
```
mvn clean install
```
4.Update the `config.properties` file located at:
```
arduino
src/test/java/config.properties
```
5.Ensure the following properties are correctly set:
```
properties
url=https://opensource-demo.orangehrmlive.com
name=username
password=password
username=Admin
password1=admin123
loginButton=//button[text()=' Login ']
myinfo=//span[text()='My Info']
firstname=(//input)[2]
middlename=(//input)[3]
lastname=(//input)[4]
nickname=(//input)[5]
```
1.Key Files and Directories
`lanuchBrowser` Class

  * Initializes the WebDriver and launches the browser.
  * Loads properties from the `config.properties` file.
  * Provides browser lifecycle management (`@BeforeClass`and `@AfterClass`).

2.`loginPage` Class
* Contains test cases for:
  * Logging into the OrangeHRM website.
  * Navigating to the "My Info" section.

3.`config.properties` File
* Stores configuration details such as URL, credentials, and XPath selectors for elements.

4.`pom.xml`
* Maven configuration file defining dependencies:
  * Selenium WebDriver
  * WebDriverManager
  * TestNG
**How to Run**
1.Open the terminal in the project directory.
2.Execute the TestNG suite using Maven:
```
bash
mvn test
```
3.Alternatively, run the individual test files in your IDE.
## Dependencies
**Selenium WebDriver (v4.26.0)**
   * For browser automation.
**WebDriverManager (v5.9.2)**
   * Automatically manages browser drivers.
**TestNG (v7.10.2)**
   * For organizing and executing test cases.

## Features
* Automated login to the OrangeHRM website using provided credentials.
* Navigation to the "My Info" section.
* Dynamic properties loading for flexibility and reusability.
* Alert handling to bypass unexpected pop-ups.

## Notes
* Ensure the ChromeDriver version matches your installed Chrome browser. WebDriverManager handles this automatically.
* Modify the config.properties file to test with different user credentials or element locators.
* Ensure a stable internet connection when executing the tests.

# Happy Testing! 😊






