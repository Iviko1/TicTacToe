package com.example.tictacgit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var player1 : EditText
    private lateinit var player2 : EditText
    private lateinit var nextButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        player1 = findViewById(R.id.editTextPersonName)
        player2 = findViewById(R.id.editTextPersonName2)
        nextButton = findViewById(R.id.nextButton)

        nextButton.setOnClickListener {

            val name1: String = player1.text.toString()
            val name2: String = player2.text.toString()

            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("NAME1", name1)
            intent.putExtra("NAME2", name2)

            startActivity(intent)
        }


    }



}