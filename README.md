# Architectury Sample

Minecraft 1.21.1向けのFabric / NeoForge / QuiltサンプルModです。
共通コードで `/templatehello` コマンドを登録し、各ローダーの入口から初期化します。

- `common`：Mod本体。`fabric` / `neoforge` / `quilt`：各ローダーの入口とメタデータ。
- ビルド：`./gradlew :fabric:remapJar :neoforge:remapJar :quilt:remapJar`（Windowsは `gradlew.bat`）。成果物は各プロジェクトの `build/libs`。
- 起動：`./gradlew :fabric:runClient`。他のローダーも同様です。VS CodeのMinecraft Client / Server構成からも実行できます。
- 確認：ワールド内で `/templatehello` を実行するとメッセージを表示します。
- バージョン：`gradle/architectury.versions.toml`。Javaツールチェーンは `gradle/libs.versions.toml`。メタデータの対応バージョン範囲も変更時に確認してください。

サーバー初回実行では、各ローダーのrunフォルダに生成されるEULAを確認してから同意を設定してください。
元のJavaアプリの `src` は残していますが、このサンプルのビルド対象には含みません。
規約プラグインの使い方は [こちら](build-logic/architectury_setting/README.md)。
