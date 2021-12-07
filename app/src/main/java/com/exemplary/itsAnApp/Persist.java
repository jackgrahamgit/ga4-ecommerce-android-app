package com.exemplary.itsAnApp;

import android.content.Context;
import android.content.SharedPreferences;

// Defines methods to write to and read and remove from shared preferences
// Learn more: https://developer.android.com/training/data-storage/shared-preferences
public class Persist {
    private static final String MY_PREFERENCE_NAME = "com.exemplary.itsAnApp";

    // Writes to shared preferences for the product associated with the specified key
    public static void writeValue(Context context, int quantity, String key) {
        SharedPreferences pref = context.getSharedPreferences(MY_PREFERENCE_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putInt(key, quantity);
        editor.apply();
    }

    // Reads from shared preferences for the product associated with the specified key
    public static int readValue(Context context, String key) {
        SharedPreferences pref = context.getSharedPreferences(MY_PREFERENCE_NAME, Context.MODE_PRIVATE);
        return pref.getInt(key, 0);
    }

    // Deletes the quantity in shared preferences for the product associated with the specified key
    public static void deleteValue(Context context, String key) {
        SharedPreferences pref = context.getSharedPreferences(MY_PREFERENCE_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putInt(key, 0);
        editor.apply();
    }
}