pushd %~dp0

cd "..\..\..\.."



::pause



set seleniumServerDirectoryRaw=ext\lib
set seleniumServerFile=selenium-server-standalone-3.4.0.jar

set browsernameFolderRaw=chrome

set webdriverDirectoryRaw=ext\bin\selenium\driver
set webdriverFile=chromedriver.exe

set browserDirectoryRaw=ext\bin\browser

reg Query "HKLM\Hardware\Description\System\CentralProcessor\0" | find /i "x86" > NUL && set OS=32BIT || set OS=64BIT
if %OS%==64BIT (^
	set browserBitArchiFolder=64 bit)^
else (^
	set browserBitArchiFolder=32 bit)

set browserFile=chrome.exe



set seleniumServerDirectoryAndFile=%seleniumServerDirectoryRaw%\%seleniumServerFile%

set webdriverDirectoryAndFile=%webdriverDirectoryRaw%\%browsernameFolderRaw%\%webdriverFile%

set browserDirectoryAndFile=%browserDirectoryRaw%\%browsernameFolderRaw%\%browserBitArchiFolder%\%browserFile%



java^
 -Dwebdriver.chrome.driver="%webdriverDirectoryAndFile%"^
 -Dwebdriver.chrome.bin="%browserDirectoryAndFile%"^
 -jar "%seleniumServerDirectoryAndFile%"^
 -role node^
 -nodeConfig "%~dp0\SeleniumServerStartAsNodeChrome.json"



pause