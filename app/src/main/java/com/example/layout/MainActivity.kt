package com.example.layout

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        try {
            this.supportActionBar!!.hide()
        } catch (e: NullPointerException) {
        }
        setContentView(R.layout.activity_main)

        val linearLayoutBtn = this.findViewById<Button>(R.id.LinearLayoutBtn)
        val constraintLayoutBtn = this.findViewById<Button>(R.id.ConstraintLayoutBtn)
        val relativeLayoutBtn = this.findViewById<Button>(R.id.RelativeLayoutBtn)

        linearLayoutBtn.setOnClickListener {
            var i = Intent(this, LinearLayoutActivity::class.java)
            startActivity(i)
        }
        constraintLayoutBtn.setOnClickListener {
            var i = Intent(this, ConstraintLayoutActivity::class.java)
            startActivity(i)
        }
        relativeLayoutBtn.setOnClickListener {
            var i = Intent(this, RelativeLayoutActivity::class.java)
            startActivity(i)
        }
    }
}