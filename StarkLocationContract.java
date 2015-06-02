package stark.empire.gpstrackingai.database;

import android.provider.BaseColumns;

/**
 * Created by yenminh on 6/1/2015.
 */
public final class StarkLocationContract {

    private StarkLocationContract() {
    }
    private static final String TEXT_TYPE = " TEXT";
    private static final String COMMA_SEP = ",";
    /*
     */
    public static abstract class LocationEnntry implements BaseColumns {
        public static final String TABLE_NAME = "location";
        public static final String COLUMN_NAME_TIME = "time";
        public static final String COLUMN_NAME_LATITUDE = "latitude";
        public static final String COLUMN_NAME_LONGTITUDE = "longtitude";
        public static final String COLUMN_NAME_ALTITIUDE = "altitude";
        public static final String COLUMN_NAME_TYPETRANFS = "typetranfs";

        public static final String SQL_CREATE_TABLE = "CREATE TABLE " + LocationEnntry.TABLE_NAME + " ( "
                + LocationEnntry._ID + " INTEGER PRIMARY KEY" + COMMA_SEP
                + LocationEnntry.COLUMN_NAME_LATITUDE + TEXT_TYPE + COMMA_SEP
                + LocationEnntry.COLUMN_NAME_LONGTITUDE + TEXT_TYPE + COMMA_SEP
                + LocationEnntry.COLUMN_NAME_ALTITIUDE + TEXT_TYPE + COMMA_SEP
                + LocationEnntry.COLUMN_NAME_TIME +  TEXT_TYPE + COMMA_SEP
                + LocationEnntry.COLUMN_NAME_TYPETRANFS + TEXT_TYPE + COMMA_SEP
                + ")";
        public static final String SQL_DELETE_TABLE = "DROP TABLE IF EXISTS " +  LocationEnntry.TABLE_NAME;
    }

}
