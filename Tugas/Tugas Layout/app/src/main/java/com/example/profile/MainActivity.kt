package com.example.profile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.os.Handler


class MainActivity : AppCompatActivity() {

    var progressAngka = 0
    var handler: Handler? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Loading Progress menggunakan Callback
        handler = Handler(Handler.Callback {
            progressAngka++
            progressBar.progress = progressAngka
            progressText.text = "${progressAngka}%"
            if(progressAngka == 100) {
                finish() // Stop activity
                startActivity(Intent(this, Profile::class.java)) //Pindah Activity
            }

            handler?.sendEmptyMessageDelayed(0, 20) //Delay callback function
            true
        })


        handler?.sendEmptyMessage(0)
        //End Loading Progress
    }


}