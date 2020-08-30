package com.vesarom.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import android.view.View.OnClickListener as OnClickListener1

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton : Button = findViewById(R.id.btn_rolDice)
        rollButton.setOnClickListener(this)
    }

    override fun onClick(view : View?) {
        when (view?.id) {
            R.id.btn_rolDice -> rollDice()
            else -> doNothing()
        }
    }

    private fun rollDice() {
        Toast.makeText(this,"button clicked", Toast.LENGTH_SHORT).show()
    }

    private fun doNothing() {}
}