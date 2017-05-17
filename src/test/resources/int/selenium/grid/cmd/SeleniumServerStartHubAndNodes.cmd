pushd %~dp0



::pause



start cmd /c SeleniumServerStartAsHub.cmd

timeout /t 3

start cmd /c SeleniumServerStartAsNodeFirefoxV45.cmd

timeout /t 2

start cmd /c SeleniumServerStartAsNodeFirefoxV52.cmd

timeout /t 2

start cmd /c SeleniumServerStartAsNodeChrome.cmd

timeout /t 2

start cmd /c SeleniumServerStartAsNodeIE.cmd

timeout /t 2



::pause