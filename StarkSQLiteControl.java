package stark.empire.gpstrackingai.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import stark.empire.gpstrackingai.basicobject.StarkLocation;

/**
 * Created by nguyen on 3/21/2015--Code and life.
 */
public class StarkSQLiteControl {

    private SQLiteDatabase mSqLiteDatabase;
    private Context context;


    public StarkSQLiteControl(Context context) {
        this.context = context;
    }



    public void insertLocationToDB(StarkLocation starkLocation) {
        SQLiteDatabase database = getWriteAbleDatabase();
        //
        if(database != null && database.isOpen()){
            ContentValues contentValues = new ContentValues();
            contentValues.put(StarkLocationContract.LocationEnntry.COLUMN_NAME_LATITUDE, starkLocation.getLatTitude());
            contentValues.put(StarkLocationContract.LocationEnntry.COLUMN_NAME_LONGTITUDE, starkLocation.getLongTittude());
            contentValues.put(StarkLocationContract.LocationEnntry.COLUMN_NAME_ALTITIUDE, starkLocation.getAlTitude());
            contentValues.put(StarkLocationContract.LocationEnntry.COLUMN_NAME_TIME, starkLocation.getTime());
            contentValues.put(StarkLocationContract.LocationEnntry.COLUMN_NAME_TYPETRANFS, starkLocation.getTypeTransfer());
            //
            database.insert(StarkLocationContract.LocationEnntry.TABLE_NAME, null ,contentValues);
            //
            database.close();
        }
    }

    /**
     * Gets the data repository in write mode
     * use : insert, delete,etc
     * note : close db when you no longer need the database
     *
     * @return db
     */
    public SQLiteDatabase getWriteAbleDatabase() {
        return StarkSQLiteHelper.getInstance(context).getWritableDatabase();
    }

    /**
     * Gets the data repository in read mode
     * use : query
     *
     * @return db
     */
    public SQLiteDatabase getReadAbleDatabse() {
        return StarkSQLiteHelper.getInstance(context).getReadableDatabase();
    }

}
