package com.example.unsplashpaging3demo.domain.use_case

import com.example.unsplashpaging3demo.domain.repo.UnsplashRepository
import javax.inject.Inject

class GetAllImagesUseCase @Inject constructor(private val repository: UnsplashRepository) {

    operator fun invoke() = repository.getAllImages()
}