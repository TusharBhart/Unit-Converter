package com.example.unitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.*

class TImeActivity : AppCompatActivity() {
    val timeUnits=arrayOf("Millisecond","Second","Minute","Hour","Day")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time)

        val lengthSpinner1 = findViewById<Spinner>(R.id.lengthSpinner1)
        lengthSpinner1.adapter = ArrayAdapter<String>(this, R.layout.customspinnertime, timeUnits)
        (lengthSpinner1.adapter as ArrayAdapter<String>).setDropDownViewResource(R.layout.customdropdowntime)

        val lengthSpinner2 = findViewById<Spinner>(R.id.lengthSpinner2)
        lengthSpinner2.adapter = ArrayAdapter<String>(this, R.layout.customspinnertime, timeUnits)
        (lengthSpinner2.adapter as ArrayAdapter<String>).setDropDownViewResource(R.layout.customdropdowntime)

        val e1 = findViewById<EditText>(R.id.entry1)
        val cButton=findViewById<ImageButton>(R.id.lengthButton)
        cButton.isEnabled=false
        e1.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun afterTextChanged(p0: Editable?) {
                cButton.isEnabled=true
            }
        })
    }
    fun ibutton(view: View){
        Toast.makeText(this,"EX represents 10^X", Toast.LENGTH_SHORT).show()
    }

    fun convertButton(view: View) {
        val lengthSpinner1 = findViewById<Spinner>(R.id.lengthSpinner1)
        val lengthSpinner2 = findViewById<Spinner>(R.id.lengthSpinner2)
        val e1 = findViewById<EditText>(R.id.entry1)

        val unit1 = lengthSpinner1.selectedItem.toString()
        val unit2 = lengthSpinner2.selectedItem.toString()
        val output = findViewById<TextView>(R.id.output)


        ///////////////MILLISECONDS/////////////////////
        if (unit1 == "Millisecond" && unit2 == "Millisecond") {
            val msg = e1.text.toString().toFloat()
            val ans = msg
            output.text = "$msg Milliseconds = $ans Milliseconds"
        }
        if (unit1 == "Millisecond" && unit2 == "Second") {
            val msg = e1.text.toString().toFloat()
            val ans = msg/1000
            output.text = "$msg Milliseconds = $ans Seconds"
        }
        if (unit1 == "Millisecond" && unit2 == "Minute") {
            val msg = e1.text.toString().toFloat()
            val ans = msg/60000
            output.text = "$msg Milliseconds = $ans Minutes"
        }
        if (unit1 == "Millisecond" && unit2 == "Hour") {
            val msg = e1.text.toString().toFloat()
            val ans = msg/3.6e+6
            output.text = "$msg Milliseconds = $ans Hours"
        }
        if (unit1 == "Millisecond" && unit2 == "Day") {
            val msg = e1.text.toString().toFloat()
            val ans = msg/8.64e+7
            output.text = "$msg Milliseconds = $ans Days"
        }
        ///////////////SECONDS/////////////////////
        if (unit1 == "Second" && unit2 == "Millisecond") {
            val msg = e1.text.toString().toFloat()
            val ans = msg*1000
            output.text = "$msg Seconds = $ans Milliseconds"
        }
        if (unit1 == "Second" && unit2 == "Second") {
            val msg = e1.text.toString().toFloat()
            val ans = msg
            output.text = "$msg Seconds = $ans Seconds"
        }
        if (unit1 == "Second" && unit2 == "Minute") {
            val msg = e1.text.toString().toFloat()
            val ans = msg/60
            output.text = "$msg Seconds = $ans Minutes"
        }
        if (unit1 == "Second" && unit2 == "Hour") {
            val msg = e1.text.toString().toFloat()
            val ans = msg/3600
            output.text = "$msg Seconds = $ans Hours"
        }
        if (unit1 == "Second" && unit2 == "Day") {
            val msg = e1.text.toString().toFloat()
            val ans = msg/86400
            output.text = "$msg Seconds = $ans Days"
        }

        ///////////////MINUTES/////////////////////
        if (unit1 == "Minute" && unit2 == "Millisecond") {
            val msg = e1.text.toString().toFloat()
            val ans = msg*60000
            output.text = "$msg Minutes = $ans Milliseconds"
        }
        if (unit1 == "Minute" && unit2 == "Second") {
            val msg = e1.text.toString().toFloat()
            val ans = msg*60
            output.text = "$msg Minutes = $ans Seconds"
        }
        if (unit1 == "Minute" && unit2 == "Minute") {
            val msg = e1.text.toString().toFloat()
            val ans = msg
            output.text = "$msg Minutes = $ans Minutes"
        }
        if (unit1 == "Minute" && unit2 == "Hour") {
            val msg = e1.text.toString().toFloat()
            val ans = msg/60
            output.text = "$msg Minutes = $ans Hours"
        }
        if (unit1 == "Minute" && unit2 == "Day") {
            val msg = e1.text.toString().toFloat()
            val ans = msg/1440
            output.text = "$msg Minutes = $ans Days"
        }
        ///////////////HOURS/////////////////////
        if (unit1 == "Hour" && unit2 == "Millisecond") {
            val msg = e1.text.toString().toFloat()
            val ans = msg*3.6e+6
            output.text = "$msg Hours = $ans Milliseconds"
        }
        if (unit1 == "Hour" && unit2 == "Second") {
            val msg = e1.text.toString().toFloat()
            val ans = msg*3600
            output.text = "$msg Hours = $ans Seconds"
        }
        if (unit1 == "Hour" && unit2 == "Minute") {
            val msg = e1.text.toString().toFloat()
            val ans = msg*60
            output.text = "$msg Hours = $ans Minutes"
        }
        if (unit1 == "Hour" && unit2 == "Hour") {
            val msg = e1.text.toString().toFloat()
            val ans = msg
            output.text = "$msg Hours = $ans Hours"
        }
        if (unit1 == "Hour" && unit2 == "Day") {
            val msg = e1.text.toString().toFloat()
            val ans = msg/24
            output.text = "$msg Hours = $ans Days"
        }
        ///////////////DAYS/////////////////////
        if (unit1 == "Day" && unit2 == "Millisecond") {
            val msg = e1.text.toString().toFloat()
            val ans = msg*8.64e+7
            output.text = "$msg Days = $ans Milliseconds"
        }
        if (unit1 == "Day" && unit2 == "Second") {
            val msg = e1.text.toString().toFloat()
            val ans = msg*86400
            output.text = "$msg Days = $ans Seconds"
        }
        if (unit1 == "Day" && unit2 == "Minute") {
            val msg = e1.text.toString().toFloat()
            val ans = msg*1440
            output.text = "$msg Days = $ans Minutes"
        }
        if (unit1 == "Day" && unit2 == "Hour") {
            val msg = e1.text.toString().toFloat()
            val ans = msg*24
            output.text = "$msg Days = $ans Hours"
        }
        if (unit1 == "Day" && unit2 == "Day") {
            val msg = e1.text.toString().toFloat()
            val ans = msg
            output.text = "$msg Days = $ans Days"
        }


    }
}