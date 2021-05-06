package com.example.counterhomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var count = 0

    lateinit var showCount: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showCount = findViewById(R.id.text_show)

        if(savedInstanceState != null) {
            count = savedInstanceState.getInt("count")
            showCount.setText(count.toString())
        }
    }

    fun increase_count(view: View) {
        count++
        showCount.setText(count.toString())
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("count", count)
    }
}