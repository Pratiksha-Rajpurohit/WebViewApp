package com.pratiksha.webviewapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn : Button = findViewById(R.id.btn)
        val edt : EditText = findViewById(R.id.edt)

        btn.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)

            intent.putExtra("url" , edt.text.toString() )
            startActivity(intent)
        }

    }
}