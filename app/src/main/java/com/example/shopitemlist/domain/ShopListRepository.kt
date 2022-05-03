package com.example.shopitemlist.domain

import androidx.lifecycle.LiveData

interface ShopListRepository {

    fun addShopList(shopItem: ShopItem)

    fun deleteShopListById(shopItem: ShopItem)

    fun editShopList(shopItem: ShopItem)

    fun getShopItem(shopItem: Int): ShopItem

    fun getShopList(): LiveData<List<ShopItem>>
}