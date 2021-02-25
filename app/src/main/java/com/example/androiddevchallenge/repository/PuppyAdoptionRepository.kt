package com.example.androiddevchallenge.repository

import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.PuppyInfo

object PuppyAdoptionRepository {
    fun getPuppies() = listOf(
        PuppyInfo(
            imageResourceId = R.drawable.ic_husky,
            name = "Max",
            breed = "Siberian Husky"
        ),
        PuppyInfo(
            imageResourceId = R.drawable.ic_golden_retriever,
            name = "Charlie",
            breed = "Golden Retriever"
        ),
        PuppyInfo(
            imageResourceId = R.drawable.ic_poodles,
            name = "Cooper",
            breed = "Poodles"
        ),
        PuppyInfo(
            imageResourceId = R.drawable.ic_labrador,
            name = "Buddy",
            breed = "Labrador"
        ),
        PuppyInfo(
            imageResourceId = R.drawable.ic_french_bulldog,
            name = "Jack",
            breed = "French Bulldog"
        ),
        PuppyInfo(
            imageResourceId = R.drawable.ic_terrier,
            name = "Rocky",
            breed = "American Hairless Terrier"
        ),
        PuppyInfo(
            imageResourceId = R.drawable.ic_cane_corso,
            name = "Duke",
            breed = "Cane Corso"
        ),
        PuppyInfo(
            imageResourceId = R.drawable.ic_pomeranian,
            name = "Bear",
            breed = "Pomeranian"
        )
    )
}