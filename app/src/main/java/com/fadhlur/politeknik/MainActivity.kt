package com.fadhlur.politeknik

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var btnMi : Button
    private lateinit var btnTekom : Button
    private lateinit var btnFoto  : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnMi = findViewById(R.id.btnMi)
        btnTekom = findViewById(R.id.btnTekom)
        btnFoto = findViewById(R.id.btnFoto)

        btnMi.setOnClickListener(){
            val intent = Intent(this, PageMi::class.java)
            startActivity(intent)
        }
        btnTekom.setOnClickListener(){
            val intent = Intent(this, PageTK::class.java)
            startActivity(intent)
        }
        btnFoto.setOnClickListener(){
            val intent = Intent(this, galery::class.java)
            startActivity(intent)
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}