pushd %~dp0

cd "..\..\..\.."



::pause



set seleniumServerDirectoryRaw=ext\lib
set seleniumServerFile=selenium-server-standalone-3.4.0.jar



set seleniumServerDirectoryAndFile="%seleniumServerDirectoryRaw%\%seleniumServerFile%"



java^
 -jar %seleniumServerDirectoryAndFile%^
 -role hub^
 -hubConfig "%~dp0\SeleniumServerStartAsHub.json"



pause