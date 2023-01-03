package com.example.unitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.*

class SpeedActivity : AppCompatActivity() {
    val speedUnits= arrayOf("Miles per hour","Foot per second","Meter per second","Kilometer per hour","Knot")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_speed)

        val lengthSpinner1 = findViewById<Spinner>(R.id.lengthSpinner1)
        lengthSpinner1.adapter = ArrayAdapter<String>(this, R.layout.customspinnerspeed, speedUnits)
        (lengthSpinner1.adapter as ArrayAdapter<String>).setDropDownViewResource(R.layout.customdropdownspeed)

        val lengthSpinner2 = findViewById<Spinner>(R.id.lengthSpinner2)
        lengthSpinner2.adapter = ArrayAdapter<String>(this, R.layout.customspinnerspeed, speedUnits)
        (lengthSpinner2.adapter as ArrayAdapter<String>).setDropDownViewResource(R.layout.customdropdownspeed)

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


        ///////////////MILES PER HOURS/////////////////////
        if (unit1 == "Miles per hour" && unit2 == "Miles per hour") {
            val msg = e1.text.toString().toFloat()
            val ans = msg
            output.text = "$msg Miles per hour = $ans Miles per hour"
        }
        if (unit1 == "Miles per hour" && unit2 == "Foot per second") {
            val msg = e1.text.toString().toFloat()
            val ans = msg*1.467
            output.text = "$msg Miles per hour = $ans Feet per second"
        }
        if (unit1 == "Miles per hour" && unit2 == "Meter per second") {
            val msg = e1.text.toString().toFloat()
            val ans = msg/2.237
            output.text = "$msg Miles per hour = $ans Meters per second"
        }
        if (unit1 == "Miles per hour" && unit2 == "Kilometer per hour") {
            val msg = e1.text.toString().toFloat()
            val ans = msg*1.609
            output.text = "$msg Miles per hour = $ans Kilometers per hour"
        }
        if (unit1 == "Miles per hour" && unit2 == "Knot") {
            val msg = e1.text.toString().toFloat()
            val ans = msg/1.151
            output.text = "$msg Miles per hour = $ans Knots"
        }
        ///////////////FEET PER SECOND/////////////////////
        if (unit1 == "Foot per second" && unit2 == "Miles per hour") {
            val msg = e1.text.toString().toFloat()
            val ans = msg/1.467
            output.text = "$msg Feet per second = $ans Miles per hour"
        }
        if (unit1 == "Foot per second" && unit2 == "Foot per second") {
            val msg = e1.text.toString().toFloat()
            val ans = msg
            output.text = "$msg Feet per second = $ans Feet per second"
        }
        if (unit1 == "Foot per second" && unit2 == "Meter per second") {
            val msg = e1.text.toString().toFloat()
            val ans = msg/3.281
            output.text = "$msg Feet per second = $ans Meters per second"
        }
        if (unit1 == "Foot per second" && unit2 == "Kilometer per hour") {
            val msg = e1.text.toString().toFloat()
            val ans = msg*1.09728
            output.text = "$msg Feet per second = $ans Kilometers per hour"
        }
        if (unit1 == "Foot per second" && unit2 == "Knot") {
            val msg = e1.text.toString().toFloat()
            val ans = msg/1.688
            output.text = "$msg Feet per second = $ans Knots"
        }
        ///////////////METER PER SECOND/////////////////////
        if (unit1 == "Meter per second" && unit2 == "Miles per hour") {
            val msg = e1.text.toString().toFloat()
            val ans = msg*2.23694
            output.text = "$msg Meters per second = $ans Miles per hour"
        }
        if (unit1 == "Meter per second" && unit2 == "Foot per second") {
            val msg = e1.text.toString().toFloat()
            val ans = msg*3.28084
            output.text = "$msg Meters per second = $ans Feet per second"
        }
        if (unit1 == "Meter per second" && unit2 == "Meter per second") {
            val msg = e1.text.toString().toFloat()
            val ans = msg
            output.text = "$msg Meters per second = $ans Meters per second"
        }
        if (unit1 == "Meter per second" && unit2 == "Kilometer per hour") {
            val msg = e1.text.toString().toFloat()
            val ans = msg*3.6
            output.text = "$msg Meters per second = $ans Kilometers per hour"
        }
        if (unit1 == "Meter per second" && unit2 == "Knot") {
            val msg = e1.text.toString().toFloat()
            val ans = msg*1.94384
            output.text = "$msg Meters per second = $ans Knots"
        }
        ///////////////KILOMETER PER HOUR/////////////////////
        if (unit1 == "Kilometer per hour" && unit2 == "Miles per hour") {
            val msg = e1.text.toString().toFloat()
            val ans = msg/1.609
            output.text = "$msg Kilometers per hour = $ans Miles per hour"
        }
        if (unit1 == "Kilometer per hour" && unit2 == "Foot per second") {
            val msg = e1.text.toString().toFloat()
            val ans = msg/1.097
            output.text = "$msg Kilometers per hour = $ans Feet per second"
        }
        if (unit1 == "Kilometer per hour" && unit2 == "Meter per second") {
            val msg = e1.text.toString().toFloat()
            val ans = msg/3.6
            output.text = "$msg Kilometers per hour = $ans Meters per second"
        }
        if (unit1 == "Kilometer per hour" && unit2 == "Kilometer per hour") {
            val msg = e1.text.toString().toFloat()
            val ans = msg
            output.text = "$msg Kilometers per hour = $ans Kilometers per hour"
        }
        if (unit1 == "Kilometer per hour" && unit2 == "Knot") {
            val msg = e1.text.toString().toFloat()
            val ans = msg/1.852
            output.text = "$msg Kilometers per hour = $ans Knots"
        }
        ///////////////KNOTS/////////////////////
        if (unit1 == "Knot" && unit2 == "Miles per hour") {
            val msg = e1.text.toString().toFloat()
            val ans = msg*1.15078
            output.text = "$msg Knots = $ans Miles per hour"
        }
        if (unit1 == "Knot" && unit2 == "Foot per second") {
            val msg = e1.text.toString().toFloat()
            val ans = msg*1.68781
            output.text = "$msg Knots = $ans Feet per second"
        }
        if (unit1 == "Knot" && unit2 == "Meter per second") {
            val msg = e1.text.toString().toFloat()
            val ans = msg/1.944
            output.text = "$msg Knots = $ans Meters per second"
        }
        if (unit1 == "Knot" && unit2 == "Kilometer per hour") {
            val msg = e1.text.toString().toFloat()
            val ans = msg*1.852
            output.text = "$msg Knots = $ans Kilometers per hour"
        }
        if (unit1 == "Knot" && unit2 == "Knot") {
            val msg = e1.text.toString().toFloat()
            val ans = msg
            output.text = "$msg Knots = $ans Knots"
        }

    }
}