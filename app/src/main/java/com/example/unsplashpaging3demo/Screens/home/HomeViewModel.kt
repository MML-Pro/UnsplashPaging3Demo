package com.example.unsplashpaging3demo.Screens.home

import androidx.lifecycle.ViewModel
import androidx.paging.ExperimentalPagingApi
import com.example.unsplashpaging3demo.domain.use_case.GetAllImagesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    getAllImagesUseCase: GetAllImagesUseCase
): ViewModel() {

    val getAllImages = getAllImagesUseCase()
}