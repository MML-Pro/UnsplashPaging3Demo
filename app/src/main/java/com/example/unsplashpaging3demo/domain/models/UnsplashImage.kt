package com.example.paging3demo.model

import android.os.Parcelable
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.unsplashpaging3demo.domain.models.User
import com.example.unsplashpaging3demo.util.Constants.UNSPLASH_IMAGE_TABLE
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = UNSPLASH_IMAGE_TABLE)
data class UnsplashImage(
    @PrimaryKey(autoGenerate = false)
    val id: String,
    @Embedded
    val urls: Urls,
    val likes: Int,
    @Embedded
    val user: User
) : Parcelable
