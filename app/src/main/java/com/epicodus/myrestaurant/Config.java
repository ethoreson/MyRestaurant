package com.epicodus.myrestaurant;

/**
 * Created by emiliethoreson on 9/5/17.
 */

@interface Config {
    Class<BuildConfig> constants();

    int sdk();
}
