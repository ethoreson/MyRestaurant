package com.epicodus.myrestaurant;

/**
 * Created by emiliethoreson on 9/5/17.
 */

class Robolectric {
    private static Class<MainActivity> upActivity;

    public static void setupActivity(Class<MainActivity> upActivity) {
        Robolectric.upActivity = upActivity;
    }
}
