@echo off

setlocal enabledelayedexpansion


rem git管理下の状態とファイルの一覧でループ
for /F "usebackq delims=" %%i in (`git ls-files -v`) do (

    call :inner "%%i"

)

endlocal

exit /b

:inner

    set v=%~1

    rem 先頭が h に一致するもの
    echo %v% | findstr /B "h" > NUL
    if not ERRORLEVEL 1 (

        rem 登録削除
        echo %v:~2%
        git update-index --no-assume-unchanged %v:~2%
    )

exit /b