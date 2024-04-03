package com.advweek6160420071.model

data class Motorcycle(
    val id: String?,
    val name: String?,
    val brand: String?,
    val year: String?,
    val engineDisplacementCc: String,
    val colors: List<String>,
    val specs: Specs,
    val images: String?
)

data class Specs(
    val topSpeedMph: String,
    val fuelCapacityGallons: String,
    val weightLbs: String
)
