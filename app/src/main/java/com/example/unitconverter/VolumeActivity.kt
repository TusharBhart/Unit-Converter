package com.example.unitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.*
import android.text.TextWatcher as tw

class VolumeActivity : AppCompatActivity() {
    val volumeUnits= arrayOf("Milliliter","Cubic inch","Liter","Imperial gallon","Cubic foot","Cubic meter")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_volume)

        val lengthSpinner1 = findViewById<Spinner>(R.id.lengthSpinner1)
        lengthSpinner1.adapter = ArrayAdapter<String>(this, R.layout.customspinnervolume, volumeUnits)
        (lengthSpinner1.adapter as ArrayAdapter<String>).setDropDownViewResource(R.layout.customdropdownvolume)

        val lengthSpinner2 = findViewById<Spinner>(R.id.lengthSpinner2)
        lengthSpinner2.adapter = ArrayAdapter<String>(this, R.layout.customspinnervolume, volumeUnits)
        (lengthSpinner2.adapter as ArrayAdapter<String>).setDropDownViewResource(R.layout.customdropdownvolume)

        val e1 = findViewById<EditText>(R.id.entry1)
        val cButton=findViewById<ImageButton>(R.id.lengthButton)
        cButton.isEnabled=false
        e1.addTextChangedListener(object : tw{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun afterTextChanged(p0: Editable?) {
                cButton.isEnabled=true
            }
        })


    }
    fun ibutton(view: View) {
        Toast.makeText(this, "EX represents 10^X", Toast.LENGTH_SHORT).show()
    }


    fun convertButton(view: View) {
        val lengthSpinner1 = findViewById<Spinner>(R.id.lengthSpinner1)
        val lengthSpinner2 = findViewById<Spinner>(R.id.lengthSpinner2)
        val e1 = findViewById<EditText>(R.id.entry1)

        val unit1 = lengthSpinner1.selectedItem.toString()
        val unit2 = lengthSpinner2.selectedItem.toString()
        val output = findViewById<TextView>(R.id.output)


        ///////////////MILLILITERS/////////////////////
        if (unit1 == "Milliliter" && unit2 == "Milliliter") {
            val msg = e1.text.toString().toFloat()
            val ans = msg
            output.text = "$msg Milliliters = $ans Milliliters"
        }
        if (unit1 == "Milliliter" && unit2 == "Cubic inch") {
            val msg = e1.text.toString().toFloat()
            val ans = msg/16.387
            output.text = "$msg Milliliters = $ans Cubic inches"
        }
        if (unit1 == "Milliliter" && unit2 == "Liter") {
            val msg = e1.text.toString().toFloat()
            val ans = msg/1000
            output.text = "$msg Milliliters = $ans Liters"
        }
        if (unit1 == "Milliliter" && unit2 == "Imperial gallon") {
            val msg = e1.text.toString().toFloat()
            val ans = msg/4546
            output.text = "$msg Milliliters = $ans Imperial gallons"
        }
        if (unit1 == "Milliliter" && unit2 == "Cubic foot") {
            val msg = e1.text.toString().toFloat()
            val ans = msg/28317
            output.text = "$msg Milliliters = $ans Cubic feet"
        }
        if (unit1 == "Milliliter" && unit2 == "Cubic meter") {
            val msg = e1.text.toString().toFloat()
            val ans = msg/1e+6
            output.text = "$msg Milliliters = $ans Cubic meters"
        }

        ///////////////CUBIC INCHES/////////////////////
        if (unit1 == "Cubic inch" && unit2 == "Milliliter") {
            val msg = e1.text.toString().toFloat()
            val ans = msg*16.3871
            output.text = "$msg Cubic inches = $ans Milliliters"
        }
        if (unit1 == "Cubic inch" && unit2 == "Cubic inch") {
            val msg = e1.text.toString().toFloat()
            val ans = msg
            output.text = "$msg Cubic inches = $ans Cubic inches"
        }
        if (unit1 == "Cubic inch" && unit2 == "Liter") {
            val msg = e1.text.toString().toFloat()
            val ans = msg/61.024
            output.text = "$msg Cubic inches = $ans Liters"
        }
        if (unit1 == "Cubic inch" && unit2 == "Imperial gallon") {
            val msg = e1.text.toString().toFloat()
            val ans = msg/277
            output.text = "$msg Cubic inches = $ans Imperial gallons"
        }
        if (unit1 == "Cubic inch" && unit2 == "Cubic foot") {
            val msg = e1.text.toString().toFloat()
            val ans = msg/1728
            output.text = "$msg Cubic inches = $ans Cubic feet"
        }
        if (unit1 == "Cubic inch" && unit2 == "Cubic meter") {
            val msg = e1.text.toString().toFloat()
            val ans = msg/61024
            output.text = "$msg Cubic inches = $ans Cubic meters"
        }

        ///////////////LITERS/////////////////////
        if (unit1 == "Liter" && unit2 == "Milliliter") {
            val msg = e1.text.toString().toFloat()
            val ans = msg*1000
            output.text = "$msg Liters = $ans Milliliters"
        }
        if (unit1 == "Liter" && unit2 == "Cubic inch") {
            val msg = e1.text.toString().toFloat()
            val ans = msg*61.024
            output.text = "$msg Liters = $ans Cubic inches"
        }
        if (unit1 == "Liter" && unit2 == "Liter") {
            val msg = e1.text.toString().toFloat()
            val ans = msg
            output.text = "$msg Liters = $ans Liters"
        }
        if (unit1 == "Liter" && unit2 == "Imperial gallon") {
            val msg = e1.text.toString().toFloat()
            val ans = msg/4.546
            output.text = "$msg Liters = $ans Imperial gallons"
        }
        if (unit1 == "Liter" && unit2 == "Cubic foot") {
            val msg = e1.text.toString().toFloat()
            val ans = msg/28.317
            output.text = "$msg Liters = $ans Cubic feet"
        }
        if (unit1 == "Liter" && unit2 == "Cubic meter") {
            val msg = e1.text.toString().toFloat()
            val ans = msg/1000
            output.text = "$msg Liters = $ans Cubic meters"
        }
        ///////////////IMPERIAL GALLONS/////////////////////
        if (unit1 == "Imperial gallon" && unit2 == "Milliliter") {
            val msg = e1.text.toString().toFloat()
            val ans = msg*4546.09
            output.text = "$msg Imperial gallons = $ans Milliliters"
        }
        if (unit1 == "Imperial gallon" && unit2 == "Cubic inch") {
            val msg = e1.text.toString().toFloat()
            val ans = msg*277.419
            output.text = "$msg Imperial gallons = $ans Cubic inches"
        }
        if (unit1 == "Imperial gallon" && unit2 == "Liter") {
            val msg = e1.text.toString().toFloat()
            val ans = msg*4.546
            output.text = "$msg Imperial gallons = $ans Liters"
        }
        if (unit1 == "Imperial gallon" && unit2 == "Imperial gallon") {
            val msg = e1.text.toString().toFloat()
            val ans = msg
            output.text = "$msg Imperial gallons = $ans Imperial gallons"
        }
        if (unit1 == "Imperial gallon" && unit2 == "Cubic foot") {
            val msg = e1.text.toString().toFloat()
            val ans = msg/6.229
            output.text = "$msg Imperial gallons = $ans Cubic feet"
        }
        if (unit1 == "Imperial gallon" && unit2 == "Cubic meter") {
            val msg = e1.text.toString().toFloat()
            val ans = msg/220
            output.text = "$msg Imperial gallons = $ans Cubic meters"
        }
        ///////////////CUBIC FEET/////////////////////
        if (unit1 == "Cubic foot" && unit2 == "Milliliter") {
            val msg = e1.text.toString().toFloat()
            val ans = msg*28316.8
            output.text = "$msg Cubic feet = $ans Milliliters"
        }
        if (unit1 == "Cubic foot" && unit2 == "Cubic inch") {
            val msg = e1.text.toString().toFloat()
            val ans = msg*1728
            output.text = "$msg Cubic feet = $ans Cubic inches"
        }
        if (unit1 == "Cubic foot" && unit2 == "Liter") {
            val msg = e1.text.toString().toFloat()
            val ans = msg*28.317
            output.text = "$msg Cubic feet = $ans Liters"
        }
        if (unit1 == "Cubic foot" && unit2 == "Imperial gallon") {
            val msg = e1.text.toString().toFloat()
            val ans = msg*6.229
            output.text = "$msg Cubic feet = $ans Imperial gallons"
        }
        if (unit1 == "Cubic foot" && unit2 == "Cubic foot") {
            val msg = e1.text.toString().toFloat()
            val ans = msg
            output.text = "$msg Cubic feet = $ans Cubic feet"
        }
        if (unit1 == "Cubic foot" && unit2 == "Cubic meter") {
            val msg = e1.text.toString().toFloat()
            val ans = msg/35.315
            output.text = "$msg Cubic feet = $ans Cubic meters"
        }
        ///////////////CUBIC METERS/////////////////////
        if (unit1 == "Cubic meter" && unit2 == "Milliliter") {
            val msg = e1.text.toString().toFloat()
            val ans = msg*1e+6
            output.text = "$msg Cubic meters = $ans Milliliters"
        }
        if (unit1 == "Cubic meter" && unit2 == "Cubic inch") {
            val msg = e1.text.toString().toFloat()
            val ans = msg*61023.7
            output.text = "$msg Cubic meters = $ans Cubic inches"
        }
        if (unit1 == "Cubic meter" && unit2 == "Liter") {
            val msg = e1.text.toString().toFloat()
            val ans = msg*1000
            output.text = "$msg Cubic meters = $ans Liters"
        }
        if (unit1 == "Cubic meter" && unit2 == "Imperial gallon") {
            val msg = e1.text.toString().toFloat()
            val ans = msg*219.969
            output.text = "$msg Cubic meters = $ans Imperial gallons"
        }
        if (unit1 == "Cubic meter" && unit2 == "Cubic foot") {
            val msg = e1.text.toString().toFloat()
            val ans = msg*35.315
            output.text = "$msg Cubic meters = $ans Cubic feet"
        }
        if (unit1 == "Cubic meter" && unit2 == "Cubic meter") {
            val msg = e1.text.toString().toFloat()
            val ans = msg
            output.text = "$msg Cubic meters = $ans Cubic meters"
        }


    }
}