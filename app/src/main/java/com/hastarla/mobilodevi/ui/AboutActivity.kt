package com.hastarla.mobilodevi.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hastarla.mobilodevi.R
import kotlinx.android.synthetic.main.toolbar.*

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        setSupportActionBar(ac_toolbar)

        supportActionBar?.apply {
            title = "Hakkında"
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}