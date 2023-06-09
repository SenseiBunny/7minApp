package eu.pl.snk.senseibunny.a7minuteapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.FrameLayout
import android.widget.Toast
import eu.pl.snk.senseibunny.a7minuteapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    // you use name of xml activity here
    private var binding: ActivityMainBinding?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root) // top element of xml file is root

        binding?.flstart?.setOnClickListener{
            val intent = Intent(this,ExerciseAvtivity::class.java)
            startActivity(intent)
        }

        binding?.BMI?.setOnClickListener{
            val intent = Intent(this,BmiActivity::class.java)
            startActivity(intent)
        }

        binding?.history?.setOnClickListener{
            val intent = Intent(this,HistoryActivity::class.java)
            startActivity(intent)
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        binding=null
    }
}