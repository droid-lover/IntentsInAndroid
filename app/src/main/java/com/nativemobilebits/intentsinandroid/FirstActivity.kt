package com.nativemobilebits.intentsinandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class FirstActivity : AppCompatActivity() {

    lateinit var btnFirstActivity : Button
    lateinit var etText : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        btnFirstActivity = findViewById(R.id.btnFirstActivity)
        etText = findViewById(R.id.etText)

        btnFirstActivity.setOnClickListener {
//            goToSecondScreen()
            shareTextToApps()
        }
    }

    private fun goToSecondScreen(){

        val valueEnteredByUser = etText.text.toString()

        val intent = Intent(this@FirstActivity ,SecondActivity::class.java)
        intent.putExtra("dataEnteredByUser", valueEnteredByUser)
        intent.putExtra("randomData",true)
        startActivity(intent)

    }

    private fun shareTextToApps(){
        val valueEnteredByUser = etText.text.toString()

        val intent = Intent(Intent.ACTION_SEND)
        intent.type = "text/plain"
        intent.putExtra(Intent.EXTRA_TEXT,valueEnteredByUser)
        startActivity(intent)
    }













}