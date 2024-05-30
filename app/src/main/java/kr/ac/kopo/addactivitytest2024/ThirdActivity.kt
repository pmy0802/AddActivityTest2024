package kr.ac.kopo.addactivitytest2024

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        var btnThird = findViewById<Button>(R.id.btnThird)
        btnThird.setOnClickListener {
            finish()
        }
    }
}