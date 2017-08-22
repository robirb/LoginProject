package com.example.robirb.loginproject;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by ROBI RB on 8/22/2017.
 */

public class UserLocalDatabase {
    private static final String PREF_NAME="atik";

    private static final String LOGIN_KEY="lokoo";

    private Context context;
    private SharedPreferences myPref;

    public UserLocalDatabase(Context context) {
        this.context = context;
        myPref = context.getSharedPreferences(PREF_NAME,Context.MODE_PRIVATE);
    }

    public void setLogin(boolean value){
        SharedPreferences.Editor editor = myPref.edit();
        editor.putBoolean(LOGIN_KEY,value);
        editor.apply();
    }

    public boolean isLogin(){
        boolean returnValue = myPref.getBoolean(LOGIN_KEY,false);
        return returnValue;
    }
}
