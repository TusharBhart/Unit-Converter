package com.example.unitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.*

class LengthActivity : AppCompatActivity() {

    val lengthUnits= arrayOf("Meter","Kilometre","Centimetre","Millimetre","Mile","Yard","Foot","Inch","Nautical Mile","Micrometre","Nanometre")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_length)

        val lengthSpinner1 = findViewById<Spinner>(R.id.lengthSpinner1)
        lengthSpinner1.adapter = ArrayAdapter<String>(this, R.layout.customspinner, lengthUnits)
        (lengthSpinner1.adapter as ArrayAdapter<String>).setDropDownViewResource(R.layout.customdropdown)

        val lengthSpinner2 = findViewById<Spinner>(R.id.lengthSpinner2)
        lengthSpinner2.adapter = ArrayAdapter<String>(this, R.layout.customspinner, lengthUnits)
        (lengthSpinner2.adapter as ArrayAdapter<String>).setDropDownViewResource(R.layout.customdropdown)

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
        Toast.makeText(this,"EX represents 10^X",Toast.LENGTH_SHORT).show()
    }

    fun convertButton(view:View){
        val lengthSpinner1 = findViewById<Spinner>(R.id.lengthSpinner1)
        val lengthSpinner2 = findViewById<Spinner>(R.id.lengthSpinner2)
        val e1=findViewById<EditText>(R.id.entry1)

        val unit1=lengthSpinner1.selectedItem.toString()
        val unit2=lengthSpinner2.selectedItem.toString()
        val output=findViewById<TextView>(R.id.output)

        //////////////////METER//////////////////////
        if (unit1=="Meter" && unit2=="Meter"){
            val msg = e1.text.toString().toFloat()
            val ans=msg
            output.text="$msg Meters = $ans Meters"
        }
        if (unit1=="Meter" && unit2=="Kilometre"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/1000
            output.text="$msg Meters = $ans Kilometres"
        }

        if (unit1=="Meter" && unit2=="Centimetre"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*100
            output.text="$msg Meters = $ans Centimetres"
        }
        if (unit1=="Meter" && unit2=="Millimetre"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*1000
            output.text="$msg Meters = $ans Millimetres"
        }
        if (unit1=="Meter" && unit2=="Mile"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/1609
            output.text="$msg Meters = $ans Miles"
        }
        if (unit1=="Meter" && unit2=="Yard"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*1.094
            output.text="$msg Meters = $ans Yards"
        }
        if (unit1=="Meter" && unit2=="Foot"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*3.281
            output.text="$msg Meters = $ans Feet"
        }
        if (unit1=="Meter" && unit2=="Inch"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*39.37
            output.text="$msg Meters = $ans Inches"
        }
        if (unit1=="Meter" && unit2=="Nautical Mile"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/1852
            output.text="$msg Meters = $ans Nautical Miles"
        }
        if (unit1=="Meter" && unit2=="Micrometre"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*1e+6
            output.text="$msg Meters = $ans Micrometres"
        }
        if (unit1=="Meter" && unit2=="Nanometre"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*1e+9
            output.text="$msg Meters = $ans Nanometres"
        }
        /////////////KILOMETRE/////////////////////
        if (unit1=="Kilometre" && unit2=="Meter"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*1000
            output.text="$msg Kilometres = $ans Meters"
        }
        if (unit1=="Kilometre" && unit2=="Kilometre"){
            val msg = e1.text.toString().toFloat()
            val ans=msg
            output.text="$msg Kilometres = $ans Kilometres"
        }

        if (unit1=="Kilometre" && unit2=="Centimetre"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*100000
            output.text="$msg Kilometres = $ans Centimetres"
        }
        if (unit1=="Kilometre" && unit2=="Millimetre"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*1e+6
            output.text="$msg Kilometres = $ans Millimetres"
        }
        if (unit1=="Kilometre" && unit2=="Mile"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/1.609
            output.text="$msg Kilometres = $ans Miles"
        }
        if (unit1=="Kilometre" && unit2=="Yard"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*1094
            output.text="$msg Kilometres = $ans Yards"
        }
        if (unit1=="Kilometre" && unit2=="Foot"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*3281
            output.text="$msg Kilometres = $ans Feet"
        }
        if (unit1=="Kilometre" && unit2=="Inch"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*39370
            output.text="$msg Kilometres = $ans Inches"
        }
        if (unit1=="Kilometre" && unit2=="Nautical Mile"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/1.852
            output.text="$msg Kilometres = $ans Nautical Miles"
        }
        if (unit1=="Kilometre" && unit2=="Micrometre"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*1e+9
            output.text="$msg Kilometres = $ans Micrometres"
        }
        if (unit1=="Kilometre" && unit2=="Nanometre"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*1e+12
            output.text="$msg Kilometres = $ans Nanometres"
        }
        /////////////CENTIMETER/////////////////////
        if (unit1=="Centimetre" && unit2=="Meter"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/100
            output.text="$msg Centimetres = $ans Meters"
        }
        if (unit1=="Centimetre" && unit2=="Kilometre"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/100000
            output.text="$msg Centimetres = $ans Kilometres"
        }

        if (unit1=="Centimetre" && unit2=="Centimetre"){
            val msg = e1.text.toString().toFloat()
            val ans=msg
            output.text="$msg Centimetres = $ans Centimetres"
        }
        if (unit1=="Centimetre" && unit2=="Millimetre"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*10
            output.text="$msg Centimetres = $ans Millimetres"
        }
        if (unit1=="Centimetre" && unit2=="Mile"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/160934
            output.text="$msg Centimetres = $ans Miles"
        }
        if (unit1=="Centimetre" && unit2=="Yard"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/91.44
            output.text="$msg Centimetres = $ans Yards"
        }
        if (unit1=="Centimetre" && unit2=="Foot"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/30.48
            output.text="$msg Centimetres = $ans Feet"
        }
        if (unit1=="Centimetre" && unit2=="Inch"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/2.54
            output.text="$msg Centimetres = $ans Inches"
        }
        if (unit1=="Centimetre" && unit2=="Nautical Mile"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/185200
            output.text="$msg Centimetres = $ans Nautical Miles"
        }
        if (unit1=="Centimetre" && unit2=="Micrometre"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*10000
            output.text="$msg Centimetres = $ans Micrometres"
        }
        if (unit1=="Centimetre" && unit2=="Nanometre"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*1e+7
            output.text="$msg Centimetres = $ans Nanometres"
        }

        /////////////MILLIMETRE/////////////////////
        if (unit1=="Millimetre" && unit2=="Meter"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/1000
            output.text="$msg Millimetres = $ans Meters"
        }
        if (unit1=="Millimetre" && unit2=="Kilometre"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/1e+6
            output.text="$msg Millimetres = $ans Kilometres"
        }

        if (unit1=="Millimetre" && unit2=="Centimetre"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/10
            output.text="$msg Millimetres = $ans Centimetres"
        }
        if (unit1=="Millimetre" && unit2=="Millimetre"){
            val msg = e1.text.toString().toFloat()
            val ans=msg
            output.text="$msg Millimetres = $ans Millimetres"
        }
        if (unit1=="Millimetre" && unit2=="Mile"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/1.60934e+6
            output.text="$msg Millimetres = $ans Miles"
        }
        if (unit1=="Millimetre" && unit2=="Yard"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/914
            output.text="$msg Millimetres = $ans Yards"
        }
        if (unit1=="Millimetre" && unit2=="Foot"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/305
            output.text="$msg Millimetres = $ans Feet"
        }
        if (unit1=="Millimetre" && unit2=="Inch"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/25.4
            output.text="$msg Millimetres = $ans Inches"
        }
        if (unit1=="Millimetre" && unit2=="Nautical Mile"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/1.852e+6
            output.text="$msg Millimetres = $ans Nautical Miles"
        }
        if (unit1=="Millimetre" && unit2=="Micrometre"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*1000
            output.text="$msg Millimetres = $ans Micrometres"
        }
        if (unit1=="Millimetre" && unit2=="Nanometre"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*1e+6
            output.text="$msg Millimetres = $ans Nanometres"
        }

        /////////////MILES/////////////////////
        if (unit1=="Mile" && unit2=="Meter"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*1609.34
            output.text="$msg Miles = $ans Meters"
        }
        if (unit1=="Mile" && unit2=="Kilometre"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*1.609
            output.text="$msg Miles = $ans Kilometres"
        }

        if (unit1=="Mile" && unit2=="Centimetre"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*160934
            output.text="$msg Miles = $ans Centimetres"
        }
        if (unit1=="Mile" && unit2=="Millimetre"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*1.609e+6
            output.text="$msg Miles = $ans Millimetres"
        }
        if (unit1=="Mile" && unit2=="Mile"){
            val msg = e1.text.toString().toFloat()
            val ans=msg
            output.text="$msg Miles = $ans Miles"
        }
        if (unit1=="Mile" && unit2=="Yard"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*1760
            output.text="$msg Miles = $ans Yards"
        }
        if (unit1=="Mile" && unit2=="Foot"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*5280
            output.text="$msg Miles = $ans Feet"
        }
        if (unit1=="Mile" && unit2=="Inch"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*63360
            output.text="$msg Miles = $ans Inches"
        }
        if (unit1=="Mile" && unit2=="Nautical Mile"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/1.151
            output.text="$msg Miles = $ans Nautical Miles"
        }
        if (unit1=="Mile" && unit2=="Micrometre"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*1.609e+9
            output.text="$msg Miles = $ans Micrometres"
        }
        if (unit1=="Mile" && unit2=="Nanometre"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*1.609e+12
            output.text="$msg Miles = $ans Nanometres"
        }
        /////////////YARDS/////////////////////
        if (unit1=="Yard" && unit2=="Meter"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/1.094
            output.text="$msg Yards = $ans Meters"
        }
        if (unit1=="Yard" && unit2=="Kilometre"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/1094
            output.text="$msg Yards = $ans Kilometres"
        }

        if (unit1=="Yard" && unit2=="Centimetre"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*91.44
            output.text="$msg Yards = $ans Centimetres"
        }
        if (unit1=="Yard" && unit2=="Millimetre"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*914.4
            output.text="$msg Yards = $ans Millimetres"
        }
        if (unit1=="Yard" && unit2=="Mile"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/1760
            output.text="$msg Yards = $ans Miles"
        }
        if (unit1=="Yard" && unit2=="Yard"){
            val msg = e1.text.toString().toFloat()
            val ans=msg
            output.text="$msg Yards = $ans Yards"
        }
        if (unit1=="Yard" && unit2=="Foot"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*3
            output.text="$msg Yards = $ans Feet"
        }
        if (unit1=="Yard" && unit2=="Inch"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*36
            output.text="$msg Yards = $ans Inches"
        }
        if (unit1=="Yard" && unit2=="Nautical Mile"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/2025
            output.text="$msg Yards = $ans Nautical Miles"
        }
        if (unit1=="Yard" && unit2=="Micrometre"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*914400
            output.text="$msg Yards = $ans Micrometres"
        }
        if (unit1=="Yard" && unit2=="Nanometre"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*9.144e+8
            output.text="$msg Yards = $ans Nanometres"
        }
        /////////////FEET/////////////////////
        if (unit1=="Foot" && unit2=="Meter"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/3.281
            output.text="$msg Feet = $ans Meters"
        }
        if (unit1=="Foot" && unit2=="Kilometre"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/3281
            output.text="$msg Feet = $ans Kilometres"
        }

        if (unit1=="Foot" && unit2=="Centimetre"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*30.48
            output.text="$msg Feet = $ans Centimetres"
        }
        if (unit1=="Foot" && unit2=="Millimetre"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*304.8
            output.text="$msg Feet = $ans Millimetres"
        }
        if (unit1=="Foot" && unit2=="Mile"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/5280
            output.text="$msg Feet = $ans Miles"
        }
        if (unit1=="Foot" && unit2=="Yard"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/3
            output.text="$msg Feet = $ans Yards"
        }
        if (unit1=="Foot" && unit2=="Foot"){
            val msg = e1.text.toString().toFloat()
            val ans=msg
            output.text="$msg Feet = $ans Feet"
        }
        if (unit1=="Foot" && unit2=="Inch"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*12
            output.text="$msg Feet = $ans Inches"
        }
        if (unit1=="Foot" && unit2=="Nautical Mile"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/6076
            output.text="$msg Feet = $ans Nautical Miles"
        }
        if (unit1=="Foot" && unit2=="Micrometre"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*304800
            output.text="$msg Feet = $ans Micrometres"
        }
        if (unit1=="Foot" && unit2=="Nanometre"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*3.048e+8
            output.text="$msg Feet = $ans Nanometres"
        }

        /////////////INCHES/////////////////////
        if (unit1=="Inch" && unit2=="Meter"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/39.37
            output.text="$msg Inches = $ans Meters"
        }
        if (unit1=="Inch" && unit2=="Kilometre"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/39370
            output.text="$msg Inches = $ans Kilometres"
        }

        if (unit1=="Inch" && unit2=="Centimetre"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*2.54
            output.text="$msg Inches = $ans Centimetres"
        }
        if (unit1=="Inch" && unit2=="Millimetre"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*25.4
            output.text="$msg Inches = $ans Millimetres"
        }
        if (unit1=="Inch" && unit2=="Mile"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/63360
            output.text="$msg Inches = $ans Miles"
        }
        if (unit1=="Inch" && unit2=="Yard"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/36
            output.text="$msg Inches = $ans Yards"
        }
        if (unit1=="Inch" && unit2=="Foot"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/12
            output.text="$msg Inches = $ans Feet"
        }
        if (unit1=="Inch" && unit2=="Inch"){
            val msg = e1.text.toString().toFloat()
            val ans=msg
            output.text="$msg Inches = $ans Inches"
        }
        if (unit1=="Inch" && unit2=="Nautical Mile"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/72913
            output.text="$msg Inches = $ans Nautical Miles"
        }
        if (unit1=="Inch" && unit2=="Micrometre"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*25400
            output.text="$msg Inches = $ans Micrometres"
        }
        if (unit1=="Inch" && unit2=="Nanometre"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*2.54e+7
            output.text="$msg Inches = $ans Nanometres"
        }

        /////////////NAUTICAL MILES/////////////////////
        if (unit1=="Nautical Mile" && unit2=="Meter"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*1852
            output.text="$msg Nautical Miles = $ans Meters"
        }
        if (unit1=="Nautical Mile" && unit2=="Kilometre"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*1.852
            output.text="$msg Nautical Miles = $ans Kilometres"
        }

        if (unit1=="Nautical Mile" && unit2=="Centimetre"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*185200
            output.text="$msg Nautical Miles = $ans Centimetres"
        }
        if (unit1=="Nautical Mile" && unit2=="Millimetre"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*1.852e+6
            output.text="$msg Nautical Miles = $ans Millimetres"
        }
        if (unit1=="Nautical Mile" && unit2=="Mile"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*1.151
            output.text="$msg Nautical Miles = $ans Miles"
        }
        if (unit1=="Nautical Mile" && unit2=="Yard"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*2025.37
            output.text="$msg Nautical Miles = $ans Yards"
        }
        if (unit1=="Nautical Mile" && unit2=="Foot"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*6076.12
            output.text="$msg Nautical Miles = $ans Feet"
        }
        if (unit1=="Nautical Mile" && unit2=="Inch"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*72913.4
            output.text="$msg Nautical Miles = $ans Inches"
        }
        if (unit1=="Nautical Mile" && unit2=="Nautical Mile"){
            val msg = e1.text.toString().toFloat()
            val ans=msg
            output.text="$msg Nautical Miles = $ans Nautical Miles"
        }
        if (unit1=="Nautical Mile" && unit2=="Micrometre"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*1.852e+9
            output.text="$msg Nautical Miles = $ans Micrometres"
        }
        if (unit1=="Nautical Mile" && unit2=="Nanometre"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*1.852e+12
            output.text="$msg Nautical Miles = $ans Nanometres"
        }

        /////////////MICROMETRES/////////////////////
        if (unit1=="Micrometre" && unit2=="Meter"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/1e+6
            output.text="$msg Micrometres = $ans Meters"
        }
        if (unit1=="Micrometre" && unit2=="Kilometre"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/1e+9
            output.text="$msg Micrometres = $ans Kilometres"
        }
        if (unit1=="Micrometre" && unit2=="Centimetre"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/10000
            output.text="$msg Micrometres = $ans Centimetres"
        }
        if (unit1=="Micrometre" && unit2=="Millimetre"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/1000
            output.text="$msg Micrometres = $ans Millimetres"
        }
        if (unit1=="Micrometre" && unit2=="Mile"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/1.609e+9
            output.text="$msg Micrometres = $ans Miles"
        }
        if (unit1=="Micrometre" && unit2=="Yard"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/914400
            output.text="$msg Micrometres = $ans Yards"
        }
        if (unit1=="Micrometre" && unit2=="Foot"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/304800
            output.text="$msg Micrometres = $ans Feet"
        }
        if (unit1=="Micrometre" && unit2=="Inch"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/25400
            output.text="$msg Micrometres = $ans Inches"
        }
        if (unit1=="Micrometre" && unit2=="Nautical Mile"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/1.852e+9
            output.text="$msg Micrometres = $ans Nautical Miles"
        }
        if (unit1=="Micrometre" && unit2=="Micrometre"){
            val msg = e1.text.toString().toFloat()
            val ans=msg
            output.text="$msg Micrometres = $ans Micrometres"
        }
        if (unit1=="Micrometre" && unit2=="Nanometre"){
            val msg = e1.text.toString().toFloat()
            val ans=msg*1000
            output.text="$msg Micrometres = $ans Nanometres"
        }

        /////////////NANOMETRES/////////////////////
        if (unit1=="Nanometre" && unit2=="Meter"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/1e+9
            output.text="$msg Nanometres = $ans Meters"
        }
        if (unit1=="Nanometre" && unit2=="Kilometre"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/1e+12
            output.text="$msg Nanometres = $ans Kilometres"
        }
        if (unit1=="Nanometre" && unit2=="Centimetre"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/1e+7
            output.text="$msg Nanometres = $ans Centimetres"
        }
        if (unit1=="Nanometre" && unit2=="Millimetre"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/1e+6
            output.text="$msg Nanometres = $ans Millimetres"
        }
        if (unit1=="Nanometre" && unit2=="Mile"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/1.609e+12
            output.text="$msg Nanometres = $ans Miles"
        }
        if (unit1=="Nanometre" && unit2=="Yard"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/9.144e+8
            output.text="$msg Nanometres = $ans Yards"
        }
        if (unit1=="Nanometre" && unit2=="Foot"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/3.048e+8
            output.text="$msg Nanometres = $ans Feet"
        }
        if (unit1=="Nanometre" && unit2=="Inch"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/2.54e+7
            output.text="$msg Nanometres = $ans Inches"
        }
        if (unit1=="Nanometre" && unit2=="Nautical Mile"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/1.852e+12
            output.text="$msg Nanometres = $ans Nautical Miles"
        }
        if (unit1=="Nanometre" && unit2=="Micrometre"){
            val msg = e1.text.toString().toFloat()
            val ans=msg/1000
            output.text="$msg Nanometres = $ans Micrometres"
        }
        if (unit1=="Nanometre" && unit2=="Nanometre"){
            val msg = e1.text.toString().toFloat()
            val ans=msg
            output.text="$msg Nanometres = $ans Nanometres"
        }









    }

}