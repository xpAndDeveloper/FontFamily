package com.css.fontfamilylib

import android.content.res.AssetManager
import android.graphics.Typeface
import android.widget.TextView

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
        val mgr: AssetManager = this.context.assets
        val tf = when(fontType){
            FontType.Light -> Typeface.createFromAsset(mgr, "font/notosanshans_light.otf")
            FontType.Medium -> Typeface.createFromAsset(mgr, "font/notosanshans_medium.otf")
            FontType.Regula -> Typeface.createFromAsset(mgr, "font/notosanshans_regula.otf")
        }
        this.typeface = tf
    } catch (e: Exception) {
        //
    }
}