@echo off

mode con:cols=30 lines=5



echo.
echo ##############################
echo     Showing grid status...
echo ##############################



set urlHubConsole=http://localhost:4444/grid/console >nul 2>nul



start %urlHubConsole% >nul 2>nul



::pause