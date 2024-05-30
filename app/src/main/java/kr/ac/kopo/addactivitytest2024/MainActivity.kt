package kr.ac.kopo.addactivitytest2024

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup

class MainActivity : AppCompatActivity() {
    lateinit var rg : RadioGroup
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var rg = findViewById<RadioGroup>(R.id.rg)
        rg.check(R.id.radioSecond)
        var btnMain = findViewById<Button>(R.id.btnMain)
        var intent = Intent(this@MainActivity, SecondActivity::class.java)
        rg.setOnCheckedChangeListener{ group, chekedId ->
            when(chekedId){
                R.id.radioSecond -> intent = Intent(this@MainActivity, SecondActivity::class.java)
                R.id.radioThird -> intent = Intent(this@MainActivity, ThirdActivity::class.java)
            }

        }
        btnMain.setOnClickListener{
            startActivity(intent)
        }
    }
}