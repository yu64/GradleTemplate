@echo off

cd "%~dp0"
cd ..

for /F "usebackq" %%i in (`git ls-files`) do (

    echo %%i | findstr ".project" > NUL
    if not ERRORLEVEL 1 (
        
        echo %%i
        git update-index --assume-unchanged %%i
    )
)
