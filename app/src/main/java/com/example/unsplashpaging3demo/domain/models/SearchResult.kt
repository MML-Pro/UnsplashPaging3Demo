package com.example.paging3demo.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class SearchResult(
//    @SerialName("results")
    val images: List<UnsplashImage>,
) : Parcelable