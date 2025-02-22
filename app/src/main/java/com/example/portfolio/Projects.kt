package com.example.portfolio

import android.os.Bundle
import android.text.Html
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Projects : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_projects) // Ensure this is the correct layout for projects

        // Adjust insets for window
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Find the TextView by its ID
        val projectsTextView = findViewById<TextView>(R.id.projectTextView)

        // Define the formatted content using HTML
        val content = """
    <b>1. Portfolio App</b><br>
    An Android-based portfolio application showcasing skills, education, and projects.<br>
    <b>Technologies Used:</b> Kotlin, Android SDK, XML<br><br>
    
    <b>2. Calculator App</b><br>
    An Android application that provides basic calculator functionalities, including arithmetic operations.<br>
    <b>Technologies Used:</b> Kotlin, Android SDK, XML<br><br>
    
    <b>3. Book Shopping and Viewing Website</b><br>
    A web application for browsing and purchasing books, featuring an intuitive user interfac.<br>
    <b>Technologies Used:</b> HTML, CSS, JavaScript<br><br>
"""

        // Set the HTML-formatted content to the TextView
        projectsTextView.text = Html.fromHtml(content, Html.FROM_HTML_MODE_LEGACY)
    }
}
