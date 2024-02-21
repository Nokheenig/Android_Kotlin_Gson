package com.example.gson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.gson.ExclusionStrategy
import com.google.gson.FieldAttributes
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gson = GsonBuilder().setExclusionStrategies(
            MyExclusionStrategy()
        ).create()

        val employee = Employee(
            "Alex",
            23,
            "alex@gmail.com",
            "weoriwreurg"
        )
        val jsonResult = gson.toJson(employee)
        Log.d("json", jsonResult)

        val json = "{\"mAge\":23,\"mFirstName\":\"Alex\",\"mMail\":\"alex@gmail.com\",\"mPassword\":\"weoriwreurg\"}"
        val employee2 = gson.fromJson(json, Employee::class.java)
        Log.d("json", employee2.toString())
    }
}

class MyExclusionStrategy : ExclusionStrategy {
    override fun shouldSkipField(f: FieldAttributes): Boolean {
        return f.name.startsWith("m")
    }

    override fun shouldSkipClass(clazz: Class<*>?): Boolean {
        return false
    }
}