// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
//    extra.kotlin_version = "1.5.10"
    val kotlin_version by extra("1.5.10")
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:4.2.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        jcenter() // Warning: this repository is going to shut down soon
    }
}

task(mapOf("type" to Delete::class.java), "clean", closureOf<Delete> {
    delete(rootProject.buildDir)
})