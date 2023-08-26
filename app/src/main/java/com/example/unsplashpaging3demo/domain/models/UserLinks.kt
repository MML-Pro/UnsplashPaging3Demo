package com.example.paging3demo.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class UserLinks(
    val html: String
) :Parcelable
