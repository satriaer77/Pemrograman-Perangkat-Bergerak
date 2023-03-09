package com.example.profile


import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_profile.*

class Profile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        viewpager_main.adapter = PageAdapter(supportFragmentManager)

        // Button github link
        github.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/satriaer77")))
        }

        // Instagram button link
        instagram.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/ppic_bimasatria/")))
        }
    }
}