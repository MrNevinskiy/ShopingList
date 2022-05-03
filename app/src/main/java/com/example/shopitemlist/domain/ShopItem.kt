package com.example.shopitemlist.domain

data class ShopItem(
    val name: String,
    val count: Double,
    val enable: Boolean,
    var id: Int = UNDEFINED_ID
) {
    companion object {
        const val UNDEFINED_ID = -1
    }
}