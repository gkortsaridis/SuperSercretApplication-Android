package co.uk.geokor.supersecretapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecretActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secret)

        findViewById<TextView>(R.id.hidden_msg).text = Constants.AWS_SECRET_KEY
    }
}