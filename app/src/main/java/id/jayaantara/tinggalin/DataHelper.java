package id.jayaantara.tinggalin;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "tinggalin.db";
    private static final int DATABASE_VERSION = 1;

    public DataHelper(Context context) {
        super(context, DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE tb_pemilik(id INTEGER PRIMARY KEY AUTOINCREMENT, email TEXT not null, username TEXT not null, password TEXT not null, gender TEXT not null, age INT NOT NULL );";
        Log.d("Data","OnCreate: "+ sql);
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2 ){

    }
}
