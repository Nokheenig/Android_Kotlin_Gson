package com.example.gson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gson = GsonBuilder().excludeFieldsWithoutExposeAnnotation().create()

        val employee = Employee(
            "Alex",
            23,
            "alex@gmail.com",
            "weoriwreurg"
        )
        val jsonResult = gson.toJson(employee)
        Log.d("json", jsonResult)

        val json = "{\"age\":23,\"firstName\":\"Alex\",\"mail\":\"alex@gmail.com\",\"password\":\"weoriwreurg\"}"
        val employee2 = gson.fromJson(json, Employee::class.java)
        Log.d("json", employee2.toString())
    }
}