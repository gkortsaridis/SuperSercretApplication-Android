package co.uk.geokor.supersecretapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    /*
    KEYSTORE info:
    keystore password -> sample
    key -> key0
    key pass -> sample
     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getStuffFromInternet()

        Log.i("I will ENCRYPT something", encryptSomethingImportant("something"))

        findViewById<Button>(R.id.next_btn).setOnClickListener { startActivity(Intent(this, SecretActivity::class.java)) }
    }

    private fun encryptSomethingImportant(unencryptedValue: String): String {
        return unencryptedValue.reversed()
    }

    private fun getStuffFromInternet() : String {
        val url = "https://aws.amazon.com/"
        return "haha! Just kidding"
    }

}