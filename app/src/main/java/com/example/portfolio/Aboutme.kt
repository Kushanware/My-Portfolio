package com.example.portfolio

import android.os.Bundle
import android.text.Html
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView

class Aboutme : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_aboutme)

        // Adjust insets for the window (as you already have)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Find the TextView by its ID
        val aboutMeTextView = findViewById<TextView>(R.id.aboutmeTextView)

        // Define the formatted content using HTML
        val content = """
            <b>My Academic Journey</b><br><br>
            My academic journey began at Priyadarshini College of Engineering, where I pursued Information Technology.
            However, my love for coding sparked much earlier, during my high school days when I first learned C++.
            This initial exposure ignited a deep passion that has only grown stronger over time.<br><br>

            <b>Continuous Learning</b><br><br>
            Driven by a desire to stay at the forefront of technology and innovation, I've continuously expanded my 
            programming skillset by exploring various languages. My focus has always leaned towards practical knowledge, 
            and throughout my teenage years, I actively pursued hands-on learning experiences in several areas:<br><br>

            <b>1. Drone Building:</b> I delved into the fascinating world of drone construction, specifically focusing on 
            crafting custom FPV drones. This involved learning about the underlying concepts, calibration processes, and 
            programming techniques.<br><br>

            <b>2. Programming Languages:</b> My programming journey began with C++, which I encountered during my 12th-grade 
            computer science curriculum. However, I didn't stop there; I actively explored additional languages to broaden 
            my skillset.<br><br>

            <b>3. Operating System Exploration:</b> I ventured into the world of dual booting by learning how to install a 
            secondary operating system on a computer. Additionally, I explored the concept of flashing custom ROMs on 
            Android devices.<br><br>

            <b>4. PC Building and Arduino Projects:</b> Building PCs and working on Arduino projects became some of my favorite 
            hobbies, allowing me to combine my passion for technology with a hands-on approach.<br><br>

            <b>5. Electrical Knowledge:</b> I've also acquired some practical knowledge in the field of electrical work, which 
            further complements my technical skillset.
        """

        // Set the HTML-formatted content to the TextView
        aboutMeTextView.text = Html.fromHtml(content, Html.FROM_HTML_MODE_LEGACY)
    }
}
