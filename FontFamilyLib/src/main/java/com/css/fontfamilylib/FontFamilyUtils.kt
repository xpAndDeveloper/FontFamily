package com.css.fontfamilylib

import android.content.res.AssetManager
import android.graphics.Typeface
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.css.fontfamily.R

/**
 * description:
 * author:         xp
 * createDate:     2021/6/16 下午 2:37
 */
enum class FontType{
    Light,
    Medium,
    Regula
}

/**
 * textView设置字体
 */
fun TextView.setFontFamily(fontType:FontType){
    try {
        val tf = when(fontType){
            FontType.Light -> Typeface.defaultFromStyle(R.style.BaseTextViewStyle_Light)
            FontType.Medium ->Typeface.defaultFromStyle(R.style.BaseTextViewStyle_Medium)
            FontType.Regula ->Typeface.defaultFromStyle(R.style.BaseTextViewStyle_Regula)
        }
        this.typeface = tf
    } catch (e: Exception) {
        //
    }
}