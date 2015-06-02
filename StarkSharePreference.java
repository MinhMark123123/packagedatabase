package stark.empire.gpstrackingai.database;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by nguyen on 3/16/2015.
 */
public class StarkSharePreference {
    private Context mContext;
    private String mSharePrefsName;

    public StarkSharePreference(Context mContext, String mSharePrefsName) {
        this.mContext = mContext;
        this.mSharePrefsName = mSharePrefsName;
    }

    /**
     * here is some code
     */
    public void saveString(String key, String value) {
        SharedPreferences sharedPreferences = mContext.getApplicationContext().getSharedPreferences(mSharePrefsName, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key, value);
        editor.commit();
    }

    public String loadString(String key) {
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(mSharePrefsName, Context.MODE_PRIVATE);
        return sharedPreferences.getString(key, null);
    }
    public void saveInt(String key, int value) {
        SharedPreferences sharedPreferences = mContext.getApplicationContext().getSharedPreferences(mSharePrefsName, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(key, value);
        editor.commit();
    }

    public int loadInt(String key) {
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(mSharePrefsName, Context.MODE_PRIVATE);
        return sharedPreferences.getInt(key, -1);
    }
    /*
     *
     *
     */
    public boolean getFunctionStatus(String keyFunction){
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(mSharePrefsName, Context.MODE_PRIVATE);
        return sharedPreferences.getBoolean(keyFunction, false);
    }
    public void saveFunctionStatus(String keyFunction, boolean value){
        SharedPreferences sharedPreferences = mContext.getApplicationContext().getSharedPreferences(mSharePrefsName, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(keyFunction, value);
        editor.commit();
    }
    public Context getmContext() {
        return mContext;
    }

    public void setmContext(Context mContext) {
        this.mContext = mContext;
    }

    public String getmSharePrefsName() {
        return mSharePrefsName;
    }

    public void setmSharePrefsName(String mSharePrefsName) {
        this.mSharePrefsName = mSharePrefsName;
    }
}
