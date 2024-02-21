package com.example.gson

import com.google.gson.annotations.SerializedName

data class FamilyMember (
    @SerializedName("role") val mRole: String,
    @SerializedName("age") val mAge: Int,
)