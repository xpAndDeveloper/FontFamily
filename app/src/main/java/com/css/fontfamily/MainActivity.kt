package com.css.fontfamily

import android.os.Bundle
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.css.fontfamilylib.FontType
import com.css.fontfamilylib.setFontFamily

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content_main)
        findViewById<TextView>(R.id.text).setFontFamily(FontType.Light)
    }
}