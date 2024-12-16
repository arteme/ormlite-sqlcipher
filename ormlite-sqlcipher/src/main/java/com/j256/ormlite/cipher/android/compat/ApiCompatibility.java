package com.j256.ormlite.cipher.android.compat;


import android.database.Cursor;

import net.zetetic.database.sqlcipher.SQLiteDatabase;

/**
 * Compatibility interface to support various different versions of the Android API.
 * 
 * @author graywatson
 */
public interface ApiCompatibility {

	/**
	 * Perform a raw query on a database with an optional cancellation-hook.
	 */
	Cursor rawQuery(SQLiteDatabase db, String sql, String[] selectionArgs, CancellationHook cancellationHook);

	/**
	 * Return a cancellation hook object that will be passed to the
	 * {@link #rawQuery(SQLiteDatabase, String, String[], CancellationHook)}. If not supported then this will return
	 * null.
	 */
	CancellationHook createCancellationHook();

	/**
	 * Cancellation hook class returned by {@link ApiCompatibility#createCancellationHook()}.
	 */
	interface CancellationHook {
		/**
		 * Cancel the associated query.
		 */
		void cancel();
	}
}
