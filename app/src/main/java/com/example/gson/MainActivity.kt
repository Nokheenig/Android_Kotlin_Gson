package com.example.gson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gson = Gson()

        /*
        val familyMembers = arrayOf(
            FamilyMember("Wife", 35),
            FamilyMember("Daughter", 7)
        )
        val address = Address("Romania", "Bucuresti")
        val employee = Employee("Alex", 23, "alex@gmail.com", address, familyMembers)
        val json = gson.toJson(employee)
        Log.d("json", json)
         */

        val json = "[{\"age\":35,\"role\":\"Wife\"},{\"age\":7,\"role\":\"Daughter\"}]"
        val familyType: Type = object : TypeToken<MutableList<FamilyMember>>(){}.type
        val familyMembers: MutableList<FamilyMember> = gson.fromJson(json, familyType)
        Log.d("json", familyMembers.toString())

    }
}