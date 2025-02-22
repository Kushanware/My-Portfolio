package com.example.portfolio

import android.os.Bundle
import android.text.Html
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView

class Education : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_education)

        // Adjust insets for window if required
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Find the TextView by its ID
        val educationTextView = findViewById<TextView>(R.id.educationTextView)

        // Define the formatted content using HTML
        val content = """
            <b>Education Details</b><br><br>
            <b>1. Bachelor of Technology (B.Tech) in Information Technology</b><br>
            Priyadarshini College of Engineering, Nagpur<br>
            Completed on: 2027<br><br>
            
            <b>2. High School Diploma in Science</b><br>
            Progressive High School<br>
            Completed: 2021<br><br>
            
            <center><b>SKILLS</b></center><br>
            <b>A. <b>Technical Skills </b><br>
            <b>1. Programming Languages:</b> C++, C, Kotlin
            <b>2. Operating Systems:</b> Windows, Linux
            <b>3. Programming Tools:</b> Visual Studio Code, Android Studio
            <b>4. Software Development:</b> Android
            <br><br>
            
         
        """

        // Set the HTML-formatted content to the TextView
        educationTextView.text = Html.fromHtml(content, Html.FROM_HTML_MODE_LEGACY)
    }
}
