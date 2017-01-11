package com.a26c.android.frame.util;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

/**
 * Created by guilinlin on 16/8/30 14:09.
 * email 973635949@qq.com
 */
public class DialogFactory {


    public static AlertDialog show(Context context, String title, String message,
                                   String negative, DialogInterface.OnClickListener negativeListener,
                                   String positive, DialogInterface.OnClickListener positiveListener) {

        AlertDialog alertDialog = new AlertDialog.Builder(context).setTitle(title)
                .setMessage(message)
                .setNegativeButton(negative, negativeListener)
                .setPositiveButton(positive, positiveListener).create();
        alertDialog.show();
        return alertDialog;
    }
    public static AlertDialog show(Context context, String title, CharSequence message,
                                   String negative, DialogInterface.OnClickListener negativeListener,
                                   String positive, DialogInterface.OnClickListener positiveListener) {

        AlertDialog alertDialog = new AlertDialog.Builder(context).setTitle(title)
                .setMessage(message)
                .setNegativeButton(negative, negativeListener)
                .setPositiveButton(positive, positiveListener).create();
        alertDialog.show();
        return alertDialog;
    }

    public static AlertDialog show(Context context, String title, String message,
                                   String positive, DialogInterface.OnClickListener positiveListener) {

        AlertDialog alertDialog = new AlertDialog.Builder(context).setTitle(title)
                .setMessage(message)
                .setPositiveButton(positive, positiveListener).create();
        alertDialog.show();
        return alertDialog;
    }

    public static AlertDialog show(Context context, String title,
                                   String positive, DialogInterface.OnClickListener positiveListener) {

        AlertDialog alertDialog = new AlertDialog.Builder(context).setTitle(title)
                .setPositiveButton(positive, positiveListener).create();
        alertDialog.show();
        return alertDialog;
    }
}
