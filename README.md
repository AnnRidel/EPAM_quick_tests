### Hi there! 👋

### This project contains automation tests of Web Site: https://www.epam-group.ru/

The following technologies are used:

![java](https://github.com/AnnRidel/Data_examples/blob/master/resources/logo/Java.png?raw=true "Java")
![selenide](https://github.com/AnnRidel/Data_examples/blob/master/resources/logo/Selenide.png?raw=true "Selenide")
![Selenoid](https://github.com/AnnRidel/Data_examples/blob/master/resources/logo/Selenoid.png?raw=true "Selenoid")
![gradle](https://github.com/AnnRidel/Data_examples/blob/master/resources/logo/Gradle.png?raw=true "Gradle")
![jUnit5](https://github.com/AnnRidel/Data_examples/blob/master/resources/logo/JUnit5.png?raw=true "JUnit5")
![jenkins](https://github.com/AnnRidel/Data_examples/blob/master/resources/logo/Jenkins.png?raw=true "Jenkins")
![allure-logo](https://github.com/AnnRidel/Data_examples/blob/master/resources/logo/Allure_Report.png?raw=true "Allure_Report")
![telegram-logo](https://github.com/AnnRidel/Data_examples/blob/master/resources/logo/Telegram.png?raw=true "Telegram")

* :white_check_mark: **Java**  - OOP language, that was used for the automation tests development
* :white_check_mark: **Selenide** - framework for test automation powered by Selenium WebDriver
* :white_check_mark: **Selenoid** - cross browser Selenium solution
* :white_check_mark: **Gradle** - build automation tool for managing dependencies modules, setting tasks configuration, etc.
* :white_check_mark: **JUnit5** - serves as a foundation for launching testing frameworks on the JVM
* :white_check_mark: **Jenkins** - automation server, used to execution of tests from GutHub repository on Selenoid
* :white_check_mark: **Allure Reports** - reporting tool for analysis of test execution results
* :white_check_mark: **Allure TestOps** - test management system for keeping test cases and graphs/metrics investigation
* :white_check_mark: **Telegram** - messenger, in which notifications about test execution results are sent!

### USAGE examples

### For run remote tests need pass value:
* BROWSER (default: chrome)
* BROWSER_VERSION (default: 91.0)
* BROWSER_SIZE (default: 1920x1080)
* BROWSER_MOBILE (mobile device name, for example iPhone X, default: not chosen)
* REMOTE_DRIVER_URL (default: selenoid.autotests.cloud)
* THREADS (number of threads, default: 5)
* ALLURE_NOTIFICATIONS_VERSION (default: 3.1.1)

### Run tests using local browser:
```bash
gradle clean test
```

### Run tests using Selenoid:
```bash
gradle clean test -Durl=selenoid.autotests.cloud/wd/hub/ -DrunMode=remote
```

### Serve Allure report:
```bash
allure serve build/allure-results
```

### :gear: Running build in Jenkins with parameters:
![image](https://github.com/AnnRidel/Data_examples/blob/master/resources/images/jenkins_parameters.png)

### :chart_with_upwards_trend: Generated Allure Report with tests execution results:
![image](https://github.com/AnnRidel/Data_examples/blob/master/resources/images/allure_report.png)

### :bookmark_tabs: Detailed Allure report with test steps:
![image](https://github.com/AnnRidel/Data_examples/blob/master/resources/images/allure_steps.png)

### :bar_chart: Dashboards in Allure TestOps:
![image](https://github.com/AnnRidel/Data_examples/blob/master/resources/images/allure_testops_dashboard.png)

### :clipboard: Test Cases in Allure TestOps:
![image](https://github.com/AnnRidel/Data_examples/blob/master/resources/images/allure_testops_cases.png)

### :envelope_with_arrow: Notification about tests execution results in Telegram:
![image](https://github.com/AnnRidel/Data_examples/blob/master/resources/images/telegram_notifications.png)

### :film_projector: Recorded tests execution:
![alt text](https://github.com/AnnRidel/Data_examples/blob/master/resources/gif/video.gif "Tests execution recorded")
