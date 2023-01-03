package com.example.unitconverter

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun length(view: View) {
        val intent = Intent(this, LengthActivity::class.java)
        startActivity(intent)
    }

    fun weight(view: View) {
        val intent = Intent(this, WeigthActivity::class.java)
        startActivity(intent)
    }

    fun time(view: View) {
        val intent = Intent(this, TImeActivity::class.java)
        startActivity(intent)
    }

    fun temperature(view: View) {
        val intent = Intent(this, TempertaureActivity::class.java)
        startActivity(intent)
    }

    fun volume(view: View) {
        val intent = Intent(this, VolumeActivity::class.java)
        startActivity(intent)
    }

    fun speed(view: View) {
        val intent = Intent(this, SpeedActivity::class.java)
        startActivity(intent)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.credits -> {
                Toast.makeText(this, "Developer : Tushar Bhart", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.contact -> {
                val intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("https://www.instagram.com/tushar.bhart/"))
                startActivity(intent)
                return true
            }
            else->
                return super.onOptionsItemSelected(item)

        }
    }
}

