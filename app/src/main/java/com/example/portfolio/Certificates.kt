package com.example.portfolio

import android.os.Bundle
import android.text.Html
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Certificates : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_certificates)

        // Adjust insets for window
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Find the TextView by its ID
        val certificatesTextView = findViewById<TextView>(R.id.certificatesTextView)

        // Define the formatted content using HTML
        val content = """
            <b>Student Ambassador at LetsUpgrade · Freelance</b><br>
            Jun 2024 - Present · Nagpur, Maharashtra, India<br><br>

            <b>App Building with AppSheet Skill Badge</b><br>
            Issued by Google in Apr 2024<br><br>

            <b>Cisco CPA: Programming Essentials in C++</b><br>
            Issued by Cisco in Jan 2024<br><br>

            <b>Internet of Things Applications</b><br>
            Issued by Skillsoft in Jan 2024<br>
            Credential ID: 92787939<br><br>

            <b>Ethical Hacking For Beginners</b><br>
            Issued by Simplilearn in Oct 2022<br>
            Credential ID: 3865401<br><br>

            <b>Learn Advanced C++ Course Online</b><br>
            Issued by Simplilearn in Oct 2022<br>
            Credential ID: 3872819<br><br>

            <b>Google Cloud Skill</b><br>
            Show credential by Google<br>
        """

        // Set the HTML-formatted content to the TextView
        certificatesTextView.text = Html.fromHtml(content, Html.FROM_HTML_MODE_LEGACY)
    }
}
