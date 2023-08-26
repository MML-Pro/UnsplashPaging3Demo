package com.example.unsplashpaging3demo.di

import com.example.unsplashpaging3demo.data.local.UnsplashDatabase
import com.example.unsplashpaging3demo.data.remote.UnsplashApi
import com.example.unsplashpaging3demo.data.repo.UnsplashRepositoryImpl
import com.example.unsplashpaging3demo.domain.repo.UnsplashRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {

    @Provides
    @Singleton
    fun provideRepo(
        unsplashApi: UnsplashApi,
        unsplashDatabase: UnsplashDatabase
    ): UnsplashRepository {
        return UnsplashRepositoryImpl(unsplashApi, unsplashDatabase)
    }
}