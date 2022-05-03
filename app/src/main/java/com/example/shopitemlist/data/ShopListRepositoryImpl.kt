package com.example.shopitemlist.data

import com.example.shopitemlist.domain.ShopItem
import com.example.shopitemlist.domain.ShopListRepository
import java.lang.RuntimeException

object ShopListRepositoryImpl : ShopListRepository {

    private val shopList = mutableListOf<ShopItem>()

    private var autoIncrementId = 0

    override fun addShopList(shopItem: ShopItem) {
        if (shopItem.id == ShopItem.UNDEFINED_ID)
            shopItem.id = autoIncrementId++

        shopList.add(shopItem)
    }

    override fun deleteShopListById(shopItem: ShopItem) {
        shopList.remove(shopItem)
    }

    override fun editShopList(shopItem: ShopItem) {
        val oldElement = getShopItem(shopItem.id)
        shopList.remove(oldElement)
        addShopList(shopItem)
    }

    override fun getShopItem(shopItem: Int): ShopItem {
        return shopList.find { it.id == shopItem }
            ?: throw  RuntimeException("Element with id $shopItem not found")
    }

    override fun getShopList(): List<ShopItem> {
        return shopList.toMutableList()
    }
}