# Appium-EMI-Calculator
### An [EMI calculator](https://play.google.com/store/apps/details?id=com.continuum.emi.calculator) is automated by testing with varities of datasets and whether it gives correct results with correct data.Appium is utilized on an emulated device powered by Android Studio.
Here the following tasks are done:
- An EMI Calculator app extracted from [EMI calculator](https://play.google.com/store/apps/details?id=com.continuum.emi.calculator) is automated by extracting its apk.
- Different data is tested where user gives Amount,Interest,Period and Processing fee and hits Calculate button.
- The monthly EMI,total interest ,processing fee and total payment generated are matched with the expected data provided in the dataset.
- It is tested for four different data and a reset button will be pressed after a test case with a single data is executed.

### Technology: </br>
- Tool: Selenium Webdriver
- IDE: Intellij, Android Studio
- Build tool: Gradle
- Language: Java
- Test_Runner: Appium

### Prerequisites</br>
- Install Android Studio latest version
- Install Appium 1.17.1
- Install jdk 8 or any LTS version
- Configure **ANDROID_HOME**, **JAVA_HOME** and **GRADLE_HOME**
- Stable internet connection

### Project Run

#### Appium
- Turn on **Developer Options** on your android phone
- Connect your android phone with USB cable/ Create an emulated virtual device via Android Studio and run it.
- Open cmd and give ```adb devices``` command to get uuid.
- Open Appium and start server. Then open inspector tool.
- In the **JSON Representation** section, paste the following desired capabilities after adding your uuid and version:

```
  "deviceName": "Your device name",
  "platformName": "Android",
  "uuid": Enter your uuid here,
  "platformVersion": Enter your android version,
  "appPackage": "com.continuum.emi.calculator",
  "appActivity": "com.finance.emicalci.activity.Splash_screnn"

```
- Click **Start Server**.

#### Java IDE

- Clone the repo.

#### Run the Automation Script by the following command:
 ```
 gradle clean test 
 ```
- After automation to view allure report , give the following commands:
 ```
allure generate allure-results --clean -o allure-report
allure serve allure-results
 ```
**Here is the Allure report overview:**

![Allure overview Report](https://user-images.githubusercontent.com/59876702/220684929-69163d79-04d4-48cb-b3b4-48c3c0afc041.PNG)


**Below the suites run are shown via Allure :**

![Allure suites report](https://user-images.githubusercontent.com/59876702/220685382-41e5a467-0c02-4a79-a6d1-8f3046458843.PNG)

**Screenshot of the overall project run in appium**

![App inspection in appium](https://user-images.githubusercontent.com/59876702/220689891-35a3f4dd-3004-43f6-81bc-9d0dfffc60a6.PNG)

**Watch the Project video and test run:** [Video](https://drive.google.com/file/d/1sUZxOkhlMGo79KwiOZ7xfxARnUIkwYOx/view?usp=share_link)

