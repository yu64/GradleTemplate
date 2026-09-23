# Architectury 用の規約プラグイン

Minecraft Mod本体とFabric / NeoForge / Quilt向けのビルド設定です。

## 導入

1. ルートの `settings.gradle` で `part/plugin_repo_settings.gradle` の呼び出し例を有効にし、リポジトリ方針を `PREFER_PROJECT` に変更する。
2. 必要なサブプロジェクトを `include(...)` し、各 `build.gradle` の `plugins` に以下のIDを指定する。

| 適用先 | プラグインID |
| --- | --- |
| ルート | `architectury_root_setting` |
| Mod本体（公式構成のcommon） | `architectury_mod_setting` |
| Fabric | `architectury_fabric_setting` |
| NeoForge | `architectury_neoforge_setting` |
| Quilt | `architectury_quilt_setting` |

`architectury_minecraft_setting`（Minecraft開発の基礎設定）と `architectury_loader_setting`（Mod本体の取り込み・JAR生成）は内部で適用します。
ルートで `group`・`version` を設定し、各ローダーのエントリポイントとModメタデータは利用側で用意してください。

## 構成

ルートの `gradle.properties` に指定します。以下は既定値です。

```properties
architectury_platforms=fabric,neoforge,quilt
architectury_common_project=:common
```

サブプロジェクト名は任意です。Mod本体の名前を変える場合は `architectury_common_project` を変更します。
一部ローダーだけ使う場合は `include(...)` と `architectury_platforms` を揃えてください（例：`include("common", "fabric")` と `architectury_platforms=fabric`）。ローダーは自動検出しません。ルート設定とMod本体は必要です。

## バージョン・実行

- `gradle/architectury.versions.toml`：Minecraft・ローダー・関連プラグイン・コンパイル対象Java。
- `gradle/libs.versions.toml` の `java`：Javaツールチェーン。
- 各ローダーのタスク：`runClient` / `runServer` / `remapJar`。

カタログはルートとbuild-logicのsettingsで自動登録します。

## VS Code

`.vscode/launch.architectury.json` と `tasks.architectury.json` は実行構成のひな形です。
利用時にそれぞれ `launch.json` のconfigurationsと `tasks.json` のtasksへ取り込みます（専用構成ならファイルをコピー）。JavaデバッガーとGradle for Java拡張が必要です。
tasks内のrootProjectをルート名に合わせ、サブプロジェクト名を変更した場合はid・script・project・buildFileも変更してください。不要なローダーの項目は省けます。
Client / Serverを選ぶとGradleが起動し、ポート5005でデバッガーを接続します。同時起動はせず、切断後にゲームが残る場合はタスクも終了してください。
