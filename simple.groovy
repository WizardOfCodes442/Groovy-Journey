//Top-level build file wher you can add configurations 
// options common to all sub-project /modules

buildscript {
    repositories {
        google()
        jcenter()
    }

    dependencies {
        classpath 'com.android.tools.build:gradle:3.0.0'
        //Note do not place your appliction dependencies here 
        //They belong in the individual module build.gradle files 

    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

task clean(type: Delete) {
    delete rootProject.buildDir
}

