package com.example.ml23dm02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        val btnClose = findViewById<ImageButton>(R.id.btnClose);
        val nome = intent.extras!!.getString("nome")!!;
        val phone = intent.extras!!.getString("phone")!!;
        val email = intent.extras!!.getString("email")!!;
        val profile = intent.extras!!.getBoolean("profile")!!;

        findViewById<TextView>(R.id.txtNome).text = "Nome: $nome";
        findViewById<TextView>(R.id.txtTel).text = "Telefone: $phone";
        findViewById<TextView>(R.id.txtEmail).text = "E-mail: $email";
        findViewById<TextView>(R.id.txtProfile).text = if(profile) "Público: SIM" else "Público: NÃO";

        btnClose.setOnClickListener {
            finish();
        }
    }


}