package com.example.shopitemlist.domain

interface ShopListRepository {

    fun addShopList(shopItem: ShopItem)

    fun deleteShopListById(shopItem: ShopItem)

    fun editShopList(shopItem: ShopItem)

    fun getShopItem(shopItem: Int): ShopItem

    fun getShopList(): List<ShopItem>
}