package com.j256.ormlite.cipher.android.compat;

import android.database.Cursor;

import net.zetetic.database.sqlcipher.SQLiteDatabase;

/**
 * Basic class which provides no-op methods for all Android version.
 * 
 * @author graywatson
 */
public class BasicApiCompatibility implements ApiCompatibility {

	@Override
	public Cursor rawQuery(SQLiteDatabase db, String sql, String[] selectionArgs, CancellationHook cancellationHook) {
		// NOTE: cancellationHook will always be null
		return db.rawQuery(sql, selectionArgs);
	}

	@Override
	public CancellationHook createCancellationHook() {
		return null;
	}
}
