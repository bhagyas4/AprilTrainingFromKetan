c:
cd "C:\Users\ketan\OneDrive\Selenium\4.0\seleniumtraining\lib"
java ^
-Dwebdriver.gecko.driver="..\resources\geckodriver.exe" ^
-Dwebdriver.chrome.driver="..\resources\chromedriver.exe" ^
-Dwebdriver.ie.driver="C:\Users\Ketan\OneDrive\Selenium\workspace\Selenium Training\test\resources\IEDriverServer.exe" ^
-jar selenium-server-4.1.1.jar node ^
-p 5564
-browser "browserName=firefox,maxInstances=10,platform=Windows" ^
-browser "browserName=chrome,maxInstances=15" ^
-browser "browserName=internet explorer,maxInstances=15" ^
-browser "browserName=safari,maxInstances=10" ^
-maxSession 20
pause