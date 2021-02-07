package app.itakura.reirei.gameapp

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val dataStore: SharedPreferences = getSharedPreferences("DataStore", Context.MODE_PRIVATE)

        val editor = dataStore.edit()

        editor.apply()
        val whenText = dataStore.getString("when","NoData")
        whenTextView.text = whenText
//        editor.putString("When",whenText)
        val whereText = dataStore.getString("where","NoData")
        whereTextView.text = whereText
//        editor.putString("Where",whereText)
        val whoText = dataStore.getString("who","NoData")
        whoTextView.text = whoText
//        editor.putString("Who",whereText)
        val whatText = dataStore.getString("what","NoData")
        whatTextView.text = whatText
    }
}