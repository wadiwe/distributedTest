pushd %~dp0

cd "..\..\..\.."



::pause



set seleniumServerDirectoryRaw=ext\lib
set seleniumServerFile=selenium-server-standalone-3.4.0.jar

set browsernameFolderRaw=ie

set webdriverDirectoryRaw=ext\bin\selenium\driver
set webdriverBitArchiFolder=32 bit
set webdriverFile=IEDriverServer.exe



set seleniumServerDirectoryAndFile=%seleniumServerDirectoryRaw%\%seleniumServerFile%

set webdriverDirectoryAndFile=%webdriverDirectoryRaw%\%browsernameFolderRaw%\%webdriverBitArchiFolder%\%webdriverFile%



java^
 -Dwebdriver.ie.driver="%webdriverDirectoryAndFile%"^
 -jar "%seleniumServerDirectoryAndFile%"^
 -role node^
 -nodeConfig "%~dp0\SeleniumServerStartAsNodeIE.json"



pause