package com.example.bobbysandroidstartersolution
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ActivityNavigator
import com.example.bobbysandroidstartersolution.HighScoreActivity
class StartGame : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.start_game_layout)
        //Game currently not implemented


        /*val startButton = findViewById<Button>(R.id.start_button)
        startButton.setOnClickListener {
            val intent = Intent(this, StartGameActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Hello, world!", Toast.LENGTH_SHORT).show()
        }
        val highScoreButton = findViewById<Button>(R.id.high_score_button)
        highScoreButton.setOnClickListener {
            val intent = Intent(this, HighScoreActivity::class.java)
            startActivity(intent)
        }*/
    }
}