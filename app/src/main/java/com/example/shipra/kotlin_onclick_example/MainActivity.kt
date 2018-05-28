package com.example.shipra.kotlin_onclick_example

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //get referance to a button

        //val buttonClick=findViewById(R.id.bt_click) as Button

        //set on Click Listener

        bt_click.setOnClickListener{

            //Toast.makeText(this@MainActivity," you clicke me.",Toast.LENGTH_LONG).show()

            val intent= Intent(this,secondActivity::class.java)
            startActivity(intent)

        }

    }
}
