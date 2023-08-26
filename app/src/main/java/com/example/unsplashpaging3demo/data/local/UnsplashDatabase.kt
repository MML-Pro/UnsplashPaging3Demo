package com.example.unsplashpaging3demo.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.paging3demo.model.UnsplashImage
import com.example.paging3demo.model.UnsplashRemoteKeys
import com.example.unsplashpaging3demo.data.local.dao.UnsplashImageDao
import com.example.unsplashpaging3demo.data.local.dao.UnsplashRemoteKeysDao
import com.example.unsplashpaging3demo.util.Constants.UNSPLASH_DATABASE

@Database(
    entities = [UnsplashImage::class, UnsplashRemoteKeys::class],
    version = 1
)
abstract class UnsplashDatabase : RoomDatabase() {

    abstract val unsplashImageDao: UnsplashImageDao
    abstract val unsplashRemoteKeysDao: UnsplashRemoteKeysDao

    companion object {

        @Volatile
        private var INSTANCE: UnsplashDatabase? = null

        fun getInstance(context: Context): UnsplashDatabase {

            synchronized(this) {

                var instance = INSTANCE

                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        UnsplashDatabase::class.java,
                        UNSPLASH_DATABASE
                    ).fallbackToDestructiveMigration().build()

                    INSTANCE = instance
                }
                return instance
            }

        }

    }


}