package com.codingwithrufat.model

import kotlinx.serialization.Serializable

@Serializable
data class User(
    val userId: Int,
    val name: String,
    val surname: String,
    val job: String
)
