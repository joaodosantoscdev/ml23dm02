package com.example.ml23dm02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import androidx.appcompat.widget.SwitchCompat

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        val name = intent.extras!!.getString("name")!!;
        val phone = intent.extras!!.getString("phone")!!;

        val email = findViewById<EditText>(R.id.edtEmail);
        val profile = findViewById<SwitchCompat>(R.id.edtPublic);
        val btnNext2 = findViewById<ImageButton>(R.id.btnNext2);
        val btnClose = findViewById<ImageButton>(R.id.btnClose);

        btnNext2.setOnClickListener {
            val bundle = Bundle();

            bundle.putString("nome", name);
            bundle.putString("phone", phone);
            bundle.putString("email", email.text.toString());
            bundle.putBoolean("profile", profile.isChecked());

            val i = Intent(this, Activity3::class.java);
            i.putExtras(bundle);

            startActivity(i);
        }

        btnClose.setOnClickListener {
            finish();
        }
    }
}