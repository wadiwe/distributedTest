pushd %~dp0

cd "..\..\..\.."



::pause



set seleniumServerDirectoryRaw=ext\lib
set seleniumServerFile=selenium-server-standalone-3.4.0.jar

set browsernameFolderRaw=firefox

set webdriverDirectoryRaw=ext\bin\selenium\driver
set webdriverFile=geckodriver-v0.15.0-win32.exe

set browserDirectoryRaw=ext\bin\browser
set browserReleaseVersionFolder=v45
set browserFile=firefox.exe



set seleniumServerDirectoryAndFile=%seleniumServerDirectoryRaw%\%seleniumServerFile%

set webdriverDirectoryAndFile=%webdriverDirectoryRaw%\%browsernameFolderRaw%\%webdriverFile%

set browserDirectoryAndFile=%browserDirectoryRaw%\%browsernameFolderRaw%\%browserReleaseVersionFolder%\%browserFile%



java^
 -Dwebdriver.gecko.driver="%webdriverDirectoryAndFile%"^
 -Dwebdriver.firefox.bin="%browserDirectoryAndFile%"^
 -jar "%seleniumServerDirectoryAndFile%"^
 -role node^
 -nodeConfig "%~dp0\SeleniumServerStartAsNodeFirefoxV45.json"



pause