package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import kotlin.random.Random
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollbutton = findViewById<Button>(R.id.rollbutton)
        val textView2 = findViewById<TextView>(R.id.textView2)
        val seekBar = findViewById<SeekBar>(R.id.seekBar)

        rollbutton.setOnClickListener {
            val rand = java.util.Random().nextInt(seekBar.progress)
            textView2.text=rand.toString()

        }
    }
}
