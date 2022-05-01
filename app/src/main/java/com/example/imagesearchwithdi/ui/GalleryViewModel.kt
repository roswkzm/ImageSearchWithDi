package com.example.imagesearchwithdi.ui

import androidx.lifecycle.ViewModel
import com.example.imagesearchwithdi.data.UnsplashRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class GalleryViewModel @Inject constructor(private val unsplashRepository: UnsplashRepository) : ViewModel() {
}