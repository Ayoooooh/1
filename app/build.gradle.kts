plugins {
    id("com.android.application")
}

android {
    namespace = "com.personal.savings"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.personal.savings"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}
