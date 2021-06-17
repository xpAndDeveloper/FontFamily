package com.css.fontfamilylib

import android.content.Context
import android.content.res.AssetManager
import android.graphics.Typeface
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat
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
            FontType.Light -> ResourcesCompat.getFont(this.context, R.font.md_font_family_light)
            FontType.Medium -> ResourcesCompat.getFont(this.context, R.font.md_font_family_medium)
            FontType.Regula -> ResourcesCompat.getFont(this.context, R.font.md_font_family_regula)
        }
        this.typeface = tf
    } catch (e: Exception) {
        //
    }
}

/**
 * 根据type 获取TypeFace
 */
fun Context.getTypeFace(fontType:FontType):Typeface?{
    return try {
        when(fontType){
            FontType.Light -> ResourcesCompat.getFont(this, R.font.md_font_family_light)
            FontType.Medium -> ResourcesCompat.getFont(this, R.font.md_font_family_medium)
            FontType.Regula -> ResourcesCompat.getFont(this, R.font.md_font_family_regula)
        }
    } catch (e: Exception) {
        null
    }
}