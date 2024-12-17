# ormlite-sqlcipher
Patched OrmLite Android library with SQLCipher, updated to work with the latest
ORMLite and SQLCipher libraries.

# Installation

```sh
allprojects {  
    repositories {  
        maven { url "https://jitpack.io" }
    }  
}
```

```sh
dependencies {  
    compile '<package>:ormlite-sqlcipher:<version>'
    compile 'com.j256.ormlite:ormlite-core:6.1'
    compile 'net.zetetic:sqlcipher-android:4.6.0'
} 
```

`ormlite-sqlcipher` package replaces `ormlite-android`, the latter should not be declared
as a dependency.

# Usage

1. Init [sqlcipher](https://www.zetetic.net/sqlcipher/sqlcipher-for-android/).
2. Use in imports `com.j256.ormlite.cipher.android` imports instead of `com.j256.ormlite.android`
3. Use in imports `net.zetetic.database.sqlcipher` imports instead of `android.database`
4. If you need `OrmLiteSqliteOpenHelper` pass the password in the constructor.

