
# ファイルの一覧を標準出力で返す。

# どこから実行しても、
# このスクリプトがあるフォルダの、親のフォルダを、カレントディレクトリとする。
$currentDir = Split-Path $MyInvocation.MyCommand.path;
Set-Location $currentDir
Set-Location ..


$mainFiles = Get-ChildItem "./src/main" -Recurse -File
$testFiles = Get-ChildItem "./src/test" -Recurse -File
$webContent = Get-ChildItem "./WebContent" -Recurse -File

$files = $mainFiles + $testFiles + $webContent

$texts = $files | ForEach-Object {

    $root = Convert-Path .
    $abs = $_.FullName

    Push-Location $root
    $relv = Resolve-Path $abs -Relative
    Pop-Location
    
    $relv

} | Sort-Object 

Write-Output $texts
