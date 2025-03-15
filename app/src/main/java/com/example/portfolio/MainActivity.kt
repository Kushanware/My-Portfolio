package com.example.portfolio

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Switch
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {


    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find buttons by their ID
        val aboutMeButton = findViewById<Button>(R.id.btn1)
        val educationButton = findViewById<Button>(R.id.btn2)
        val certificateButton = findViewById<Button>(R.id.btn3)
        val projectButton = findViewById<Button>(R.id.btn4)
        val resumeButton = findViewById<Button>(R.id.btn5)

        // Find social media ImageViews by their ID
        val instagram = findViewById<ImageView>(R.id.Insta)
        val facebook = findViewById<ImageView>(R.id.Facebook)
        val linkedin = findViewById<ImageView>(R.id.Linkdln)
        val email = findViewById<ImageView>(R.id.Emailview)
        val github = findViewById<ImageView>(R.id.Github)



        // Button click listeners for navigation
        aboutMeButton.setOnClickListener {
            val intent = Intent(this, Aboutme::class.java)
            startActivity(intent)
        }
        educationButton.setOnClickListener {
            val intent = Intent(this, Education::class.java)
            startActivity(intent)
        }
        certificateButton.setOnClickListener {
            val intent = Intent(this, Certificates::class.java)
            startActivity(intent)
        }
        projectButton.setOnClickListener {
            val intent = Intent(this, Projects::class.java)
            startActivity(intent)
        }

        // Open resume link
        resumeButton.setOnClickListener {
            val url = "https://drive.google.com/file/d/1Equ6cogqWIGGRekVLJvnx0xida47M7v-/view?usp=drive_link"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }

        // Social media link click listeners
        instagram.setOnClickListener {
            val url = "https://www.instagram.com/kush_shanware?igsh=aWxnazIyZzgwdDZs"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }

        facebook.setOnClickListener {
            val url = "https://www.facebook.com/kush.shanware.5?mibextid=JRoKGi"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }

        linkedin.setOnClickListener {
            val url = "https://www.linkedin.com/in/kushshanware/"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }

        email.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:shanwarekush@gmail.com")
            }
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            }
        }


        github.setOnClickListener {
            val url = "https://github.com/Kushanware"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }
    }
}
