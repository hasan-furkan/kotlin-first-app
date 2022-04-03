package com.example.merhabadunya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.merhabadunya.R.layout.activity_main
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main)
        btnGoster.setOnClickListener{
            goster.text = adSoyad.text;
            adSoyad.text.clear();
        }

    }
}