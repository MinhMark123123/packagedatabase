package stark.empire.gpstrackingai.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.io.Serializable;

/**
 * Created by nguyen on 3/16/2015--Code and life.
 * it follow singleton design pattern . i am sitting with my love :)
 */
public class StarkSQLiteHelper extends SQLiteOpenHelper implements Serializable {

    public static final int DATABASE_VERSION = 1;
    private static StarkSQLiteHelper INSTANCE = null;
    public static final String NAME_DATABASE = "gpstrackingai.db";

    //
    public static StarkSQLiteHelper getInstance(Context mContext) {
        if (INSTANCE == null) {
            INSTANCE = new StarkSQLiteHelper(mContext.getApplicationContext());
        }
        return INSTANCE;
    }
    public StarkSQLiteHelper(Context context) {
        super(context, NAME_DATABASE, null, DATABASE_VERSION);

    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        //TO DO code here
        db.execSQL(StarkLocationContract.LocationEnntry.SQL_CREATE_TABLE);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //
        db.execSQL(StarkLocationContract.LocationEnntry.SQL_DELETE_TABLE);
        onCreate(db);
    }
}
