package com.j256.ormlite.cipher.android;

import java.sql.SQLException;

public class SqlExceptionUtil {
    public static SQLException create(String reason, android.database.SQLException e) {
        return new SQLException(reason, e.getCause());
    }
}
