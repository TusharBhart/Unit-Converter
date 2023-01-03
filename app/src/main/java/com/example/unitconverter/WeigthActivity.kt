package com.example.unitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.*

class WeigthActivity : AppCompatActivity() {
    val weightUnits=arrayOf("Gram","Kilogram","Milligram","Tonne","Pound")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weigth)

        val lengthSpinner1 = findViewById<Spinner>(R.id.lengthSpinner1)
        lengthSpinner1.adapter = ArrayAdapter<String>(this, R.layout.customspinnerweight, weightUnits)
        (lengthSpinner1.adapter as ArrayAdapter<String>).setDropDownViewResource(R.layout.customdropdownweight)

        val lengthSpinner2 = findViewById<Spinner>(R.id.lengthSpinner2)
        lengthSpinner2.adapter = ArrayAdapter<String>(this, R.layout.customspinnerweight, weightUnits)
        (lengthSpinner2.adapter as ArrayAdapter<String>).setDropDownViewResource(R.layout.customdropdownweight)


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


        ///////////////GRAMS/////////////////////
        if (unit1=="Gram" && unit2=="Gram"){
            val msg = e1.text.toString().toFloat()
            val ans=msg
            output.text="$msg Grams = $ans Grams"
        }
        if (unit1=="Gram" && unit2=="Kilogram"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/1000
            output.text="$msg Grams = $ans Kilograms"
        }
        if (unit1=="Gram" && unit2=="Milligram"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*1000
            output.text="$msg Grams = $ans Milligrams"
        }
        if (unit1=="Gram" && unit2=="Tonne"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/1e+6
            output.text="$msg Grams = $ans Tonnes"
        }
        if (unit1=="Gram" && unit2=="Pound"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/454
            output.text="$msg Grams = $ans Pounds"
        }
        ///////////////KILLOGRAMS/////////////////////
        if (unit1=="Kilogram" && unit2=="Gram"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*1000
            output.text="$msg Kilograms = $ans Grams"
        }
        if (unit1=="Kilogram" && unit2=="Kilogram"){
            val msg = e1.text.toString().toFloat()
            val ans=msg
            output.text="$msg Kilograms = $ans Kilograms"
        }
        if (unit1=="Kilogram" && unit2=="Milligram"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*1e+6
            output.text="$msg Kilograms = $ans Milligrams"
        }
        if (unit1=="Kilogram" && unit2=="Tonne"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/1000
            output.text="$msg Kilograms = $ans Tonnes"
        }
        if (unit1=="Kilogram" && unit2=="Pound"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*2.205
            output.text="$msg Kilograms = $ans Pounds"
        }
        ///////////////MILLIGRAMS/////////////////////
        if (unit1=="Milligram" && unit2=="Gram"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/1000
            output.text="$msg Milligrams = $ans Grams"
        }
        if (unit1=="Milligram" && unit2=="Kilogram"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/1e+6
            output.text="$msg Milligrams = $ans Kilograms"
        }
        if (unit1=="Milligram" && unit2=="Milligram"){
            val msg = e1.text.toString().toFloat()
            val ans=msg
            output.text="$msg Milligrams = $ans Milligrams"
        }
        if (unit1=="Milligram" && unit2=="Tonne"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/1e+9
            output.text="$msg Milligrams = $ans Tonnes"
        }
        if (unit1=="Milligram" && unit2=="Pound"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/453592
            output.text="$msg Milligrams = $ans Pounds"
        }
        ///////////////TONNES/////////////////////
        if (unit1=="Tonne" && unit2=="Gram"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*1e+6
            output.text="$msg Tonnes = $ans Grams"
        }
        if (unit1=="Tonne" && unit2=="Kilogram"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*1000
            output.text="$msg Tonnes = $ans Kilograms"
        }
        if (unit1=="Tonne" && unit2=="Milligram"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*1e+9
            output.text="$msg Tonnes = $ans Milligrams"
        }
        if (unit1=="Tonne" && unit2=="Tonne"){
            val msg = e1.text.toString().toFloat()
            val ans=msg
            output.text="$msg Tonnes = $ans Tonnes"
        }
        if (unit1=="Tonne" && unit2=="Pound"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*2204.62
            output.text="$msg Tonnes = $ans Pounds"
        }
        ///////////////POUNDS/////////////////////
        if (unit1=="Pound" && unit2=="Gram"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*453.592
            output.text="$msg Pounds = $ans Grams"
        }
        if (unit1=="Pound" && unit2=="Kilogram"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/2.205
            output.text="$msg Pounds = $ans Kilograms"
        }
        if (unit1=="Pound" && unit2=="Milligram"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*453592
            output.text="$msg Pounds = $ans Milligrams"
        }
        if (unit1=="Pound" && unit2=="Tonne"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/2205
            output.text="$msg Pounds = $ans Tonnes"
        }
        if (unit1=="Pound" && unit2=="Pound"){
            val msg = e1.text.toString().toFloat()
            val ans=msg
            output.text="$msg Pounds = $ans Pounds"
        }

    }

}