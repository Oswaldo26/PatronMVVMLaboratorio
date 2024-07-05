package com.example.patronmvvm.model

import androidx.annotation.DrawableRes

data class Painting (
    val id: Int,
    val title: String,
    val artist: String,
    @DrawableRes val imageRes: Int
)