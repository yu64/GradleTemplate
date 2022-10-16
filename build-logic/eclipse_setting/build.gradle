
plugins {
    
    id("groovy-gradle-plugin")
}


repositories {
    
    gradlePluginPortal()
}

dependencies {

    //[Name]:[Name].gradle.plugin:[Version]

    //AnnotationProcessorによって生成されたクラスをIDEに適用するプラグイン
    implementation("com.diffplug.eclipse.apt:com.diffplug.eclipse.apt.gradle.plugin:3.29.1")

}

sourceSets {
    main {
        groovy {
            srcDirs("src")
            
        }
    }

}