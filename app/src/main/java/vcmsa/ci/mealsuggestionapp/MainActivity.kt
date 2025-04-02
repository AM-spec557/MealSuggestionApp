@file:Suppress("UNUSED_VARIABLE")

package vcmsa.ci.mealsuggestionapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // Declaring Ui elements
        val editTextTime = findViewById<EditText>(R.id.editTextTime)
        val buttonSuggest = findViewById<Button>(R.id.buttonSuggest)
        val buttonReset = findViewById<Button>(R.id.buttonReset)
        val textViewSuggestion = findViewById<TextView>(R.id.textViewSuggestion)
        //Author: Zahra Bulbulia
        //url:https://github.com/zb662000/assignmen.git

        //This button will show meal suggestions when a user types in any of the following times of day
        buttonSuggest.setOnClickListener {}
        val timeOfDay = editTextTime.text.toString().trim()
        val suggestion = when (timeOfDay.lowercase()) {
            "morning" -> "Breakfast - How about some eggs and toast?"
            "mid-morning" -> "lunch - Maybe a sandwich or salad?"
            "afternoon" -> "Snack - Try some fruit or yogurt!"
            "mid-afternoon" -> "Dinner - How about pasta or grilled chicken?"
            "dinner" -> "Enjoy a nice meal with family and friends."
            else -> "Please enter a valid time of day."
        }
        textViewSuggestion.text = suggestion
    }

    //this will reset the text view and the edit text box
    //Author: Zahra Bulbulia
    //url:https://github.com/zb662000/assignmen.git
//    buttonReset.setOnClickListener {
//        val editTextTime.text.clear()
//        val textViewSuggestion.text = ""
            
        }

