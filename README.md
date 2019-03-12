"# webapitest-automation" 

Automation Project Name: webapitest-automation
GitHubLocation: https://github.com/narendragm

Development Environment Used:
IDE- IntelliJ IDE
Operating System- OS Windows 7
Coding Language & Support- JDK Java Version 1.8.0_202

Please read README.md file carefully to clone and run the project to local computer
To clone project on local computer from command line:
1) Open command line terminal 
2) Move to desired directory where you want to clone project
3) Run command -
git clone https://github.com/narendragm/webapitest-automation.git
(this should clone project on local computer)

This automation project showcase:
1) Webservices Test Automation Framework
2) How to maintain various project files like Java Test, Util, Config, Properties, Reporting, Listener, etc.
(Not the only way but one of the to maintain project)
3) How we can write tests and test support utilities
 
About tests and test artifacts:
1) Automation test written for one of the webservice endpoint of "www.themoviedb.org" site
Get Call  "/movie/{movie_id}"
2) Test Scenario excel sheet describing test objective (No detail level test steps added) 
3)Various test scenarios (positive/negative)are written in
..\webapitest-automation\src\test\java\com\assessment\webapi\tests\GetMovieInfoByMovieIdTests.java
5) Total 12 Tests are written and when executed Total 22 test gets executed (DataProvider implementation runs test multiple times)
6) Some tests are kept as "//TODO" describing scenario only
7) Test report generated for the test run at -
..\Webapp-UI-TestAutomation\src\test\resources\testreports\ExtentReportResults.html (Don't forget to heck this beautiful test report)

Create API Developer key for site www.themoviedb.org:
1) Register with site "www.themoviedb.org"
2) Navigate to "https://www.themoviedb.org/settings/api" Developer API key for this site


Instructions to run the project:
1) Open the cloned project in IDE like IntelliJ/Eclipse IDE (I am using IntelliJ)
2) Let the project download all the dependencies, perform other project building tasks.
3) Once project in IDE, you need to add your Developer API Key(see instruction for Create API Developer key)
at ..\webapitest-automation\src\main\resources\test_config.properties
Replace your API Key incliding double quotes
api_key=?api_key=”Your Own API KEY”
4) Right click on TestNG xml file located as follows and run tests
..\webapitest-automation\src\test\resources\TestSuite_AllTests.xml
5) Alternatively you can right click on test class located as follows and run tests
..\webapitest-automation\src\test\java\com\assessment\webapi\tests\GetMovieInfoByMovieIdTests.java
6) Another way is-
a) Open terminal and navigate to project folder for this project and run command
mvn clean install (you should have Maven set up on your machine)
