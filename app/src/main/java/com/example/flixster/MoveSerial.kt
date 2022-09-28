package com.example.flixster
import com.google.gson.annotations.SerializedName

class MoveSerial {

    @JvmField
    @SerializedName("title")
    var title: String? = null

    @JvmField
    @SerializedName("movie_image")
    var MovieImageUrl: String? = null


    @SerializedName("description")
    var description: String? = null

}