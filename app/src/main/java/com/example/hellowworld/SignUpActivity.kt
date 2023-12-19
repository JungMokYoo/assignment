package com.example.hellowworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)


        val signIn_name = findViewById<EditText>(R.id.editTextDate2)
        val signIn_id = findViewById<EditText>(R.id.editTextDate3)
        val signIn_password = findViewById<EditText>(R.id.etv_password2)

        val btn = findViewById<Button>(R.id.btn_ready)
        btn.setOnClickListener {

            if(signIn_name.text.toString().isEmpty() || signIn_id.text.toString().isEmpty()
                || signIn_password.text.toString().isEmpty()){
                Toast.makeText(this,"입력되지 않은 정보가 있습니다.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }



            finish()
        }


    }
}