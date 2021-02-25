package com.example.androiddevchallenge.data

import androidx.annotation.DrawableRes

data class PuppyInfo(
    @DrawableRes
    val imageResourceId: Int,
    val name: String,
    val breed: String
)
