package com.example.flixster
import com.google.gson.annotations.SerializedName

class MovieSerial {

    @JvmField
    @SerializedName("title")
    var title: String? = null

    @JvmField
    @SerializedName("poster_path")
    var MovieImageUrl: String? = null


    @SerializedName("overview")
    var description: String? = null

}