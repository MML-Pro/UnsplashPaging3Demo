package com.example.unsplashpaging3demo.data.repo

import androidx.paging.ExperimentalPagingApi
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.PagingSource
import com.example.paging3demo.model.UnsplashImage
import com.example.unsplashpaging3demo.data.local.UnsplashDatabase
import com.example.unsplashpaging3demo.data.paging.UnsplashRemoteMediator
import com.example.unsplashpaging3demo.data.remote.UnsplashApi
import com.example.unsplashpaging3demo.domain.repo.UnsplashRepository
import com.example.unsplashpaging3demo.util.Constants.ITEMS_PER_PAGE
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class UnsplashRepositoryImpl @Inject constructor(
    private val unsplashApi: UnsplashApi,
    private val unsplashDatabase: UnsplashDatabase
) : UnsplashRepository {

    @OptIn(ExperimentalPagingApi::class)
    override fun getAllImages(): Flow<PagingData<UnsplashImage>> {
        val pagingSourceFactory: () -> PagingSource<Int, UnsplashImage> =
            { unsplashDatabase.unsplashImageDao.getAllImages() }

        return Pager(
            config = PagingConfig(pageSize = ITEMS_PER_PAGE),
            remoteMediator = UnsplashRemoteMediator(unsplashApi,unsplashDatabase),
            pagingSourceFactory = pagingSourceFactory
        ).flow

    }
}