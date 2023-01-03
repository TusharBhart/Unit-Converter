package com.example.unitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.*

class TempertaureActivity : AppCompatActivity() {
    val tempUnits=arrayOf("Celsius","Fahrenheit","Kelvin")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_temperature)

        val lengthSpinner1 = findViewById<Spinner>(R.id.lengthSpinner1)
        lengthSpinner1.adapter = ArrayAdapter<String>(this, R.layout.customspinnertemp, tempUnits)
        (lengthSpinner1.adapter as ArrayAdapter<String>).setDropDownViewResource(R.layout.customdropdowntemp)

        val lengthSpinner2 = findViewById<Spinner>(R.id.lengthSpinner2)
        lengthSpinner2.adapter = ArrayAdapter<String>(this, R.layout.customspinnertemp, tempUnits)
        (lengthSpinner2.adapter as ArrayAdapter<String>).setDropDownViewResource(R.layout.customdropdowntemp)

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
    fun convertButton(view: View) {
        val lengthSpinner1 = findViewById<Spinner>(R.id.lengthSpinner1)
        val lengthSpinner2 = findViewById<Spinner>(R.id.lengthSpinner2)
        val e1 = findViewById<EditText>(R.id.entry1)

        val unit1 = lengthSpinner1.selectedItem.toString()
        val unit2 = lengthSpinner2.selectedItem.toString()
        val output = findViewById<TextView>(R.id.output)


        ///////////////CELSIUS/////////////////////
        if (unit1 == "Celsius" && unit2 == "Celsius") {
            val msg = e1.text.toString().toFloat()
            val ans = msg
            output.text = "$msg Celsius = $ans Celsius"
        }
        if (unit1 == "Celsius" && unit2 == "Fahrenheit") {
            val msg = e1.text.toString().toFloat()
            val ans =(msg*9/5)+32
            output.text = "$msg Celsius = $ans Fahrenheit"
        }
        if (unit1 == "Celsius" && unit2 == "Kelvin") {
            val msg = e1.text.toString().toFloat()
            val ans =msg+273.15
            output.text = "$msg Celsius = $ans Kelvin"
        }
        ///////////////FAHRENHEIT/////////////////////
        if (unit1 == "Fahrenheit" && unit2 == "Celsius") {
            val msg = e1.text.toString().toFloat()
            val ans = (msg-32)*5/9
            output.text = "$msg Fahrenheit = $ans Celsius"
        }
        if (unit1 == "Fahrenheit" && unit2 == "Fahrenheit") {
            val msg = e1.text.toString().toFloat()
            val ans =msg
            output.text = "$msg Fahrenheit = $ans Fahrenheit"
        }
        if (unit1 == "Fahrenheit" && unit2 == "Kelvin") {
            val msg = e1.text.toString().toFloat()
            val ans =((msg-32)*5/9)+273.15
            output.text = "$msg Fahrenheit = $ans Kelvin"
        }
        ///////////////KELVIN/////////////////////
        if (unit1 == "Kelvin" && unit2 == "Celsius") {
            val msg = e1.text.toString().toFloat()
            val ans = msg-273.15
            output.text = "$msg Kelvin = $ans Celsius"
        }
        if (unit1 == "Kelvin" && unit2 == "Fahrenheit") {
            val msg = e1.text.toString().toFloat()
            val ans =((msg-273.15)*9/5)+32
            output.text = "$msg Kelvin = $ans Fahrenheit"
        }
        if (unit1 == "Kelvin" && unit2 == "Kelvin") {
            val msg = e1.text.toString().toFloat()
            val ans = msg
            output.text = "$msg Kelvin = $ans Kelvin"
        }


    }
}