package com.example.portfolio

import android.os.Bundle
import android.text.Html
import android.text.method.LinkMovementMethod
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
            Show credential by Google<br><br>

            <b>What Is Generative AI?</b><br>
            Issued by LinkedIn in Mar 2025<br>
            <a href="https://www.linkedin.com/learning/certificates/77ae127f8d2fb3b885a503cedfa9fb91dd836f7f0eee02db601c15e43e7932f7">
            View Credential</a><br><br>

            <b>Walmart USA - Advanced Software Engineering Job Simulation</b><br>
            Issued by Forage in Jan 2025<br>
            Credential ID: CDhDWda7suKcz7Ss4<br>
            <a href="https://forage-uploads-prod.s3.amazonaws.com/completion-certificates/prBZoAihniNijyD6d/oX6f9BbCL9kJDJzfg_prBZoAihniNijyD6d_Mv7KL8bZ9QuLHozYM_1737298895902_completion_certificate.pdf">
            View Credential</a><br>
        """

        certificatesTextView.text = Html.fromHtml(content, Html.FROM_HTML_MODE_LEGACY)
        certificatesTextView.movementMethod = LinkMovementMethod.getInstance()
    }
}
