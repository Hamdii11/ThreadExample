package id.ac.polbeng.kurniawanhamdi.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*
import java.util.logging.Logger

class SecondActivity : AppCompatActivity() {
    val Log = Logger.getLogger(SecondActivity::class.java.name)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.info("onCreate")
        btnExitActivity.setOnClickListener {
            finish()
        }
    }
    override fun onPause() {
        super.onPause()
        Log.info("onPause")
    }
    override fun onRestart() {
        super.onRestart()
        Log.info("onRestart")
    }
    override fun onResume() {
        super.onResume()
        Log.info("onResume")
    }
}

