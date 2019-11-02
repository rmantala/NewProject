package id.ac.poliban.dts.newproject;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class FriendSQL extends SQLiteOpenHelper {
    private static final String DB_NAME = "dts.db";
    private static final int DB_VERSION = 2;

    public FriendSQL(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "create table if not exists friend (" +
                "id integer not null primary key," +
                "name text not null)";

        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //
    }
}
