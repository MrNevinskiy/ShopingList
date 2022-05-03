package com.example.shopitemlist.domain

class GetShopListUseCase(private val shopListRepository:ShopListRepository) {

    fun getShopList(): List<ShopItem> {
       return shopListRepository.getShopList()
    }

}