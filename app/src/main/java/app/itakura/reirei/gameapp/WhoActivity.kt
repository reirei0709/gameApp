package app.itakura.reirei.gameapp

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.button
import kotlinx.android.synthetic.main.activity_where.*
import kotlinx.android.synthetic.main.activity_where.whereEditText
import kotlinx.android.synthetic.main.activity_who.*

class WhoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_who)

        val dataStore: SharedPreferences = getSharedPreferences("DataStore", Context.MODE_PRIVATE)

        button.setOnClickListener {
            val toSecondActivity = Intent(this,WhatActivity::class.java)
            startActivity(toSecondActivity)

            val whoStringText = whoEditText.text.toString()
            //saveText.text = stringText

            val editor = dataStore.edit()
            editor.putString("who",whoStringText)

            editor.apply()
            val whenText = dataStore.getString("when","NoData")
            editor.putString("when",whenText)
            val whereText = dataStore.getString("where","NoData")
            editor.putString("where",whereText)

        }
    }
}