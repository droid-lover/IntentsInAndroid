package com.nativemobilebits.intentsinandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    lateinit var valueEnteredByUser : String
    lateinit var tvSecondActivity :TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        tvSecondActivity = findViewById(R.id.tvSecondActivity)

        valueEnteredByUser = intent?.getStringExtra("dataEnteredByUser")?:""

        tvSecondActivity.text = valueEnteredByUser
    }
}