package com.hong.blescannerdemo;

import android.content.Context;
import android.content.pm.PackageManager;

/**
 * Created by ftuser on 13/5/16.
 */
public class BleUtil {

    public static boolean isBleSupported(Context context) {
        return context.getPackageManager().hasSystemFeature(PackageManager.FEATURE_BLUETOOTH_LE);
    }

}
