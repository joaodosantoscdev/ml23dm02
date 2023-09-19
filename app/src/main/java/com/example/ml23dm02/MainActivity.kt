package com.example.ml23dm02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        val btnNext = findViewById<ImageButton>(R.id.btnNext);
        val btnClose = findViewById<ImageButton>(R.id.btnClose);
        val name = findViewById<EditText>(R.id.edtNome);
        val phone = findViewById<EditText>(R.id.edtTel);

        btnNext.setOnClickListener {

            val bundle = Bundle();
            bundle.putString("name", name.text.toString());
            bundle.putString("phone", phone.text.toString());

            val i = Intent(this, Activity2::class.java);
            i.putExtras(bundle);
            startActivity(i);
        }

        btnClose.setOnClickListener {
            finish();
        }
    }
}