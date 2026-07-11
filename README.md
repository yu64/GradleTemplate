# GradleTemplate

Gradle環境のテンプレート

## 導入 (VSCode)

- このリポジトリをクローンする
- tool/generate_eclipse_apt.batを実行する
- VSCodeで開く

## Proto (moonrepo) 使い方

- `proto plugin search <name>` でプラグイン(ツールの取得先)の検索。
- `proto plugin add <name> <url>` でプラグインの登録。
- `proto pin <id> <version>` で使用するバージョンの切り替え( `./.prototools` に書き込まれる)
- `proto use` で `.prototools` の構成を準備できる。
