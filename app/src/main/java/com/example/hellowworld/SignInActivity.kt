package com.example.hellowworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)


        val btn = findViewById<Button>(R.id.btnLog)
        val btn2 = findViewById<Button>(R.id.btn_signIn)
        val edit_text = findViewById<EditText>(R.id.editTextDate)
        val edit_pass = findViewById<EditText>(R.id.etv_password)


        btn.setOnClickListener {

            if(edit_text.text.toString().isEmpty() || edit_pass.text.toString().isEmpty()){
                Toast.makeText(this,"아이디 와 비밀번호를 모두 입력해주세요",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val strData = edit_text.text.toString()
            val intent = Intent(this,HomeActivity::class.java)
            intent.putExtra("dataFromFirstActivity",strData)
            Log.d("intent",strData)
            startActivity(intent)
        }


        btn2.setOnClickListener{
            val intent = Intent(this,SignUpActivity::class.java)
            startActivity(intent)
        }


    }
}
