package com.example.ui_xml

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Encuentra el botón (o cualquier otro componente) para navegar al dashboard
        val buttonToDashboard = findViewById<Button>(R.id.LoginBtn)

        buttonToDashboard.setOnClickListener {
            // Al hacer clic, pasamos a la actividad del dashboard
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
        }
    }
}
