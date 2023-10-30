package com.infnet.petlove.model

data class Institution(
    val id: Int,
    val name: String,
    val address: String,
    val phone: String,
    val pets: List<Pet>
)
