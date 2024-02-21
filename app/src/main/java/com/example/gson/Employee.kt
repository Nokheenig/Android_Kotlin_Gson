package com.example.gson

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Employee(
    @Expose(serialize = false) val firstName: String,
    @Expose val age: Int,
    @Expose(deserialize = false) val mail: String,
    val password: String,
)