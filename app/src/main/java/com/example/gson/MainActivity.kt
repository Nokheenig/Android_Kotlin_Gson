package com.example.gson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.gson.Gson

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gson = Gson()

        /*
        val address = Address("Romania", "Bucuresti")
        val employee = Employee("Alex", 23, "alex@gmail.com", address)
        val json = gson.toJson(employee)
        Log.d("json", json)
         */


        val json = "{\"address\":{\"city\":\"Bucuresti\",\"country\":\"Romania\"},\"age\":23,\"firstname\":\"Alex\",\"mail\":\"alex@gmail.com\"}"
        val employee = gson.fromJson(json, Employee::class.java)
        Log.d("json", employee.toString())

    }
}