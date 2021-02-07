package app.itakura.reirei.gameapp

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataStore: SharedPreferences = getSharedPreferences("DataStore", Context.MODE_PRIVATE)

        button.setOnClickListener {

            val toSecondActivity = Intent(this,WhereActivity::class.java)
            startActivity(toSecondActivity)

            val whenStringText = whenEditText.text.toString()
            //saveText.text = stringText

            val editor = dataStore.edit()
            editor.putString("when",whenStringText)
            Log.d("when",whenStringText)

            editor.apply()
//            val str = dataStore.getString("Input","NoData")
//            readText.text = str
        }
    }
}