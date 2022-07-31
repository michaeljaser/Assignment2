package com.example.assignment_2

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.text.DecimalFormat

var g18 = 30.22
var g21 = 35.26
var g24 = 40.30
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }



    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
       val inflater = menuInflater
        inflater.inflate(R.menu.menu1, menu)
        return super.onCreateOptionsMenu(menu)
    }


    private fun commandFunc(c: Int)
    {
        val df = DecimalFormat("#.##")

        if(c==0)
        {
            val tv1:TextView = findViewById(R.id.Pr1)
            val temp1 = df.format(g18)
            tv1.text = "$temp1 JD"

            val tv2:TextView = findViewById(R.id.Pr2)
            val temp2 = df.format(g21)
            tv2.text = "$temp2 JD"

            val tv3:TextView = findViewById(R.id.Pr3)
            val temp3 = df.format(g24)
            tv3.text = "$temp3 JD"
        }
        if(c==1) {
            val tv1: TextView = findViewById(R.id.Pr1)
            var pr = g18 / 0.71
            val temp1 = df.format(pr)
            tv1.text = "$temp1 USD"

            val tv2: TextView = findViewById(R.id.Pr2)
            pr = g21 / 0.71
            val temp2= df.format(pr)
            tv2.text = "$temp2 USD"

            val tv3: TextView = findViewById(R.id.Pr3)
            pr = g24 / 0.71
            val temp3 = df.format(pr)
            tv3.text = "$temp3 USD"
        }
        if(c==2)
        {
            var dialog_var = CustomDialogclass()
            dialog_var.show(supportFragmentManager, "Custom Dialog")
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.JD ->commandFunc(0)
            R.id.dollar -> commandFunc(1)
            R.id.rate -> commandFunc(2)
        }
        return true
    }



}