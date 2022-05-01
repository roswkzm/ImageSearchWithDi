package com.example.imagesearchwithdi.api

import com.example.imagesearchwithdi.data.UnsplashPhoto

data class UnsplashResponse(
    val results : List<UnsplashPhoto>
)