package com.example.hellowworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val strData = intent.getStringExtra("dataFromFirstActivity")
        val editText = findViewById<EditText>(R.id.editTextDate4)
        if (strData != null) {
            Log.d("intent",strData)
        }
        val btn = findViewById<Button>(R.id.btnFinish)

        editText.setText(strData)

        btn.setOnClickListener {
            finish()
        }


    }
}