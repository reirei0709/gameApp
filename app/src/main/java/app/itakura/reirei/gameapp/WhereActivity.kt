package app.itakura.reirei.gameapp

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.button
import kotlinx.android.synthetic.main.activity_where.*

class WhereActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_where)

        val dataStore: SharedPreferences = getSharedPreferences("DataStore", Context.MODE_PRIVATE)

        button.setOnClickListener {

            val toSecondActivity = Intent(this,WhoActivity::class.java)
            startActivity(toSecondActivity)

            val whereStringText = whereEditText.text.toString()
            //saveText.text = stringText

            val editor = dataStore.edit()
            editor.putString("where",whereStringText)

            editor.apply()
            val whenText = dataStore.getString("when","NoData")
            Log.d("when",whenText.toString())
            editor.putString("when",whenText)


        }
    }
    }
