package com.example.unsplashpaging3demo.di

import android.content.Context
import com.example.unsplashpaging3demo.data.local.UnsplashDatabase
import com.example.unsplashpaging3demo.data.local.dao.UnsplashImageDao
import com.example.unsplashpaging3demo.data.local.dao.UnsplashRemoteKeysDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object DatabaseModule {

    @Singleton
    @Provides
    fun provideDatabase(@ApplicationContext context: Context): UnsplashDatabase {
        return UnsplashDatabase.getInstance(context)
    }

    @Singleton
    @Provides
    fun provideUnsplashImageDao(unsplashDatabase: UnsplashDatabase): UnsplashImageDao {
        return unsplashDatabase.unsplashImageDao
    }

    @Singleton
    @Provides
    fun provideUnsplashRemoteKeysDao(unsplashDatabase: UnsplashDatabase): UnsplashRemoteKeysDao {
        return unsplashDatabase.unsplashRemoteKeysDao
    }


}