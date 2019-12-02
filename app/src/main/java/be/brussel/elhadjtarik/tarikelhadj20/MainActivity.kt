package be.brussel.elhadjtarik.tarikelhadj20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.view.inputmethod.InputMethodManager
import android.content.Context

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnVoegToe).setOnClickListener {
            addVak(it)
        }
    }

    private fun addVak(view: View) {
        val editText = findViewById<EditText>(R.id.editTextVak)
        val textViewInfo = findViewById<TextView>(R.id.textViewInfo)
        val bericht = editText.text.toString() + System.getProperty("line.separator")

        if (bericht.trim().isNotEmpty()){
            textViewInfo.append(bericht)
            editText.text.clear()
        }


        // Hide the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)



    }
}
