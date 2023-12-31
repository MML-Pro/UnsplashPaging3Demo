package com.example.unsplashpaging3demo.util

import com.example.unsplashpaging3demo.BuildConfig

object Constants {

    const val API_KEY = BuildConfig.API_KEY

    const val BASE_URL = "https://api.unsplash.com"

    const val UNSPLASH_DATABASE = "unsplash_database"
    const val UNSPLASH_IMAGE_TABLE = "unsplash_image_table"
    const val UNSPLASH_REMOTE_KEYS_TABLE = "unsplash_remote_keys_table"

    const val ITEMS_PER_PAGE = 10
}