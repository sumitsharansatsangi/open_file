
plugins {
    id("com.android.library")
}

group = "com.crazecoder.openfile"
version="1.0-SNAPSHOT"

repositories {
        google()
        mavenCentral()
    }


android {
    compileSdk=37
    namespace ="com.crazecoder.openfile"
    defaultConfig {
        minSdk = 23
    }
}
