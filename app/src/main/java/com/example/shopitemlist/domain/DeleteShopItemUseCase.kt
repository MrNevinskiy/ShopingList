package com.example.shopitemlist.domain

class DeleteShopItemUseCase(private val shopListRepository:ShopListRepository) {

    fun deleteShopListById(shopItem: ShopItem){
        shopListRepository.deleteShopListById(shopItem)
    }
}