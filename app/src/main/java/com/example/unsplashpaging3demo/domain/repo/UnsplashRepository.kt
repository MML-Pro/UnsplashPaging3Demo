package com.example.unsplashpaging3demo.domain.repo

import androidx.paging.PagingData
import com.example.paging3demo.model.UnsplashImage
import kotlinx.coroutines.flow.Flow

interface UnsplashRepository {

    fun getAllImages() : Flow<PagingData<UnsplashImage>>
}