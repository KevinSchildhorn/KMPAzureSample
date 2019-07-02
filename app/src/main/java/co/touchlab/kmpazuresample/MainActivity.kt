package co.touchlab.kmpazuresample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import co.touchlab.shared.Platform
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.text = Platform().name
    }
}
