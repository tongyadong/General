package com.github.tony.commons.util;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Admin on 2018/1/8
 */

public class TTFUtil {

    /**
     * 为控件设置字体
     * @param context 上下文
     * @param view 视图控件Text View,EditText,Button
     * @param ttf 字体文件
     */
    public static void setTypeFace(Context context, View view, String ttf){

        Typeface typeface = Typeface.createFromAsset(context.getAssets(), ttf);
        if(view instanceof Button){
            ((Button) view).setTypeface(typeface);
        }else if (view instanceof EditText){
            ((EditText) view).setTypeface(typeface);
        }else if (view instanceof TextView){
            ((TextView) view).setTypeface(typeface);
        }
    }
}
