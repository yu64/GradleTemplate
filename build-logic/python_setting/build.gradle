
plugins {
    
    id("groovy-gradle-plugin")
}


repositories {
    
    gradlePluginPortal()
}

dependencies {

    //[Name]:[Name].gradle.plugin:[Version]
    
    //Condaを自動的にインストールして、仮想環境でPythonを実行するプラグイン
    implementation("com.pswidersk.python-plugin:com.pswidersk.python-plugin.gradle.plugin:2.2.0")

}

sourceSets {
    main {
        groovy {
            srcDirs("src")
        }
    }

}