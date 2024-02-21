package com.example.gson

import com.google.gson.annotations.SerializedName

data class Employee(
    @SerializedName("firstname") val mFirstName: String,
    @SerializedName("age") val mAge: Int,
    @SerializedName("mail") val mMail: String,
    @SerializedName("address") val mAddress: Address,
    @SerializedName("family") val mFamilyMember: Array<FamilyMember>,
)