
# どこから実行しても、
    # このスクリプトがあるフォルダの、親のフォルダを、カレントディレクトリとする。
    $currentDir = Split-Path $MyInvocation.MyCommand.path;
    Set-Location $currentDir
    Set-Location ..

Get-ChildItem "./build-logic/*/src/*" -Recurse -Name