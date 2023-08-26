package com.example.unsplashpaging3demo.domain.models

import android.os.Parcelable
import androidx.room.Embedded
import com.example.paging3demo.model.UserLinks
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    @Embedded
    @SerializedName("links")
    val userLinks: UserLinks,
    val username: String
) :Parcelable
